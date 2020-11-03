package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelo.Ficha;
import modelo.Jugador;
import modelo.Tablero;
import vista.FrmJuego;

public class CtrlJuego implements ActionListener{
	private FrmJuego vista;
	private Jugador j1;
	private Jugador j2;
	private Tablero tbro;
	private Ficha ficha;
	
	public CtrlJuego(FrmJuego vista, Jugador j1, Jugador j2, Ficha ficha, Tablero tbro) {
		//Emparejo los objetos que recibo por parametro
		this.vista=vista;
		this.j1=j1;
		this.j2=j2;
		this.ficha=ficha;
		this.tbro=tbro;
		
		//Agrego los componentes de la vista para poder interactuar
		this.vista.getRegistro().getRdbHumanos().addActionListener(this);
		this.vista.getRegistro().getRdbComputadora().addActionListener(this);
		this.vista.getRegistro().getBtnComenzar().addActionListener(this);
		
		this.vista.getTablero().getBtnPos1().addActionListener(this);
		this.vista.getTablero().getBtnPos2().addActionListener(this);
		this.vista.getTablero().getBtnPos3().addActionListener(this);
		this.vista.getTablero().getBtnPos4().addActionListener(this);
		this.vista.getTablero().getBtnPos5().addActionListener(this);
		this.vista.getTablero().getBtnPos6().addActionListener(this);
		this.vista.getTablero().getBtnPos7().addActionListener(this);
		this.vista.getTablero().getBtnPos8().addActionListener(this);
		this.vista.getTablero().getBtnPos9().addActionListener(this);
		this.vista.getTablero().getBtnReiniciar().addActionListener(this);
	}
	
	public void iniciar() {
		//Le asigno valores a la ventana del juego
		vista.setTitle("TaTeTi - Version 0.001"); //Le pongo titulo
		vista.setLocationRelativeTo(null); //Lo centro en la pantalla
		vista.setVisible(true); //Lo hago visible
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		boolean rdb=true;
		//Verifico que radiobutton esta seleccionado y muestro o no la caja de texto del jugador 2
		if(vista.getRegistro().getRdbComputadora().isSelected()) {
			vista.getRegistro().getTxtJ2().setEnabled(false);
			rdb=false;
		}else {
			vista.getRegistro().getTxtJ2().setEnabled(true);
			rdb=true;
		}
		
		if(e.getSource()==vista.getRegistro().getBtnComenzar()) {
			jugadorUno();
			jugadorDos(rdb);
			
			if(!(j1.getNombre().isEmpty()||j2.getNombre().isEmpty())) mostrarTablero();
			else JOptionPane.showMessageDialog(null, "Pon tu nombre!");
		}
		
		//Componentes del tablero
		int pf, pc;
		if(vista.getTablero().isVisible()) { //Verifico el boton que se presiona y si no contiene texto llamo al metodo asignarFicha
			if(e.getSource()==vista.getTablero().getBtnPos1() && vista.getTablero().getBtnPos1().getText().isEmpty()) {
				vista.getTablero().getBtnPos1().setText(turno());
				asignarFicha(0,0);
			}
			if(e.getSource()==vista.getTablero().getBtnPos2() && vista.getTablero().getBtnPos2().getText().isEmpty()) {
				vista.getTablero().getBtnPos2().setText(turno());
				asignarFicha(0,1);
			}
			if(e.getSource()==vista.getTablero().getBtnPos3() && vista.getTablero().getBtnPos3().getText().isEmpty()) {
				vista.getTablero().getBtnPos3().setText(turno());
				asignarFicha(0,2);
			}
			if(e.getSource()==vista.getTablero().getBtnPos4() && vista.getTablero().getBtnPos4().getText().isEmpty()) {
				vista.getTablero().getBtnPos4().setText(turno());
				asignarFicha(1,0);
			}
			if(e.getSource()==vista.getTablero().getBtnPos5() && vista.getTablero().getBtnPos5().getText().isEmpty()) {
				vista.getTablero().getBtnPos5().setText(turno());
				asignarFicha(1,1);
			}
			if(e.getSource()==vista.getTablero().getBtnPos6() && vista.getTablero().getBtnPos6().getText().isEmpty()) {
				vista.getTablero().getBtnPos6().setText(turno());
				asignarFicha(1,2);
			}
			if(e.getSource()==vista.getTablero().getBtnPos7() && vista.getTablero().getBtnPos7().getText().isEmpty()) {
				vista.getTablero().getBtnPos7().setText(turno());
				asignarFicha(2,0);
			}
			if(e.getSource()==vista.getTablero().getBtnPos8() && vista.getTablero().getBtnPos8().getText().isEmpty()) {
				vista.getTablero().getBtnPos8().setText(turno());
				asignarFicha(2,1);
			}
			if(e.getSource()==vista.getTablero().getBtnPos9() && vista.getTablero().getBtnPos9().getText().isEmpty()) {
				vista.getTablero().getBtnPos9().setText(turno());
				asignarFicha(2,2);
			}
			if(e.getSource()==vista.getTablero().getBtnReiniciar()) {
				limpiar();
			}
			
		}
	}
	
	public void jugadorUno() {
		//Cuando se presiona el boton comenzar asigno los valores
		j1.setNombre(vista.getRegistro().getTxtJ1().getText());
	}
	
	public void jugadorDos(boolean rdb){
		//Si juegan dos jugadores al Jugador 2 le asigno el texto de la caja
		if(rdb)	j2.setNombre(vista.getRegistro().getTxtJ2().getText());
		//Si juegan contra la computadora al Jugador 2 le asigno un valor predefinido
		else	j2.setNombre("Maquina");
	}
	
	public void mostrarTablero(){
		vista.getContentPane().add(vista.getTablero());
		vista.getTablero().getLblNombreJ1().setText(j1.getNombre());
		vista.getTablero().getLblNombreJ2().setText(j2.getNombre());
		vista.getRegistro().setVisible(false);
		vista.getTablero().setVisible(true);
	}
	
	public String turno() {
		if(ficha.getFicha()) return "X";
		else return "O";
	}
	
	public void asignarFicha(int pf,int pc) {
		tbro.colocarFicha(pf, pc, turno());
		actualizar();
		if(j2.getNombre().equals("Maquina")) maquina();
	}
	
	public void actualizar() {
		switch(tbro.verificarGanador()) {
		case 1:
			mostrarResultado(1);
			break;
		case 2:
			mostrarResultado(2);
			break;
			default:
				mostrarResultado(0);
				ficha.cambiarTurno();
		};
	}
	
	public void mostrarResultado(int resultado) {
		if(resultado==1) {
			if(ficha.getFicha()) {
				JOptionPane.showMessageDialog(null, j1.getNombre()+" ha ganado!");
			}else{
				JOptionPane.showMessageDialog(null, j2.getNombre()+" ha ganado!");
			}
			limpiar();
		}
		if(resultado==2) {
			JOptionPane.showMessageDialog(null, j1.getNombre()+" y "+j2.getNombre()+" han empatado");
			limpiar();
		}
	}
	public void maquina(){
		switch(tbro.jugadaMaquina()) {
		case 1:
			vista.getTablero().getBtnPos1().setText(turno());
		break;
		case 2:
			vista.getTablero().getBtnPos2().setText(turno()); 
		break;
		case 3:
			vista.getTablero().getBtnPos3().setText(turno());  
		break;
		case 4:
			vista.getTablero().getBtnPos4().setText(turno());	
		break;
		case 5:
			vista.getTablero().getBtnPos5().setText(turno());    
		break;
		case 6:
			vista.getTablero().getBtnPos6().setText(turno());	  
		break;
		case 7:
			vista.getTablero().getBtnPos7().setText(turno());		
		break;
		case 8:
			vista.getTablero().getBtnPos8().setText(turno());	    
		break;
		case 9:
			vista.getTablero().getBtnPos9().setText(turno());		  
		break;
		};
		actualizar();
	}
	
	public void limpiar() {
		vista.getTablero().getBtnPos1().setText("");	
		vista.getTablero().getBtnPos2().setText(""); 	
		vista.getTablero().getBtnPos3().setText("");	
		vista.getTablero().getBtnPos4().setText("");	
		vista.getTablero().getBtnPos5().setText("");
		vista.getTablero().getBtnPos6().setText("");	
		vista.getTablero().getBtnPos7().setText("");	
		vista.getTablero().getBtnPos8().setText("");	
		vista.getTablero().getBtnPos9().setText("");
		
		String[][] tablero = {
				{"a","b","c"},
				{"b","e","a"},
				{"d","a","f"}
		};
		tbro.setTablero(tablero);
		
		Integer[][] tableroAuxiliar= {
				{1,0,1},
				{0,1,0},
				{1,0,1}
			};
		tbro.setTableroAuxiliar(tableroAuxiliar );
	}
}
package vista;

import javax.swing.JPanel;
import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class PnlRegistro extends JPanel {
	private JButton btnComenzar;
	private JTextField txtJ1;
	private JTextField txtJ2;
	private JRadioButton rdbHumanos;
	private JRadioButton rdbComputadora;
	private ButtonGroup opciones;
	
	/**
	 * Create the panel.
	 */
	public PnlRegistro() {
		setBackground(Color.WHITE);
		setBounds(0, 0, 740, 500);
		setLayout(null);
		
		btnComenzar = new JButton("Comenzar");
		btnComenzar.setForeground(Color.DARK_GRAY);
		btnComenzar.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnComenzar.setBounds(436, 347, 167, 37);
		add(btnComenzar);
		
		txtJ1 = new JTextField();
		txtJ1.setBounds(436, 214, 167, 32);
		add(txtJ1);
		txtJ1.setColumns(10);
		
		txtJ2 = new JTextField();
		txtJ2.setBounds(436, 288, 167, 32);
		add(txtJ2);
		txtJ2.setColumns(10);
		
		rdbHumanos = new JRadioButton("Jug1 vs Jug2");
		rdbHumanos.setSelected(true);
		rdbHumanos.setBackground(Color.WHITE);
		rdbHumanos.setBounds(141, 258, 127, 25);
		add(rdbHumanos);
		
		rdbComputadora = new JRadioButton("vs Computadora");
		rdbComputadora.setBackground(Color.WHITE);
		rdbComputadora.setBounds(141, 304, 127, 25);
		add(rdbComputadora);
		
		opciones = new ButtonGroup();
		opciones.add(rdbHumanos);
		opciones.add(rdbComputadora);
		
		JLabel lblTateti = new JLabel("Ta Te Ti");
		lblTateti.setFont(new Font("Tahoma", Font.BOLD, 36));
		lblTateti.setForeground(Color.DARK_GRAY);
		lblTateti.setHorizontalAlignment(SwingConstants.CENTER);
		lblTateti.setBounds(250, 70, 213, 39);
		add(lblTateti);
		
		JLabel lblJugador1 = new JLabel("Nombre Jugador 1");
		lblJugador1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblJugador1.setHorizontalAlignment(SwingConstants.CENTER);
		lblJugador1.setBounds(436, 185, 167, 16);
		add(lblJugador1);
		
		JLabel lblJ2 = new JLabel("Nombre Jugador 2");
		lblJ2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblJ2.setHorizontalAlignment(SwingConstants.CENTER);
		lblJ2.setBounds(436, 259, 167, 16);
		add(lblJ2);
		
		JLabel lblOpcion = new JLabel("Elige una opcion!");
		lblOpcion.setForeground(Color.RED);
		lblOpcion.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblOpcion.setBounds(141, 214, 167, 35);
		add(lblOpcion);
	}

	public JButton getBtnComenzar() {
		return btnComenzar;
	}
	public void setBtnComenzar(JButton btnComenzar) {
		this.btnComenzar = btnComenzar;
	}
	public JTextField getTxtJ1() {
		return txtJ1;
	}
	public void setTxtJ1(JTextField txtJ1) {
		this.txtJ1 = txtJ1;
	}
	public JTextField getTxtJ2() {
		return txtJ2;
	}
	public void setTxtJ2(JTextField txtJ2) {
		this.txtJ2 = txtJ2;
	}
	public JRadioButton getRdbHumanos() {
		return rdbHumanos;
	}
	public void setRdbHumanos(JRadioButton rdbHumanos) {
		this.rdbHumanos = rdbHumanos;
	}
	public JRadioButton getRdbComputadora() {
		return rdbComputadora;
	}
	public void setRdbComputadora(JRadioButton rdbComputadora) {
		this.rdbComputadora = rdbComputadora;
	}
	public ButtonGroup getOpciones() {
		return opciones;
	}
	public void setOpciones(ButtonGroup opciones) {
		this.opciones = opciones;
	}
}

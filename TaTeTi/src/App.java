import controlador.CtrlJuego;
import modelo.Ficha;
import modelo.Jugador;
import modelo.Tablero;
import vista.FrmJuego;

public class App {
	
	public static void main(String[] args) {
		Jugador j1 = new Jugador(); //Creo los Jugadores y la ficha.
		Jugador j2 = new Jugador();
		Ficha ficha=new Ficha();
		Tablero tbro = new Tablero(); //Creo el tablero
		FrmJuego vista = new FrmJuego(); //Creo el frame de la vista
		CtrlJuego ctrl = new CtrlJuego(vista, j1, j2, ficha, tbro); //Envio los ojetos al controlador
		ctrl.iniciar(); //Inicio el frame
	}
}
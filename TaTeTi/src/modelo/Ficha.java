package modelo;

public class Ficha {
	
	Boolean ficha=true;
	
	public Ficha() {
		
	}

	public Boolean getFicha() {
		return ficha;
	}

	public void setFicha(Boolean ficha) {
		this.ficha = ficha;
	}
	
	public void cambiarTurno(){
		this.ficha=ficha;
		ficha=!ficha;
	}
}

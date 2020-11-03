package modelo;

public class Tablero {
	private String [][] tablero;
	private Integer [][] tableroAuxiliar;
	
	public Tablero() {
		tablero = new String [3][3];
		String[][] tablero = {
				{"a","b","c"},
				{"b","e","a"},
				{"d","a","f"}
		};
		setTablero(tablero);
		
		tableroAuxiliar = new Integer [3][3];
		//Tablero auxiliar para la jugada de la Maquina.
		Integer[][] tableroAuxiliar = {
				{1,0,1},
				{0,1,0},
				{1,0,1}
			};
		setTableroAuxiliar(tableroAuxiliar);
	}

	public String[][] getTablero() {
		return tablero;
	}

	public void setTablero(String[][] tablero) {
		this.tablero = tablero;
	}
	
	public Integer[][] getTableroAuxiliar() {
		return tableroAuxiliar;
	}

	public void setTableroAuxiliar(Integer[][] tableroAuxiliar) {
		this.tableroAuxiliar = tableroAuxiliar;
	}

	public void colocarFicha(int pf, int pc, String ficha) {
		this.tablero[pf][pc]=ficha;
		this.tableroAuxiliar[pf][pc]=-1;
	}
	
	public int jugadaMaquina() {
		boolean bandera=false;
		int opcion=0;
		int posicion=0;

		//Si esta libre el centro
		if(tableroAuxiliar[1][1].equals(1)) {
			colocarFicha(1,1, "O");
			posicion=5;
			tableroAuxiliar[1][1]=-1;
		}else {
			opcion=1;
		}
		//Si hay casilleros vacios en las esquinas
		if(opcion==1) {
			if(tableroAuxiliar[0][0].equals(1)&&!bandera) {
				posicion=1;
				tableroAuxiliar[0][0]=-1;
				colocarFicha(0,0, "O");
				bandera=!bandera;
			}
			if(tableroAuxiliar[0][2].equals(1)&&!bandera) {
				posicion=3;
				tableroAuxiliar[0][2]=-1;
				colocarFicha(0,2, "O");
				bandera=!bandera;
			}
			if(tableroAuxiliar[2][0].equals(1)&&!bandera) {
				posicion=7;
				tableroAuxiliar[2][0]=-1;
				colocarFicha(2,0, "O");
				bandera=!bandera;
			}
			if(tableroAuxiliar[2][2].equals(1)&&!bandera) {
				posicion=9;
				tableroAuxiliar[2][2]=-1;
				colocarFicha(2,0, "O");
				bandera=!bandera;
			}
		}

		if(tableroAuxiliar[0][0].equals(-1) 
				&& tableroAuxiliar[0][2].equals(-1) 
				&& tableroAuxiliar[2][0].equals(-1) 
				&&tableroAuxiliar[2][2].equals(-1)){
			opcion=2;
		}

		//Cuando lo anterior esta ocupado
		if(opcion==2&&!bandera) {
			if(tableroAuxiliar[0][1].equals(0)) {
				posicion=2;
				tableroAuxiliar[0][1]=-1;
				colocarFicha(0,1, "O");
				bandera=!bandera;
			}
			if(tableroAuxiliar[1][0].equals(0)) {
				posicion=4;
				tableroAuxiliar[1][0]=-1;
				colocarFicha(1,0, "O");
				bandera=!bandera;
			}
			if(tableroAuxiliar[1][2].equals(0)) {
				posicion=6;
				tableroAuxiliar[1][2]=-1;
				colocarFicha(1,2, "O");
				bandera=!bandera;
			}
			if(tableroAuxiliar[2][1].equals(0)) {
				posicion=8;
				tableroAuxiliar[2][1]=-1;
				colocarFicha(2,1, "O");
				bandera=!bandera;
			}
		}
		return posicion;
	}

	public int verificarGanador() {
		int resultado=0;
		//Verificar horizontalmente
		for(int i=0;i<tablero.length;i++) {
			if(tablero[i][0].equals(tablero[i][1])
					&& tablero[i][1].equals(tablero[i][2])
					&& tablero[i][0].equals(tablero[i][2])
					)	resultado=1;
		}
		//Verificar verticalmente
		if(resultado==0) {
			for(int i=0;i<tablero.length;i++) {
				if(tablero[0][i].equals(tablero[1][i])
					&&tablero[1][i].equals(tablero[2][i])
					&&tablero[0][i].equals(tablero[2][i])
					) resultado=1;
			}
		}
		//Si hay una ficha en el centro-> verificar las diagonales
		if(resultado==0) {
			if(tablero[0][0].equals(tablero[1][1])
				&&tablero[1][1].equals(tablero[2][2])
				&&tablero[0][0].equals(tablero[2][2])
				) resultado=1;
			else if(tablero[0][2]==tablero[1][1]
					&&tablero[1][1]==tablero[2][0]
					&&tablero[0][2].equals(tablero[2][0])
					) resultado=1;
		}
		if(resultado==0) {
			int empate=0;
			for(int i=0;i<tablero.length;i++) {
				for(int j=0;j<tablero.length;j++) {
					if(tablero[i][j].equals("X")||tablero[i][j].equals("O")) empate++;
				}
			}
			if(empate==9)	resultado=2;
		}
		return resultado;
	}
}

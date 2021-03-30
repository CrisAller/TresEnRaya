package TresEnRaya;

public class Tablero {
	
	private char[][] tablero;
	private final static char CASILLAS = 3;
	private final char VACIA = '_';
	
	public Tablero() {
		tablero = new char[CASILLAS][CASILLAS];
		for (int i=0; i<CASILLAS; i++) {
			for (int j=0; j<CASILLAS; j++) {
				tablero[i][j]= VACIA;
			}
		}
	}

	public void mostrar() {
		for (int i=0; i<CASILLAS; i++) {
			System.out.print("\n");
			for (int j=0; j<CASILLAS; j++) {
			System.out.print(tablero[i][j]+" ");
			}
		}
	}
	
	public void ponerFicha(char ficha) {
		Coordenada coordenada = Coordenada.elegirCoordenadas();
		while (tablero[coordenada.getFila()][coordenada.getColumna()] != VACIA) {
			System.out.print("Esa posición está ocupada, selecciona otra posición"+"\n");
			coordenada = Coordenada.elegirCoordenadas();
		}tablero[coordenada.getFila()][coordenada.getColumna()]= ficha;
	}
	
	public void recogerFicha(char ficha) {	
		Coordenada coordenada = Coordenada.elegirCoordenadas();
		while (tablero[coordenada.getFila()][coordenada.getColumna()] != ficha) {
			System.out.print("Esa posición está vacia o no tiene una ficha tuya para recoger"+"\n");
			coordenada = Coordenada.elegirCoordenadas();
		}tablero[coordenada.getFila()][coordenada.getColumna()]= VACIA;
		this.mostrar();
		System.out.print("\n");
	}
	
	public boolean fila() {
		if (tablero[0][0]!= VACIA &&tablero[0][0] ==tablero[0][1] && tablero[0][1]==tablero[0][2]){
			return true;
		}else if (tablero[1][0]!= VACIA &&tablero[1][0] ==tablero[1][1] && tablero[1][1]==tablero[1][2]){
			return true;
		}else if (tablero[2][0]!= VACIA &&tablero[2][0] ==tablero[2][1] && tablero[2][1]==tablero[2][2]){
			return true;
		}else return false;
	}
	public boolean columna() {
		if (tablero[0][0]!= VACIA &&tablero[0][0] ==tablero[1][0]&&tablero[1][0] ==tablero[2][0]) {
			return true;
		}else if (tablero[0][1]!= VACIA &&tablero[0][1] ==tablero[1][1]&&tablero[1][1] ==tablero[2][1]) {
			return true;
		}else if (tablero[0][2]!= VACIA &&tablero[0][2] ==tablero[1][2]&&tablero[1][2] ==tablero[2][2]) {
			return true;
		}else return false;
	}
	
	public boolean diagonal() {
		if (tablero[0][0]!= VACIA &&tablero[0][0]==tablero[2][2]&&tablero[2][2]==tablero[1][1]) {
			return true;
		}else if (tablero[0][2]!= VACIA &&tablero[0][2]==tablero[2][0]&&tablero[2][0]==tablero[1][1]) {
			return true;
		}else return false;
	}

	public boolean finJuego() {
		if (this.fila()) {
			return true;
		}else if(this.columna()) {
			return true;
		}else if(this.diagonal()) {
			return true;
		}else return false;
	}
	
	public boolean lleno(char ficha) {
		int puestas = 0;
		for (int i=0; i<CASILLAS; i++) {
			for (int j=0; j<CASILLAS; j++) {
				if(tablero[i][j]==ficha) {
					puestas++;
				}
			}
		}
		return puestas == 3;
	}

	
	
	
	
	
	public static void main(String[] arg) {
		Tablero tablero = new Tablero();
		tablero.ponerFicha('X');
		tablero.mostrar();
		tablero.ponerFicha('O');
		tablero.mostrar();
		tablero.ponerFicha('X');
		tablero.mostrar();
		tablero.ponerFicha('O');
		tablero.mostrar();
		//System.out.println(tablero[0][0]);

	}
	
	
	
	
	
}

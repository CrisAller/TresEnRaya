package TresEnRaya;

public class Coordenada {
	
	private int fila;
	private int columna;
	
	public Coordenada(int fila, int columna) {
		this.fila = fila;
		this.columna = columna;
	}
	public Coordenada(Coordenada coordenada) {
		this(coordenada.fila, coordenada.columna);
	}
	

	public static Coordenada elegirCoordenadas() {
		System.out.print("Elige FILA");
		int fila = new GestorIO().inInt();
		System.out.print("Elige COLUMNA");
		int columna = new GestorIO().inInt();
		return new Coordenada(fila-1, columna-1);
	}
	
	public int getFila() {
		return this.fila;
	}
	
	public int getColumna() {
		return this.columna;
	}

}

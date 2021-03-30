package TresEnRaya;

public class Jugador {
	
	private char ficha;
	private String nombre;
	
	public Jugador(String nombre, char ficha) {
		this.nombre = nombre;
		this.ficha = ficha;
	}
	
	public Jugador() {
		System.out.println("Elegir nombre:");
		nombre = new GestorIO().inString();
		this.elegirFicha();
	}
	
	public Jugador(Jugador jugador) {
		System.out.println("Elegir nombre:");
		nombre = new GestorIO().inString();
		if (jugador.ficha == 'X') {
			this.ficha = 'O';
		}else this.ficha ='X';
	}
	
	public char getFicha() {
		return this.ficha;
	}
	public String getNombre() {
		return this.nombre;
	}
	
	public String elegirNombre() {
		return " ";
	}
	
	public void elegirFicha() {
		System.out.println("Elige ficha X o O");
		ficha = new GestorIO().inChar();
		if (ficha == 'X') {
			this.ficha ='X';
		}else this.ficha = 'O';
	}

	public void ponerFicha(Tablero tablero) {
		System.out.print(this.nombre + " pone ficha "+this.ficha +"\n");
		tablero.ponerFicha(this.ficha);	
	}
	
	public void recogerFicha(Tablero tablero) {
		System.out.print(this.nombre + " recoge ficha "+this.ficha +"\n");
		tablero.recogerFicha(this.ficha);	
		this.ponerFicha(tablero);
	}

	
	public static void main(String[] arg) {
		Jugador jugador = new Jugador();
		
		new Tablero().mostrar();
	}

}

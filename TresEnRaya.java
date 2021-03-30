package TresEnRaya;

public class TresEnRaya {
	
	private Jugador[] jugador;
	private Turno turno;
	private Tablero tablero;
	private final static int NUMERO_JUGADORES = 2;

	
	public TresEnRaya() {
		jugador = new Jugador[NUMERO_JUGADORES];
		turno = new Turno();
		tablero = new Tablero();
		
	}
	
	public void jugadores() {
		tablero.mostrar();
		System.out.print("\n"+"\n");
		jugador[0] = new Jugador();
		jugador[1] = new Jugador(jugador[0]);
		
	}
	
	public void jugar() {
		this.jugadores();
		do {
			if (!tablero.lleno(jugador[turno.tocaTurno()].getFicha())) {
				jugador[turno.tocaTurno()].ponerFicha(tablero);
			}else jugador[turno.tocaTurno()].recogerFicha(tablero);
			turno.cambioTurno();
			tablero.mostrar();
			System.out.print("\n"+"\n");
		}while (!tablero.finJuego());
		turno.cambioTurno();
		System.out.println("Ganador "+jugador[turno.tocaTurno()].getNombre());
		
	}
	
	
	public static void main (String[] arg) {
		TresEnRaya iniciar = new TresEnRaya();
		iniciar.jugar();
	}
	
	
}

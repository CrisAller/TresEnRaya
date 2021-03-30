package TresEnRaya;

public class Turno {
	
	private int turno;
	
	
	public Turno() {
		turno = 0;
		
	}

	public int tocaTurno() {
		return turno;
	}

	public void cambioTurno() {
		if (turno == 0) {
			turno++;
		}else turno--;
	}

}

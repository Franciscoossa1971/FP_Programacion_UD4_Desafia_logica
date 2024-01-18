
public class Entrenamiento extends Avion {

	private boolean tieneDobleMando;

	public Entrenamiento() {
	}

	public Entrenamiento(int idAvion, String modAvion, int capAvion, Piloto piloto, boolean tieneDobleMando) {
		super(idAvion, modAvion, capAvion, piloto);
		this.tieneDobleMando = tieneDobleMando;
	}

	public boolean isTieneDobleMando() {
		return tieneDobleMando;
	}

	@Override
	public String mostrarAvion() {
		return "Identificador del Avión: " + idAvion + "\nModelo el Avión: " + modAvion + "\nCapacidad del Avión: "
				+ capAvion + "\nTiene Doble Mando: " + tieneDobleMando + "\nPiloto :\n" + piloto.mostrarPiloto();
	}

}

public class Combate extends Avion {

	private boolean esFurtivo;

	public Combate() {

	}

	public Combate(int idAvion, String modAvion, int capAvion, Piloto piloto, boolean esFurtivo) {
		super(idAvion, modAvion, capAvion, piloto);
		this.esFurtivo = esFurtivo;
	}

	public boolean isEsFurtivo() {
		return esFurtivo;
	}

	public void setEsFurtivo(boolean esFurtivo) {
		this.esFurtivo = esFurtivo;
	}

	@Override
	public String mostrarAvion() {
		return "Identificador del Avión: " + idAvion + "\nModelo el Avión: " + modAvion + "\nCapacidad del Avión: "
				+ capAvion + "\nEs furtivo: " + esFurtivo + "\nPiloto :\n" + piloto.mostrarPiloto();
	}

}

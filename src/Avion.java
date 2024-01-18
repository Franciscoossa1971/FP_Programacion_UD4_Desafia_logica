
public class Avion {

	protected int idAvion;
	protected String modAvion;
	protected int capAvion;
	protected Piloto piloto;

	public Avion() {

	}

	public Avion(int idAvion, String modAvion, int capAvion, Piloto piloto) {
		this.idAvion = idAvion;
		this.modAvion = modAvion;
		this.capAvion = capAvion;
		this.piloto = piloto;
	}

	public int getIdAvion() {
		return idAvion;
	}

	public void setIdAvion(int idAvion) {
		this.idAvion = idAvion;
	}

	public String getModAvion() {
		return modAvion;
	}

	public void setModAvion(String modAvion) {
		this.modAvion = modAvion;
	}

	public int getCapAvion() {
		return capAvion;
	}

	public void setCapAvion(int capAvion) {
		this.capAvion = capAvion;
	}

	public Piloto getPiloto() {
		return piloto;
	}

	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}

	public String mostrarAvion() {
		return "Identificador del Avión: " + idAvion + "\nModelo el Avión: " + modAvion + "\nCapacidad del Avión: "
				+ capAvion + "\nPiloto :\n" + piloto.mostrarPiloto();
	}

}

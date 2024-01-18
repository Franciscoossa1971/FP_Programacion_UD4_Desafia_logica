
public class Piloto {

	private int idPiloto;
	private String nomPiloto;
	private double horasVueloPiloto;
	private String rangoPiloto;

	public Piloto() {

	}

	public Piloto(int idPiloto, String nomPiloto, double horasVueloPiloto, String rangoPiloto) {
		this.idPiloto = idPiloto;
		this.nomPiloto = nomPiloto;
		this.horasVueloPiloto = horasVueloPiloto;
		this.rangoPiloto = rangoPiloto;
	}

	public int getIdPiloto() {
		return idPiloto;
	}

	public void setIdPiloto(int idPiloto) {
		this.idPiloto = idPiloto;
	}

	public String getNomPiloto() {
		return nomPiloto;
	}

	public void setNomPiloto(String nomPiloto) {
		this.nomPiloto = nomPiloto;
	}

	public double getHorasVueloPiloto() {
		return horasVueloPiloto;
	}

	public void setHorasVueloPiloto(double horasVueloPiloto) {
		this.horasVueloPiloto = horasVueloPiloto;
	}

	public String getRangoPiloto() {
		return rangoPiloto;
	}

	public void setRangoPiloto(String rangoPiloto) {
		this.rangoPiloto = rangoPiloto;
	}

	public String mostrarPiloto() {
		return "Identificador del piloto: " + idPiloto + "\nNombre del piloto: " + nomPiloto + "\nHoras de vuelo: "
				+ horasVueloPiloto + "\nRango del piloto: " + rangoPiloto;
	}
}
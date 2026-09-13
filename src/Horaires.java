public class Horaires {
	private String debut;
	private String fin;

	public Horaires(String debut, String fin) {
		this.debut = debut;
		this.fin = fin;
	}

	public String getPlage() {
		return this.debut + "–" + this.fin;
	}
}

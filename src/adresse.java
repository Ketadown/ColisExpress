public class adresse {
	String numero_voie;
	int code_postal;
	String ville;
	String pays;

	public adresse(String numero_voie, int code_postal, String ville, String pays){
		this.numero_voie = numero_voie;
		this.code_postal = code_postal;
		this.ville = ville;
		this.pays = pays;
	}

	public boolean estEnFrance() {
		return this.pays.equalsIgnoreCase("France");
	}
}









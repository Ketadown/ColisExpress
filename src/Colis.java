public class Colis {
	private int poids;
	private String nom;
	private Adresse Adresse;
	private Point_livraison pt_livraison;

	public Colis(int poids, String nom, Adresse adresse, Point_livraison pt_livraison){
		this.poids=poids;
		this.nom=nom;
		this.Adresse=adresse;
		this.pt_livraison = pt_livraison;

		this.pt_livraison.ajouterColis(this);

	}

	public double calculerPrix() {
		double prix;

		if (this.poids <= 500) {
			prix = 1.99;
		} else if (this.poids <= 2000) {
			prix = 3.99;
		} else if (this.poids <= 5000) {
			prix = 5.99;
		} else {
			prix = 8.99;
		}

		if (Adresse.estEnFrance() == false){

			prix = prix + 6.00;

		}

		return prix;
	}

	public String get_Nom(){
		return nom;
	}

}

import java.util.ArrayList;

public class Point_livraison {
	private String enseigne;
	private String nom_commercial;
	private Adresse adresse;
	private ArrayList<Colis> ListeColis = new ArrayList<Colis>();

	public Point_livraison(String enseigne, String nom_commercial, Adresse adresse){
		this.enseigne = enseigne;
		this.nom_commercial = nom_commercial;
		this.adresse = adresse;

	}

	public void ajouterColis(Colis ColisAAjouter){
		ListeColis.add(ColisAAjouter);
	}

	public double calculerRentabiité(){

		double somme = 0;

		for (Colis c : ListeColis) {
			somme += c.calculerPrix();
		}

		return somme;
	}

	public void prix_de_chaque_colis(){
		for(Colis c : ListeColis){
			System.out.println("Le prix du colis de "+c.get_Nom()+" est de "+c.calculerPrix()+"€.");
		}
		System.out.println("----");
	}


}

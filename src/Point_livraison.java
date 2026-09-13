import java.lang.reflect.Array;
import java.util.ArrayList;

public class Point_livraison {
	private String enseigne;
	private String nom_commercial;
	private Adresse adresse;
	private ArrayList<Colis> ListeColis = new ArrayList<Colis>();
	private ArrayList<Jours> ListeJours = new ArrayList<Jours>();



	public Point_livraison(String enseigne, String nom_commercial, Adresse adresse){
		this.enseigne = enseigne;
		this.nom_commercial = nom_commercial;
		this.adresse = adresse;

		String[] semaine = {"Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche"};
		for(String s : semaine) {
			this.ListeJours.add(new Jours(s));
		}

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

	public void Ajouterhoraires(String jour, String h_debut, String h_fin){
		for(Jours j : ListeJours){
			if(j.get_Nom().equalsIgnoreCase(jour)){
				j.AjouterHoraires(new Horaires(h_debut,h_fin));
			}
		}
	}

	public void Afficherhoraires(){
		for(Jours j : ListeJours){
			System.out.println(j.get_Nom()+" : ");

			if(j.ListeHoraires.isEmpty()){
				System.out.println("Aucune horaires renseingé.");
			}

			else {
				for(Horaires h : j.ListeHoraires){
					System.out.print(h.getPlage()+" ");

				}
				System.out.println();
			}
		}
	}
}

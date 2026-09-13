public class Main {
	public static void main(String[] args) {

		//Création 2 adresses pour les 2 point de livraison.

		Adresse a1 = new Adresse("1 rue des cramés",31000,"Toulouse","France");
		Adresse a2 = new Adresse("33 rue des historiens",94000,"Berlin","Allemagne");

		//Création des 2 popints de livraison.

		Point_livraison p1 = new Point_livraison("Mondial Relay","Mondial Relay Locker",a1);
		Point_livraison p2 = new Point_livraison("UPS","Centre UPS",a2);

		//Création des 4 colis + Test méthode ajouterColis().

		Colis c1 = new Colis(900,"ALI HASSAN Karar",a2,p1);
		Colis c2 = new Colis(700,"GONG Xiangtian",a2,p1);
		Colis c3 = new Colis(300,"COELHO Nathan",a1,p2);
		Colis c4 = new Colis(500,"YAGAMI Light",a1,p2);

		//Tests des fonctionnalités restantes.

		System.out.println("-Calcul de la rentabilité : ");
		System.out.println("Rentabilité du P1 : "+p1.calculerRentabiité());
		System.out.println("Rentabilité du P2 : "+p2.calculerRentabiité());

		System.out.println("-Calcul du prix de chaque colis :");
		p1.prix_de_chaque_colis();
		p2.prix_de_chaque_colis();

		//Tests des horaires.

		p1.Ajouterhoraires("Lundi","10:00","12:00");
		p1.Ajouterhoraires("Lundi","14:00","19:00");

		p1.Afficherhoraires();




	}
}

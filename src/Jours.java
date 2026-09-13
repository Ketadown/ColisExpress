import java.util.ArrayList;

public class Jours {
	String jour;
	ArrayList<Horaires>ListeHoraires = new ArrayList<>();

	public Jours(String Jour){
		this.jour=Jour;
	}

	public void AjouterHoraires(Horaires h){
		ListeHoraires.add(h);
	}

	public String get_Nom(){
		return jour;
	}

	public ArrayList<Horaires> get_Horaires(){
		return ListeHoraires;
	}
}

package metier;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EtudiantImpl e=new EtudiantImpl();

		List<Etudiant>

		etudiants=e.Chercher_Etudiant("h");
		for(Etudiant ee:etudiants)
		System.out.println(ee.getNom());
	}

}

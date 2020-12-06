package web;
import java.util.ArrayList;
import java.util.List;

import metier.Etudiant;

public class EtudiantModele {
	private String mot;
	private List<Etudiant> etudiants= new
	ArrayList<>();
	public String getMot() {
	return mot;
	}
	public void setMot(String mot) {
	this.mot = mot;
	}
	public List<Etudiant> getEtudiants() {
	return etudiants;
	}
	public void setEtudiants(List<Etudiant>etudiants) {

	this.etudiants = etudiants;
	}
	
}

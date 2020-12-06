package metier;


public class Etudiant {
	
	private int id;
	private String nom;
	private String prenom;
	
	public int getID() {return id;}
	public void setID(int id) {this.id=id;}
	public String getNom() {return nom;}
	public void setNom (String nom) {this.nom=nom;}
	public String getPrenom() {return prenom;}
	public void setPrenom (String prenom) {this.prenom=prenom;}
	
	public Etudiant(String nom, String prenom) {
		this.nom=nom;
		this.prenom=prenom;
	}
}

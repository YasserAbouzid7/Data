package ma.jit.comSpring.entities;

public class Employe {
	private int id;
	private String nom;
	private double salaire;
	private String email;
	
	
	public Employe(String nom, double salaire, String email) {
		super();
		this.nom = nom;
		this.salaire = salaire;
		this.email = email;
	}


	public Employe(int id, String nom, double salaire, String email) {
		super();
		this.id = id;
		this.nom = nom;
		this.salaire = salaire;
		this.email = email;
	}


	public Employe() {
		super();
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public double getSalaire() {
		return salaire;
	}


	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "Employe [id=" + id + ", nom=" + nom + ", salaire=" + salaire + ", email=" + email + "]";
	}
	
	
	

}

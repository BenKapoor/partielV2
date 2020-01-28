package eu.ensup.gestionEleveV2.domaine;

import javax.persistence.Entity;



@Entity
//@DiscriminatorValue("PROF") avec la méthode TABLE PER CLASS
public class Enseignant extends Personne {

	private String matiere;

	public Enseignant() {
		// TODO Auto-generated constructor stub
	}

	public Enseignant(String matiere) {
		super();
		this.matiere = matiere;
	}

	

	public Enseignant(int id, String nom, String prenom, String mail, String adresse, int telephone) {
		super(id, nom, prenom, mail, adresse, telephone);
	}

	public Enseignant(int id, String nom, String prenom, String mail, String adresse, int telephone, String matiere) {
		super(id, nom, prenom, mail, adresse, telephone);
		this.matiere = matiere;
	}

	@Override
	public String toString() {
		return "Enseignant [matiere=" + matiere + "]";
	}

	public String getMatiere() {
		return matiere;
	}

	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}

}

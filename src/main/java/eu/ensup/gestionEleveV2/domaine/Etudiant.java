package eu.ensup.gestionEleveV2.domaine;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;


@Entity
//@DiscriminatorValue("ELEVE") avec la méthode TABLE PER CLASS
public class Etudiant extends Personne {
	private String dateNaissance;
	@ManyToOne
	private Cours cours;

	public Etudiant() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Etudiant [dateNaissance=" + dateNaissance + ", cours=" + cours + "]";
	}

	public String getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public Cours getCours() {
		return cours;
	}

	public void setCours(Cours cours) {
		this.cours = cours;
	}

	public Etudiant(int id, String nom, String prenom, String mail, String adresse, int telephone, String dateNaissance,
			Cours cours) {
		super(id, nom, prenom, mail, adresse, telephone);
		this.dateNaissance = dateNaissance;
		this.cours = cours;
	}

	public Etudiant(int id, String nom, String prenom, String mail, String adresse, int telephone,
			String dateNaissance) {
		super(id, nom, prenom, mail, adresse, telephone);
		this.dateNaissance = dateNaissance;
	}
	
}


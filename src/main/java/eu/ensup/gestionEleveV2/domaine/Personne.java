package eu.ensup.gestionEleveV2.domaine;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity


@Inheritance(strategy = InheritanceType.JOINED)
public class Personne implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private int id;
	private String nom;
	private String prenom;
	private String mail;
	private String adresse;
	private int telephone;
	
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
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public int getTelephone() {
		return telephone;
	}
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	@Override
	public String toString() {
		return "Personne [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", mail=" + mail + ", adresse=" + adresse
				+ ", telephone=" + telephone + "]";
	}
	public Personne(int id, String nom, String prenom, String mail, String adresse, int telephone) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.adresse = adresse;
		this.telephone = telephone;
	}
	public Personne() {
		super();
	}

}

package eu.ensup.gestionEleveV2.service;

import java.util.List;

import eu.ensup.gestionEleveV2.dao.LoginDao;
import eu.ensup.gestionEleveV2.domaine.Personne;

public class AuthentificationService {

	/**
	 * Service de connection/ Authentification de l'utilisateur
	 * @param mail
	 * @param nom
	 * @return
	 */
	public List<Personne> connection(String mail, String nom) {
		LoginDao dao = new LoginDao();
		return dao.login(mail, nom);
	}
}

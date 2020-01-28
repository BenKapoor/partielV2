package eu.ensup.gestionEleveV2.service;

import eu.ensup.gestionEleveV2.dao.LoginDao;

public class AuthentificationService {

	/**
	 * Service de connection/ Authentification de l'utilisateur
	 * @param mail
	 * @param nom
	 * @return
	 */
	public boolean connection(String mail, String nom) {
		LoginDao dao = new LoginDao();
		return dao.login(mail, nom);
	}
}

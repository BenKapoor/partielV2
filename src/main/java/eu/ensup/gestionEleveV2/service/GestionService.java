package eu.ensup.gestionEleveV2.service;

import java.util.List;

import eu.ensup.gestionEleveV2.dao.GestionDao;
import eu.ensup.gestionEleveV2.dao.IGestionDao;
import eu.ensup.gestionEleveV2.domaine.Cours;
import eu.ensup.gestionEleveV2.domaine.Etudiant;

/**
 * @author benja
 *	Service de la gestion des étudiants
 */
public class GestionService implements IGestionService{
	private IGestionDao dao = new GestionDao();
	
	/* (non-Javadoc)
	 * @see eu.ensup.gestioneleve.service.IGestionService#listerEtudiants()
	 */
	public List<Etudiant> listerEtudiants() {
		// TODO Auto-generated method stub
		return dao.listerEtudiants();
	}

	/* (non-Javadoc)
	 * @see eu.ensup.gestioneleve.service.IGestionService#creerEtudiant(eu.ensup.gestionEleve.domaine.Etudiant)
	 */
	public int creerEtudiant(Etudiant etu) {
		// TODO Auto-generated method stub
		return dao.creerEtudiant(etu);
	}

	/* (non-Javadoc)
	 * @see eu.ensup.gestioneleve.service.IGestionService#modifierEtudiant(eu.ensup.gestionEleve.domaine.Etudiant)
	 */
	public int modifierEtudiant(Etudiant etu) {
		// TODO Auto-generated method stub
		return dao.modifierEtudiant(etu);
	}

	/* (non-Javadoc)
	 * @see eu.ensup.gestioneleve.service.IGestionService#supprimerEtudiant(int)
	 */
	public int supprimerEtudiant(int idEtudiant) {
		// TODO Auto-generated method stub
		return dao.supprimerEtudiant(idEtudiant);
	}

	/* (non-Javadoc)
	 * @see eu.ensup.gestioneleve.service.IGestionService#lireInfoEtudiant(int)
	 */
	public Etudiant lireInfoEtudiant(int idEtudiant) {
		// TODO Auto-generated method stub
		return dao.lireInfoEtudiant(idEtudiant);
	}

	/* (non-Javadoc)
	 * @see eu.ensup.gestioneleve.service.IGestionService#ajouterEtudiantCours(eu.ensup.gestionEleve.domaine.Etudiant, eu.ensup.gestionEleve.domaine.Cours)
	 */
	public int ajouterEtudiantCours(Etudiant etu, Cours c) {
		// TODO Auto-generated method stub
		return dao.ajouterEtudiantCours(etu, c);
	}

}

package eu.ensup.gestionEleveV2.dao;

import java.util.List;

import eu.ensup.gestionEleveV2.domaine.Cours;
import eu.ensup.gestionEleveV2.domaine.Etudiant;



/**
 * @author benja
 *	Interface du controller de la gestion des étudiants
 *	Elle comprends toutes les méthodes obligatoire du DAO
 */
public interface IGestionDao {
	/**
	 * @return une liste d'étudiant
	 */
	public List<Etudiant> listerEtudiants();
	
	/**
	 * Création d'un étudiant
	 * @param etu
	 * @return un étudiant
	 */
	public int creerEtudiant(Etudiant etu);
	
	/**
	 * Modifier un étudiant
	 * @param etu
	 * @return int
	 */
	public int modifierEtudiant(Etudiant etu);
	
	/**
	 * Supprime un étudiant
	 * @param idEtudiant
	 * @return int
	 */
	public int supprimerEtudiant(int idEtudiant);
	
	/**
	 * Lit le détail des informations d'un étudiant
	 * @param idEtudiant
	 * @return Etudiant
	 */
	public Etudiant lireInfoEtudiant(int idEtudiant);
	
	/**
	 * Ajoute un étudiaant à un cours
	 * @param etu
	 * @param c
	 * @return int
	 */
	public int ajouterEtudiantCours(Etudiant etu, Cours c);
}

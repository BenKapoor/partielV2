package eu.ensup.gestionEleveV2.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import eu.ensup.gestionEleveV2.domaine.Cours;
import eu.ensup.gestionEleveV2.domaine.Etudiant;


/**
 * @author benja
 *	Controller de la gestion des étudiants
 */
public class GestionDao implements IGestionDao {
	// ouverture unité de persistance
	EntityManagerFactory emf;
	// porter de requete
	EntityManager em;

	/* (non-Javadoc)
	 * @see eu.ensup.gestioneleve.dao.IGestionDao#listerEtudiants()
	 */
	public List<Etudiant> listerEtudiants() {
		emf = Persistence.createEntityManagerFactory("gestioneleve");
		em = emf.createEntityManager();
		List<Etudiant> etu = new ArrayList();
		Query req = em.createQuery("select etu from Etudiant etu");
		etu = req.getResultList();
		return etu;
	}

	/* (non-Javadoc)
	 * @see eu.ensup.gestioneleve.dao.IGestionDao#modifierEtudiant(eu.ensup.gestionEleve.domaine.Etudiant)
	 */
	public int modifierEtudiant(Etudiant etu) {
		// TODO Auto-generated method stub
				emf = Persistence.createEntityManagerFactory("gestioneleve");
				em = emf.createEntityManager();
				EntityTransaction tx = em.getTransaction();
				try {
					// 1 débuter la transaction
					tx.begin();
					// 2 Effectuer l'opération
					em.merge(etu);
					// 3 valider la transaction
					tx.commit();
					// 4 fermet l'unité de persistence
					em.close();
					emf.close();
					return 1;
				} catch (Exception e) {
					System.out.println(e.getMessage());
					tx.rollback();
					return 0;
				}
	}

	/* (non-Javadoc)
	 * @see eu.ensup.gestioneleve.dao.IGestionDao#supprimerEtudiant(int)
	 */
	public int supprimerEtudiant(int idEtudiant) {
		emf = Persistence.createEntityManagerFactory("gestioneleve");
		em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		try {
			// 1 débuter la transaction
			tx.begin();
			// 2 Effectuer l'opération
			em.remove(em.getReference(Etudiant.class, idEtudiant));
			// 3 valider la transaction
			tx.commit();
			// 4 fermet l'unité de persistence
			em.close();
			emf.close();
			return 1;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			tx.rollback();
			return 0;
		}
	}

	/* (non-Javadoc)
	 * @see eu.ensup.gestioneleve.dao.IGestionDao#lireInfoEtudiant(int)
	 */
	public Etudiant lireInfoEtudiant(int idEtudiant) {
		// TODO Auto-generated method stub
		emf = Persistence.createEntityManagerFactory("gestioneleve");
		em = emf.createEntityManager();
		Etudiant etudiant = em.getReference(Etudiant.class, idEtudiant);
		return etudiant;
	}

	/* (non-Javadoc)
	 * @see eu.ensup.gestioneleve.dao.IGestionDao#ajouterEtudiantCours(eu.ensup.gestionEleve.domaine.Etudiant, eu.ensup.gestionEleve.domaine.Cours)
	 */
	public int ajouterEtudiantCours(Etudiant etu, Cours c) {
		// TODO Auto-generated method stub
				emf = Persistence.createEntityManagerFactory("gestioneleve");
				em = emf.createEntityManager();
				EntityTransaction tx = em.getTransaction();
				etu.getCours().add(c);
				try {
					// 1 débuter la transaction
					tx.begin();
					// 2 Effectuer l'opération
					em.merge(etu);
					// 3 valider la transaction
					tx.commit();
					// 4 fermet l'unité de persistence
					em.close();
					emf.close();
					return 1;
				} catch (Exception e) {
					System.out.println(e.getMessage());
					tx.rollback();
					return 0;
				}
	}

	/* (non-Javadoc)
	 * @see eu.ensup.gestioneleve.dao.IGestionDao#creerEtudiant(eu.ensup.gestionEleve.domaine.Etudiant)
	 */
	public int creerEtudiant(Etudiant etu) {
		// TODO Auto-generated method stub
				emf = Persistence.createEntityManagerFactory("gestioneleve");
				em = emf.createEntityManager();
				EntityTransaction tx = em.getTransaction();
				try {
					// 1 débuter la transaction
					tx.begin();
					// 2 Effectuer l'opération
					em.persist(etu);
					// 3 valider la transaction
					tx.commit();
					// 4 fermet l'unité de persistence
					em.close();
					emf.close();
					return 1;
				} catch (Exception e) {
					System.out.println(e.getMessage());
					tx.rollback();
					return 0;
				}
	}

}

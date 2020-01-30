package eu.ensup.gestionEleveV2.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import eu.ensup.gestionEleveV2.domaine.Etudiant;
import eu.ensup.gestionEleveV2.domaine.Personne;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 * @author benja
 *
 */
public class LoginDao {
	// ouverture unité de persistance
		EntityManagerFactory emf;
		// porter de requete
		EntityManager em;

/**
 * @param mail
 * @param nom
 * @return
 */
public List<Personne> login(String mail,String nom){

		List<Personne> listePersonne = new ArrayList<Personne>();
		emf = Persistence.createEntityManagerFactory("gestioneleve");
		em = emf.createEntityManager();
		
		Query req = em
				.createQuery("select p from Personne p where mail ='"+mail+"' and nom ='"+nom+"'");
		System.out.println(req);
		
		listePersonne = req.getResultList();
		
		System.out.println(listePersonne);
		return listePersonne;
		
	}
}

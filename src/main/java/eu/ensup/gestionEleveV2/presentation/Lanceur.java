package eu.ensup.gestionEleveV2.presentation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import eu.ensup.gestionEleveV2.service.GestionService;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1- Creation de l'unitÃ© de travail
	
		EntityManagerFactory enf = Persistence.createEntityManagerFactory("gestioneleve");
		EntityManager em = enf.createEntityManager();

	}
}
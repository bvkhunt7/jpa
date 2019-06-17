package com.axelor.apps;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Utility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("pu");
		EntityManager entitymanager = emfactory.createEntityManager();

		entitymanager.getTransaction().begin();

		Animal a = new Animal();
		a.setAid(1);
		a.setAname("Lion");
		entitymanager.persist(a);
		entitymanager.getTransaction().commit();
		entitymanager.close();
		emfactory.close();

	}

}

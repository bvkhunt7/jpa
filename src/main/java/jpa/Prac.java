package jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class Prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("pu");
		EntityManager entitymanager = emfactory.createEntityManager();

		entitymanager.getTransaction().begin();

		//Person p = new Person();
		
		
		//Insert data
		  //p.setPid(4); p.setPname("Caption-Marvel"); 
		//entitymanager.persist(p);
		 
		//update
		//Person p = entitymanager.find(Person.class, 1);
		  //p.setPname("Black-Panther");
		
		//remove
		//Person p = entitymanager.find(Person.class, 1);
		   // entitymanager.remove(p);
		
		
		//Fetch data
		//Person p = entitymanager.find(Person.class, 1);
				  //System.out.println(p);
		
				
		
		
		
		
		entitymanager.getTransaction().commit();
		entitymanager.close();
		emfactory.close();


	}

}

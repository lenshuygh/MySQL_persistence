package com.lens.persistence;

import javax.persistence.EntityManager;

public class Main {

	public static void main(String[] args) {
		Address address = new Address();
		address.setCity("Diepenbeek")
			.setCountry("Belgiul")
			.setPostcode("3590")
			.setStreet("Diepenbeek");
		
		EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
		em.getTransaction().begin();
		em.persist(address);
		em.getTransaction().commit();
		em.close();
		PersistenceManager.INSTANCE.close();
		
	}

}

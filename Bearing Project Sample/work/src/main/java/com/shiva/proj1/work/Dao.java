package com.shiva.proj1.work;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Dao {
	
	EntityManager em=Persistence.createEntityManagerFactory("abc").createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	public void insertBearing(Bearing b) {
		et.begin();
		em.persist(b);
		et.commit();	
	}
	
	public Bearing getById(int id) {
		return em.find(Bearing.class, id);
	}
	
	public void delete(int id) {
		Bearing b=getById(id);
		et.begin();
		em.remove(b);
		et.commit();
	}
	
	public void updateBearing(int id) {
		
	}
	

}

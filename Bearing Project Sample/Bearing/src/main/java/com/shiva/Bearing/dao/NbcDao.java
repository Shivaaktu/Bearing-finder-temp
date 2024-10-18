package com.shiva.Bearing.dao;

import com.shiva.Bearing.entity.NbcBearing;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class NbcDao {
	
	EntityManager em=Persistence.createEntityManagerFactory("bearing-persistence").createEntityManager();
	EntityTransaction et=em.getTransaction();  
	
	public boolean addNbcBearing(NbcBearing b) {
		et.begin();
		em.persist(b);
		et.commit();
		return true;
	}
	
	public NbcBearing getNbcBearingBysize(int size) {
		return em.find(NbcBearing.class, size);
	}
	
	public NbcBearing updateNbcBeraingMrp(int size, int new_mrp) {
		NbcBearing b=getNbcBearingBysize(size);
		if(b==null) {
			System.out.println("This size is not present");
			return null;
		}
		b.setMrp(new_mrp);
		em.merge(b);
		System.out.println("NBC Bearing price for size "+size+" updated");
		return b;
	}
	
	public NbcBearing updateNbcBeraingDiscount(int size, int new_discount) {
		NbcBearing b=getNbcBearingBysize(size);
		if(b==null) {
			System.out.println("This size is not present");
			return null;
		}
		b.setMrp(new_discount);
		em.merge(b);
		System.out.println("NBC Bearing price for size "+size+" updated");
		return b;
	}
	

	
	public boolean removeNbcBering(int size) {
		NbcBearing b=getNbcBearingBysize(size);
		if(b!=null) {
			et.begin();
			em.remove(b);
			et.commit();
			return true;
		}
		return false;
	}

}

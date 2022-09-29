package com.ty;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveEntity {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		Mobile mobile=new Mobile();
		mobile.setName("iphone 13");
		mobile.setCost(55000.00);
		
		Sim sim1=new Sim();
		sim1.setName("jio");
		sim1.setProvider("jio provider");
		
		Sim sim2=new Sim();
		sim2.setName("airtel");
		sim2.setProvider("airtel provider");
		
		List<Sim> sim=new ArrayList();
		sim.add(sim1);
		sim.add(sim2);
		
		mobile.setSim(sim);
		sim1.setMobile(mobile);
		sim2.setMobile(mobile);
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(mobile);
		entityManager.persist(sim1);
		entityManager.persist(sim2);
		entityTransaction.commit();
}
}

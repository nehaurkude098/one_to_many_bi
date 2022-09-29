package com.ty;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ToRetrieveMob {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		System.out.println(entityManagerFactory);

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Mobile mobile=entityManager.find(Mobile.class, 1);
		System.out.println("------------Details of mobile------------");
		System.out.println("mobile id is "+ mobile.getName());
		System.out.println("mobile name is "+mobile.getName());
		System.out.println("cost of mob is "+mobile.getCost());
		System.out.println("-----------------------------------------");
		
		List<Sim> sim=mobile.getSim();
		if(sim!=null) {
			for(Sim available:sim) {
			System.out.println("--------sim availablity--------");
			
			System.out.println("Sim id is "+available.getId());
			System.out.println("Sim name is "+available.getName());
			System.out.println("Sim provider is "+available.getProvider());
			System.out.println("----------------------------------");
			}
		}
		
		
		
	}

}

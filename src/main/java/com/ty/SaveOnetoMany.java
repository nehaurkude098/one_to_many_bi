package com.ty;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveOnetoMany {

	public static void main(String[] args) {
		FoodOrder foodorder=new FoodOrder();
		foodorder.setStatus("ready");
		foodorder.settoName("hitesh");
		
		
		Item item1=new Item();
		item1.setName("dosa");
		item1.setCost(50.00);
		item1.setQuantity(2);
		
		
		Item item2=new Item();
		item2.setName("idli vada");
		item2.setCost(40.00);
		item2.setQuantity(3);
		
		List<Item> items=new ArrayList();
		items.add(item1);
		items.add(item2);
		foodorder.setItem(items);
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(foodorder);
		entityManager.persist(item1);
		entityManager.persist(item2);
		entityTransaction.commit();
		
	

	}

}

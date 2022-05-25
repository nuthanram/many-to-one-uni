package com.ty.manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveItemOrder {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Item item1=new Item();
		Item item2=new Item();
		Item item3=new Item();
		item1.setName("charger");
		item1.setPrice(459);
		item1.setQuantity(1);
		
		item2.setName("belt");
		item2.setPrice(650);
		item2.setQuantity(1);
		
		item3.setName("shirt");
		item3.setPrice(1500);
		item3.setQuantity(2);
		
		AmazonOrder amazonOrder=new AmazonOrder();
		amazonOrder.setAddress("btm layout 2nd stage");
		amazonOrder.setName("personal order");
		amazonOrder.setStatus("order confirmed");
		
		item1.setAmazonOrder(amazonOrder);
		item2.setAmazonOrder(amazonOrder);
		item3.setAmazonOrder(amazonOrder);
		entityTransaction.begin();entityManager.persist(amazonOrder);entityManager.persist(item1);
		entityManager.persist(item2);
		
		entityManager.persist(item3);
		entityTransaction.commit();
		System.out.println("done");
	}
}

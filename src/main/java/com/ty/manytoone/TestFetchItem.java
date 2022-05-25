package com.ty.manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestFetchItem {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Item item=entityManager.find(Item.class, 4);
		AmazonOrder amazonOrder=item.getAmazonOrder();
		System.out.println("order id: "+amazonOrder.getId());
		System.out.println("order name: "+amazonOrder.getName());
		System.out.println("order address: "+amazonOrder.getAddress());
		System.out.println("order status: "+amazonOrder.getStatus());
	}
}

package com.ty.manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveBranchHospital {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Branch branch1=new Branch();
		branch1.setName("Btm layout");
		branch1.setCountry("India");
		branch1.setState("karnataka");
		branch1.setPhone(8956471203l);
		Branch branch2=new Branch();
		branch2.setName("jayanagar");
		branch2.setCountry("India");
		branch2.setState("karnataka");
		branch2.setPhone(8951234503l);
		Branch branch3=new Branch();
		branch3.setName("street 12");
		branch3.setCountry("USA");
		branch3.setState("texas");
		branch3.setPhone(1100471203l);
		Hospital hospital=new Hospital();
		hospital.setName("appollo");
		hospital.setWebsite("www.appoloHoospitals.com");
		branch1.setHospital(hospital);
		branch2.setHospital(hospital);
		branch3.setHospital(hospital);
		entityTransaction.begin();
		entityManager.persist(hospital);
		entityManager.persist(branch1);
		entityManager.persist(branch2);
		entityManager.persist(branch3);
		entityTransaction.commit();
	}
}

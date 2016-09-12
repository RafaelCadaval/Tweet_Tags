package com.tagtweet.util;

import javax.persistence.EntityManager;

public class GeraTabelas {
	public static void main(String[] args) {
		try {
			EntityManager operation = JpaUtil.getFactory();
			operation.getTransaction().begin();
			operation.close(); 
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

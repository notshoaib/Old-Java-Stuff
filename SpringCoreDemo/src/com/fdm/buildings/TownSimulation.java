package com.fdm.buildings;

import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TownSimulation {

	public static void main(String[] args) {
		
		ApplicationContext myContext = new ClassPathXmlApplicationContext("beans.xml");
		
		Person person =(Person) myContext.getBean("gang");
		
		System.out.println(person);
		
//		Person gangyang =(Person) myContext.getBean("gangyang");
		
		House house = (House) myContext.getBean("myhouse");
		
		System.out.println(house);
		
		OfficeBuilding officeBuilding = (OfficeBuilding)myContext.getBean("officeBuilding");
		Set<Company> compSet = officeBuilding.getCompanies();
		for(Company company: compSet)
			System.out.println(company);
		
		Person daniel1 = (Person) myContext.getBean("personFactory");
		System.out.println(daniel1);
		
	}
	
	

}

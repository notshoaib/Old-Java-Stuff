package com.fdmgroup.nycdeathdata.util;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;



public class LeadingCauseDAO {

	private static HashSet<LeadingCause> leadingCauseSet = new HashSet<LeadingCause>();
	private EntityManager em;

	public void create(LeadingCause leadingCause) {
		em = JPAManager.getEntityManager();
		em.getTransaction().begin();
		em.persist(leadingCause);
		em.getTransaction().commit();
		em.close();

	}
	
	public void createAll(Collection<LeadingCause> leadingCauses){
		em = JPAManager.getEntityManager();
		em.getTransaction().begin();
		for(LeadingCause leadingCause:leadingCauses){
			em.persist(leadingCause);
            em.flush();
            em.clear();
		}
		em.getTransaction().commit();
		em.close();
	}

	public List<LeadingCause> readAll() {
		em= JPAManager.getEntityManager();
		Query query = em.createNativeQuery("Select * from LeadingCause", LeadingCause.class);
		List<LeadingCause> list = (List<LeadingCause>)query.getResultList();
		em.close();
		return list;
	}
	
	public Year countAggregate(String leadingCause, int year){
		
		em= JPAManager.getEntityManager();
		Query query = em.createNativeQuery("Select sum(count) from LeadingCause where causeofdeath= ? and year = ?"
				);
		query.setParameter(1, leadingCause);
		query.setParameter(2, year);
		BigDecimal count= (BigDecimal)query.getSingleResult();
		em.close();
		return new Year(leadingCause, count);
	}
}

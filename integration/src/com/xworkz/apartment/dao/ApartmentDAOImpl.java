package com.xworkz.apartment.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.apartment.entity.ApartmentEntity;

@Component
public class ApartmentDAOImpl implements ApartmentDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public ApartmentDAOImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
		System.out.println("sessionFactory bean created");
	}



	@Override
	public void save(ApartmentEntity entity) {
		try (Session session = sessionFactory.openSession()) {
			Transaction trax = session.beginTransaction();
			session.save(entity);
			trax.commit();
		}

	}
}

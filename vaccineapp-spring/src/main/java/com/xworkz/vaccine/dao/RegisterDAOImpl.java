package com.xworkz.vaccine.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.vaccine.entity.RegisterEntity;

@Repository
public class RegisterDAOImpl implements RegisterDAO {

	private SessionFactory sessionFactory;

	@Autowired
	public RegisterDAOImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void saveRegisterEntity(RegisterEntity registerEntity) {
		try (Session session = sessionFactory.openSession()) {
			Transaction trans = session.beginTransaction();
			session.save(registerEntity);
			trans.commit();
			System.out.println("entity saved");
		}
	}
}

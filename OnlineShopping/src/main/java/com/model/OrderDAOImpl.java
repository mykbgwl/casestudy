package com.model;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderDAOImpl implements OrderDAO{
	
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public void addOrder(Order order) {
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.save(order);
		session.flush();
		session.getTransaction().commit();
		
	}

	@Override
	public Order findOrder(int id) {
		Session session=sessionFactory.openSession();
		
		return session.get(Order.class,id);
	}

	@Override
	public List<Order> findAllOrder() {
		Session session=sessionFactory.openSession();
		return session.createQuery("select o from Order o").list();
	}

	@Override
	public boolean updateOrder(Order order) {
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.update(order);
		session.flush();
		session.getTransaction().commit();
		return true;
	}

	@Override
	public boolean deleteOrder(int id) {
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		Order order=session.get(Order.class, id);
		session.delete(order);
		session.flush();
		session.getTransaction().commit();
		return true;
	}

}

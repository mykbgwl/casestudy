package com.model;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CartDAOImpl implements CartDAO{

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public void addCart(Cart cart) {
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.save(cart);
		session.flush();
		session.getTransaction().commit();
		
	}

	@Override
	public Cart findCart(int id) {
		Session session=sessionFactory.openSession();
		Cart cart=session.get(Cart.class, id);
		return cart;
	}

	@Override
	public List<Cart> getAllCart() {
		Session session=sessionFactory.openSession();
		List<Cart> cartList=session.createQuery("select c from Cart c").list();
		return cartList;
	}

	@Override
	public boolean updateCart(Cart cart) {
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.update(cart);
		session.flush();
		session.getTransaction().commit();
		return true;
	}

	@Override
	public boolean deleteCart(int id) {
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		Cart cart=session.get(Cart.class,id);
		session.delete(id);
		session.flush();
		session.getTransaction().commit();
		return true;
	}

}

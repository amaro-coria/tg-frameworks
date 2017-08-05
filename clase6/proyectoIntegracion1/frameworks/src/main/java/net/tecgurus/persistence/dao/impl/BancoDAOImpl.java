package net.tecgurus.persistence.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.tecgurus.entities.Banco;
import net.tecgurus.persistence.dao.BancoDAO;

@Repository
@Transactional
public class BancoDAOImpl implements BancoDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Banco> findAllBancos(){
		//List<Banco> list = (List<Banco>) sessionFactory.
		//getCurrentSession().createQuery("From Banco").list();
		//return list;
		Query query = sessionFactory.getCurrentSession().
				createQuery("From Banco");
		Query query2 = sessionFactory.getCurrentSession().
				createQuery("From Banco b");
		Query query3 = sessionFactory.getCurrentSession().
				createQuery("Select b from Banco b");
		List<Banco> list = query.list();
		return list;
	}
	
	@Override
	public Integer addBanco(Banco banco) {
		Integer i = (Integer) sessionFactory.getCurrentSession().save(banco);
		return i;
	}
	
	@Override
	public void updateBanco(Banco banco) {
		sessionFactory.getCurrentSession().update(banco);
	}
	
	@Override
	public void deleteBanco(Banco banco) {
		sessionFactory.getCurrentSession().delete(banco);
	}
	
	
}




















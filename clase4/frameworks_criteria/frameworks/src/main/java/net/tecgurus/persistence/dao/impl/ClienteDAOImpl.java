package net.tecgurus.persistence.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import net.tecgurus.entities.Banco;
import net.tecgurus.entities.Cliente;
import net.tecgurus.persistence.dao.ClienteDAO;

@Repository
@Transactional
public class ClienteDAOImpl implements ClienteDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Cliente> findAll() {
		Query q = sessionFactory.getCurrentSession().createQuery("From Cliente");
		return q.list();
	}
	
	@Override
	public List<Cliente> findAllByCriteria(){
		Criteria c = sessionFactory.getCurrentSession().createCriteria(Cliente.class);
		return c.list();
	}
	
	@Override
	@Transactional(readOnly = true, propagation = Propagation.REQUIRES_NEW)
	public List<Cliente> findMatchesFromCriteria(String name, String aP, String aM){
		Criteria c = sessionFactory.getCurrentSession().createCriteria(Cliente.class);
		c.add(Restrictions.ilike("nombre", name));
		c.add(Restrictions.ilike("apaterno", aP));
		c.add(Restrictions.ilike("amaterno", aM));
		return c.list();
	}

	@Override
	public List<Cliente> findMatches(String name, String aP, String aM) {
		String hql = "From Cliente c WHERE c.nombre like '" + name + "' and c.apaterno like '" + aP
				+ "' and c.amaterno like '" + aM + "'";
		Query q = sessionFactory.getCurrentSession().createQuery(hql);
		return q.list();
	}

	@Override
	public List<Cliente> findMatches2(String name, String aP, String aM) {
		String hql = "From Cliente c WHERE c.nombre like ? and c.apaterno like ? and c.amaterno like ?";
		Query q = sessionFactory.getCurrentSession().createQuery(hql);
		q.setParameter(0, name);
		q.setParameter(1, aP);
		q.setParameter(2, aM);
		return q.list();
	}
	
	@Override
	public List<Cliente> findMatches3(String name, String aP, String aM) {
		String hql = "From Cliente c WHERE c.nombre like :name and c.apaterno like :apat and c.amaterno like :amat";
		Query q = sessionFactory.getCurrentSession().createQuery(hql);
		q.setParameter("name", name);
		q.setParameter("apat", aP);
		q.setParameter("amat", aM);
		return q.list();
	}

	@Override
	public List<Cliente> findMatchesFromCriteria(int lowRange, int maxRange){
		Criteria c = sessionFactory.getCurrentSession().createCriteria(Cliente.class);
		c.add(Restrictions.between("edad", lowRange, maxRange));
		return c.list();
	}
	
	@Override
	public List<Cliente> findMatches(int lowRange, int maxRange){
		String hql = "From Cliente c WHERE c.edad between ? and ?";
		Query q = sessionFactory.getCurrentSession().createQuery(hql);
		q.setParameter(0, lowRange);
		q.setParameter(1, maxRange);
		return q.list();
	}
	
	@Override
	public List<Cliente> findFromBancoCriteria(int idBanco){
		Criteria c = sessionFactory.getCurrentSession().createCriteria(Cliente.class);
		c.add(Restrictions.eq("banco.idBanco", idBanco));
		return c.list();
	}
	
	@Override
	public List<Cliente> findFromBanco(int idBanco){
		String hql = "From Cliente c WHERE c.banco.idBanco = ?";
		Query q = sessionFactory.getCurrentSession().createQuery(hql);
		q.setParameter(0, idBanco);
		return q.list();
	}
	
	@Override
	public List<Cliente> findFromBancoCriteria(String bancoNombre){
		Criteria c = sessionFactory.getCurrentSession().createCriteria(Cliente.class);
		c = c.createCriteria("banco");
		c.add(Restrictions.ilike("nombre", bancoNombre));
		return c.list();
	}
	
	@Override
	public List<Cliente> findFromBanco(String bancoNombre){
		String hql = "From Cliente c WHERE c.banco.nombre like :name";
		Query q = sessionFactory.getCurrentSession().createQuery(hql);
		q.setParameter("name", bancoNombre);
		return q.list();
	}
	
	@Override
	public List<Cliente> findFromBanco(Banco banco){
		String hql = "From Cliente c WHERE c.banco = ?";
		Query q = sessionFactory.getCurrentSession().createQuery(hql);
		q.setParameter(0, banco);
		return q.list();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

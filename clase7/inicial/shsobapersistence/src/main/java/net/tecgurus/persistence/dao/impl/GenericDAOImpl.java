package net.tecgurus.persistence.dao.impl;

import net.tecgurus.exception.TGPersistenceException;
import net.tecgurus.persistence.dao.GenericDAO;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Amaro on 10/08/2017.
 */
public abstract class GenericDAOImpl<T, PK extends Serializable> implements GenericDAO<T, PK> {

    @Autowired
    private SessionFactory sessionFactory;

    private final static Logger log = LoggerFactory.getLogger(GenericDAOImpl.class);

    @SuppressWarnings("unchecked")
    public List<T> getAll() throws TGPersistenceException {
        List<T> entities = new ArrayList<T>();
        try{
            entities = getSessionFactory().getCurrentSession().createCriteria(this.getPersistentClass()).list();
        }catch(Exception e){
            log.error(e.getMessage(), e);
        }
        return entities;
    }

    @SuppressWarnings("unchecked")
    public T findByPK(PK id) throws TGPersistenceException{
        try{
            return (T) getSessionFactory().getCurrentSession().get(this.getPersistentClass(), id);
        }catch(Exception e){
            throw new TGPersistenceException("Excepción en BD", e);
        }
    }

    public void update(T object) throws TGPersistenceException{
        try{
            getSessionFactory().getCurrentSession().update(object);
        }catch(Exception e){
            throw new TGPersistenceException("Excepción en BD", e);
        }
    }

    public void remove(T object) throws TGPersistenceException{
        try{
            getSessionFactory().getCurrentSession().delete(object);
            log.debug("Se ejecuto el borrado del objeto");
        }catch(Exception e){
            log.debug("Cayo en exception al borrar el objeto", e);
            throw new TGPersistenceException("Excepción en BD", e);
        }
    }

    @SuppressWarnings("unchecked")
    public PK save(T object) throws TGPersistenceException{
        try{
            return (PK) getSessionFactory().getCurrentSession().save(object);
        }catch(Exception e){
            throw new TGPersistenceException("Excepción en BD", e);
        }
    }

    public void saveOrUpdate(T object) throws TGPersistenceException{
        try{
            getSessionFactory().getCurrentSession().saveOrUpdate(object);
        }catch(Exception e){
            throw new TGPersistenceException("Excepción en BD", e);
        }
    }

    public boolean exists(PK paramPK) throws TGPersistenceException{
        try{
            Object entity = this.findByPK(paramPK);
            return (entity != null);
        }catch(Exception e){
            throw new TGPersistenceException("Excepción en BD", e);
        }
    }

    /**
     * Método para obtener la clase que persiste el DAO
     *
     * @return <T> clase a persistir.
     */
    @SuppressWarnings("unchecked")
    private Class<T> getPersistentClass() {

        Class<T> type = null;

        Class<?> clazz = getClass();

        while (!(clazz.getGenericSuperclass() instanceof ParameterizedType)) {
            clazz = clazz.getSuperclass();
        }

        type = (Class<T>) ((ParameterizedType) clazz.getGenericSuperclass()).getActualTypeArguments()[0];

        if (log.isDebugEnabled()) {
            log.debug("type DO :: " + type);
        }
        return type;
    }

    /**
     * @return the sessionFactory
     */
    public SessionFactory getSessionFactory(){
        return sessionFactory;
    }

    /**
     * @param sessionFactory the sessionFactory to set
     */
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}

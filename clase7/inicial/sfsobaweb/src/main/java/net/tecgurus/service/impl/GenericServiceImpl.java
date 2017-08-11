package net.tecgurus.service.impl;

import net.tecgurus.exception.TGPersistenceException;
import net.tecgurus.exception.TGServiceException;
import net.tecgurus.persistence.dao.GenericDAO;
import net.tecgurus.service.GenericService;
import net.tecgurus.service.assembler.Assembler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Created by Amaro on 10/08/2017.
 */
public abstract class GenericServiceImpl<DTO, PK extends Serializable, Mapping> implements GenericService<DTO, PK, Mapping> {

    abstract GenericDAO getDAO();

    abstract Assembler getAssembler();

    private final static Logger log = LoggerFactory.getLogger(GenericServiceImpl.class);

    @Transactional(readOnly = true)
    public List<DTO> getAll() throws TGServiceException {
        try {
            List<Mapping> listMapping = getDAO().getAll();
            return getAssembler().getDTOListTransform(listMapping);
        } catch (TGPersistenceException ex) {
            throw new TGServiceException("Hubo error en BD", ex);
        }
    }

    @Transactional(readOnly = true)
    public DTO findByPK(PK id) throws TGServiceException {
        try {
            Mapping mapping = (Mapping) getDAO().findByPK(id);
            return (DTO) getAssembler().getDTOTransform(mapping);
        } catch (TGPersistenceException ex) {
            throw new TGServiceException("Hubo error en BD", ex);
        }
    }

    @Transactional
    public void update(DTO object) throws TGServiceException {
        try {
            Mapping mapping = (Mapping) getAssembler().getMappingTransform(object);
            getDAO().update(mapping);
        } catch (TGPersistenceException ex) {
            throw new TGServiceException("Hubo error en BD", ex);
        }
    }

    @Transactional
    public void remove(DTO object) throws TGServiceException {
        try {
            Mapping mapping = (Mapping) getAssembler().getMappingTransform(object);
            getDAO().remove(mapping);
        } catch (TGPersistenceException ex) {
            throw new TGServiceException("Hubo error en BD", ex);
        }
    }

    @Transactional
    public PK save(DTO object) throws TGServiceException {
        try {
            Mapping mapping = (Mapping) getAssembler().getMappingTransform(object);
            return (PK) getDAO().save(mapping);
        } catch (TGPersistenceException ex) {
            throw new TGServiceException("Hubo error en BD", ex);
        }
    }

    @Transactional
    public void saveOrUpdate(DTO object) throws TGServiceException {
        try {
            Mapping mapping = (Mapping) getAssembler().getMappingTransform(object);
            getDAO().saveOrUpdate(mapping);
        } catch (TGPersistenceException ex) {
            throw new TGServiceException("Hubo error en BD", ex);
        }
    }

    @Transactional(readOnly = true)
    public boolean exists(PK paramPK) throws TGServiceException {
        try {
            return getDAO().exists(paramPK);
        } catch (TGPersistenceException ex) {
            throw new TGServiceException("Hubo error en BD", ex);
        }
    }

    /**
     * Método para obtener la clase que persiste el DAO
     *
     * @return <T> clase a persistir.
     */
    @SuppressWarnings("unchecked")
    private Class<DTO> getInvokingclass() {

        Class<DTO> type = null;

        Class<?> clazz = getClass();

        while (!(clazz.getGenericSuperclass() instanceof ParameterizedType)) {
            clazz = clazz.getSuperclass();
        }

        type = (Class<DTO>) ((ParameterizedType) clazz.getGenericSuperclass()).getActualTypeArguments()[0];

        log.debug("type BS Class :: " + type);
        return type;
    }


}

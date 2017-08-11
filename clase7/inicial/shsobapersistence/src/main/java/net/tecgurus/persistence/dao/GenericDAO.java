package net.tecgurus.persistence.dao;

import net.tecgurus.exception.TGPersistenceException;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Amaro on 10/08/2017.
 */
public interface GenericDAO<T, PK extends Serializable> {

    /**
     * Método génerico utilizado para obtener todos los objetos de
     * un tipo particular.
     *
     * @return Listado de objetos
     */
    List<T> getAll() throws TGPersistenceException;

    /**
     * Método genérico para obtener un objeto basandose en su clase
     * e identificador.
     *
     * @param id Identificador (clave primaria) del objeto a obtener
     * @return Objeto cargado
     */
    T findByPK(PK id) throws TGPersistenceException;

    /**
     * Método genérico para salvar un objeto - maneja
     * actualización e inserción.
     *
     * @param object Objeto a guardar
     */
    void update(T object) throws TGPersistenceException;

    /**
     * Método genérico para borrar un objeto basado en su clase e
     * identificador
     *
     * @param id el identificador (llave primaria) del objeto a eliminar
     */
    void remove(T object) throws TGPersistenceException;

    /**
     * Método genérico para insertar un objeto.
     */
    PK save(T object) throws TGPersistenceException;

    /**
     * Guarda o actualiza un registro
     *
     * @param object
     */
    void saveOrUpdate(T object) throws TGPersistenceException;

    /**
     * Verifica la existencia de un objeto por clave primaria
     *
     * @param paramPK Clave primaria
     * @return Verdadero si existe un objeto relacionado con la llave primaria
     */
    boolean exists(PK paramPK) throws TGPersistenceException;

}
package net.tecgurus.service;

import net.tecgurus.exception.TGServiceException;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Amaro on 10/08/2017.
 */
public interface GenericService<DTO, PK extends Serializable, Mapping> {


    /**
     * Método génerico utilizado para obtener todos los objetos de
     * un tipo particular.
     *
     * @return Listado de objetos
     */
    List<DTO> getAll() throws TGServiceException;

    /**
     * Método genérico para obtener un objeto basandose en su clase
     * e identificador.
     *
     * @param id Identificador (clave primaria) del objeto a obtener
     * @return Objeto cargado
     */
    DTO findByPK(PK id) throws TGServiceException;


    /**
     * Método genérico para salvar un objeto - maneja
     * actualización e inserción.
     *
     * @param object Objeto a guardar
     */
    void update(DTO object) throws TGServiceException;

    /**
     * Método genérico para borrar un objeto basado en su clase e
     * identificador
     *
     * @param id el identificador (llave primaria) del objeto a eliminar
     */
    void remove(DTO object) throws TGServiceException;

    /**
     * Método genérico para insertar un objeto.
     */
    PK save(DTO object) throws TGServiceException;

    /**
     * Guarda o actualiza un registro
     *
     * @param object
     */
    void saveOrUpdate(DTO object) throws TGServiceException;

    /**
     * Verifica la existencia de un objeto por clave primaria
     *
     * @param paramPK Clave primaria
     * @return Verdadero si existe un objeto relacionado con la llave primaria
     */
    boolean exists(PK paramPK) throws TGServiceException;

}
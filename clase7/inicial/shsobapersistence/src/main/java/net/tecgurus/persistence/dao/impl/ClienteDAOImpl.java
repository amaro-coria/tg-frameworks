package net.tecgurus.persistence.dao.impl;

import net.tecgurus.persistence.dao.ClienteDAO;

import org.springframework.stereotype.Repository;

import net.tecgurus.entities.Cliente;

@Repository
public class ClienteDAOImpl extends GenericDAOImpl<Cliente, Integer> 
implements ClienteDAO {

}

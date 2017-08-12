package net.tecgurus.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.tecgurus.dto.ClienteDTO;
import net.tecgurus.entities.Cliente;
import net.tecgurus.persistence.dao.ClienteDAO;
import net.tecgurus.persistence.dao.GenericDAO;
import net.tecgurus.service.ClienteService;
import net.tecgurus.service.assembler.Assembler;
import net.tecgurus.service.assembler.ClienteAssembler;

@Service
public class ClienteServiceImpl extends GenericServiceImpl<ClienteDTO, Integer, Cliente> implements ClienteService {

	@Autowired
	private ClienteDAO clienteDAO;
	@Autowired
	private ClienteAssembler clienteAssembler;
	
	@Override
	GenericDAO getDAO() {
		return clienteDAO;
	}

	@Override
	Assembler getAssembler() {
		return clienteAssembler;
	}

	

}

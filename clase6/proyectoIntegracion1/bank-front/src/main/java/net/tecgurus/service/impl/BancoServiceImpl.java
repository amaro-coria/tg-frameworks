package net.tecgurus.service.impl;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.tecgurus.dto.BancoDTO;
import net.tecgurus.entities.Banco;
import net.tecgurus.persistence.dao.BancoDAO;
import net.tecgurus.service.BancoService;

@Service
public class BancoServiceImpl implements BancoService{
	
	@Autowired
	private BancoDAO dao;

	@Override
	public List<BancoDTO> findAllBancos(){
		List<Banco> listaEntidades = dao.findAllBancos();
		List<BancoDTO> listaDTOs = new LinkedList<>();
		for(Banco banco : listaEntidades) {
			BancoDTO dto = new BancoDTO();
			dto.setId(banco.getIdBanco());
			dto.setNombre(banco.getNombre());
			listaDTOs.add(dto);
		}
		return listaDTOs;
	}
	
}
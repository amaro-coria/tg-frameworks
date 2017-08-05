package net.tecgurus.service;

import java.util.List;

import net.tecgurus.dto.BancoDTO;

public interface BancoService {

	List<BancoDTO> findAllBancos();

}

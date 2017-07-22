package net.tecgurus.persistence.dao;

import java.util.List;

import net.tecgurus.entities.Banco;

public interface BancoDAO {

	List<Banco> findAllBancos();

}

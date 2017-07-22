package net.tecgurus.persistence.dao;

import java.util.List;

import net.tecgurus.entities.Banco;

public interface BancoDAO {

	List<Banco> findAllBancos();

	Integer addBanco(Banco banco);

	void updateBanco(Banco banco);

	void deleteBanco(Banco banco);

}

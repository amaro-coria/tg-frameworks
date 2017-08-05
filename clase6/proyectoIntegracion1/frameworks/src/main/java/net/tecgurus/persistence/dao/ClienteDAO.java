package net.tecgurus.persistence.dao;

import java.util.List;

import net.tecgurus.entities.Banco;
import net.tecgurus.entities.Cliente;

public interface ClienteDAO {

	List<Cliente> findAll();

	List<Cliente> findMatches(String name, String aP, String aM);

	List<Cliente> findMatches2(String name, String aP, String aM);

	List<Cliente> findMatches3(String name, String aP, String aM);

	List<Cliente> findMatches(int lowRange, int maxRange);

	List<Cliente> findFromBanco(int idBanco);

	List<Cliente> findFromBanco(String bancoNombre);

	List<Cliente> findFromBanco(Banco banco);

	List<Cliente> findAllByCriteria();

	List<Cliente> findMatchesFromCriteria(String name, String aP, String aM);

	List<Cliente> findMatchesFromCriteria(int lowRange, int maxRange);

	List<Cliente> findFromBancoCriteria(int idBanco);

	List<Cliente> findFromBancoCriteria(String bancoNombre);

}

package net.tecgurus.persistence.dao.impl;

import net.tecgurus.entities.Banco;
import net.tecgurus.persistence.dao.BancoDAO;
import org.springframework.stereotype.Repository;

/**
 * Created by Amaro on 10/08/2017.
 */
@Repository
public class BancoDAOImpl extends GenericDAOImpl<Banco, Integer> implements BancoDAO {
}
package net.tecgurus.service.impl;

import net.tecgurus.dto.BancoDTO;
import net.tecgurus.entities.Banco;
import net.tecgurus.persistence.dao.BancoDAO;
import net.tecgurus.persistence.dao.GenericDAO;
import net.tecgurus.service.BancoService;
import net.tecgurus.service.assembler.Assembler;
import net.tecgurus.service.assembler.BancoAssembler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Amaro on 10/08/2017.
 */
@Service
@Transactional
public class BancoServiceImpl extends GenericServiceImpl<BancoDTO, Integer, Banco> implements BancoService {

    @Autowired
    private BancoDAO bancoDAO;
    @Autowired
    private BancoAssembler bancoAssembler;

    @Override
    GenericDAO getDAO() {
        return bancoDAO;
    }

    @Override
    Assembler getAssembler() {
        return bancoAssembler;
    }
}

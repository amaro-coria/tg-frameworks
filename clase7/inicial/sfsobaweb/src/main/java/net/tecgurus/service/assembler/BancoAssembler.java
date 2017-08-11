package net.tecgurus.service.assembler;

import net.tecgurus.dto.BancoDTO;
import net.tecgurus.entities.Banco;
import org.springframework.stereotype.Component;

/**
 * Created by Amaro on 10/08/2017.
 */
@Component
public class BancoAssembler extends Assembler<BancoDTO, Banco>{


    @Override
    public BancoDTO getDTOTransform(Banco mapping) {
        if(mapping == null){
            return null;
        }
        BancoDTO dto = new BancoDTO();
        dto.setIdBanco(mapping.getIdBanco());
        dto.setNombre(mapping.getNombre());
        return dto;
    }

    @Override
    public Banco getMappingTransform(BancoDTO dto) {
        if(dto == null){
            return null;
        }
        Banco banco = new Banco();
        banco.setNombre(dto.getNombre());
        if(dto.getIdBanco() != null){
            banco.setIdBanco(dto.getIdBanco());
        }
        return banco;
    }
}
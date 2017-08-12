package net.tecgurus.controller;

import lombok.Data;
import net.tecgurus.dto.BancoDTO;
import net.tecgurus.exception.TGServiceException;
import net.tecgurus.service.BancoService;
import net.tecgurus.util.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import java.util.List;

/**
 * Created by Amaro on 10/08/2017.
 */
@ManagedBean(name = "controladorBanco")
@ViewScoped
@Data
public class BancoController extends GenericController {

    private static final Logger log = LoggerFactory.getLogger(BancoController.class);

    private List<BancoDTO> itemsList;
    private BancoDTO currentItem;
    private String bancoNombre;
    @ManagedProperty("#{bancoServiceImpl}")
    private BancoService bancoService;

    @PostConstruct
    private void init(){
        initItemsList();
    }

    private void initItemsList(){
        try {
            itemsList = bancoService.getAll();
        } catch (TGServiceException e) {
            super.addErrorMessage(Constants.MESSAGE_ERROR_INIT_LIST);
            log.error("Error obtaining list data: {}", e.getMessage());
        }
    }

    public String aggregaNuevoBanco(){
        BancoDTO dto = new BancoDTO();
        dto.setNombre(bancoNombre);
        try {
            bancoService.save(dto);
            super.addInfoMessage(Constants.MESSAGE_SUCCESS_SAVE);
        } catch (TGServiceException e) {
            super.addErrorMessage(Constants.MESSAGE_ERROR_ADD_DATA);
            log.error("Error adding data: {}", e.getMessage());
        }
        initItemsList();
        return "";
    }

    

}
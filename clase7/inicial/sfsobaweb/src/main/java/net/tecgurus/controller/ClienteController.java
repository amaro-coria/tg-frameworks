package net.tecgurus.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import lombok.Data;
import net.tecgurus.dto.BancoDTO;
import net.tecgurus.dto.ClienteDTO;
import net.tecgurus.exception.TGServiceException;
import net.tecgurus.service.BancoService;
import net.tecgurus.service.ClienteService;
import net.tecgurus.util.Constants;

@ManagedBean(name = "clienteController")
@ViewScoped
@Data
public class ClienteController extends GenericController{

	@ManagedProperty("#{clienteServiceImpl}")
	private ClienteService serviceCliente;
	@ManagedProperty("#{bancoServiceImpl}")
	private BancoService serviceBanco;
	
	private List<BancoDTO> bancoList;
	private List<ClienteDTO> itemsList;
	private ClienteDTO currentItem;
	
	private String inputAltaNombre;
	private String inputAltaApellidoP;
	private String inputAltaApellidoM;
	private Integer inputAltaEdad;
	private Integer inputAltaIdBanco;
	
	@PostConstruct
	private void init(){
		initItemsList();
		initBancos();
	}
	
	private void initBancos(){
		try {
			bancoList = serviceBanco.getAll();
		} catch (TGServiceException e) {
			super.addErrorMessage(Constants.MESSAGE_ERROR_INIT_LIST);
		}
	}
	
	private void initItemsList(){
		try {
			itemsList = serviceCliente.getAll();
		} catch (TGServiceException e) {
			super.addErrorMessage(Constants.MESSAGE_ERROR_INIT_LIST);
		}
	}
	
	public String getBancoNombre(){
    	String nombreBanco = "NA";
    	try {
    		if(currentItem == null){
    			return nombreBanco;
    		}
			BancoDTO dtoB = serviceBanco.findByPK(currentItem.getIdBanco());
			nombreBanco = dtoB.getNombre();
		} catch (TGServiceException e) {
			super.addErrorMessage(Constants.MESSAGE_ERROR_INIT_LIST);
		}
    	return nombreBanco;
    }
	
	public String addCliente(){
		ClienteDTO cliente = new ClienteDTO();
		cliente.setAmaterno(inputAltaApellidoM);
		cliente.setApaterno(inputAltaApellidoP);
		cliente.setEdad(inputAltaEdad);
		cliente.setIdBanco(inputAltaIdBanco);
		cliente.setNombre(inputAltaNombre);
		try {
			serviceCliente.save(cliente);
			super.addInfoMessage(Constants.MESSAGE_SUCCESS_SAVE);
		} catch (TGServiceException e) {
			super.addErrorMessage(Constants.MESSAGE_ERROR_ADD_DATA);
		}
		return "";
	}
	
	public String cancel(){
		inputAltaApellidoM = null;
		inputAltaApellidoP = null; //TODO
		super.addInfoMessage(Constants.MESSAGE_SUCCESS_SAVE);
		return "";
	}
	
}

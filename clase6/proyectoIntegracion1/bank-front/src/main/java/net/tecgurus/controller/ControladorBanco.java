package net.tecgurus.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;

import net.tecgurus.dto.BancoDTO;
import net.tecgurus.service.BancoService;

@ManagedBean
@ViewScoped
public class ControladorBanco implements Serializable {

	// public List<BancoDTO> itemsList = BancoFactory.instance.getBancInstances();
	public List<BancoDTO> itemsList;
	private String bancoNombre;
	private BancoDTO currentItem;
	//FIX
	@ManagedProperty(value = "#{bancoServiceImpl}")
	private BancoService serviceBanco;
	

	public String aggregaNuevoBanco() {
		BancoDTO banco = new BancoDTO();
		banco.setNombre(bancoNombre);
		banco.setId(itemsList.size() + 1);
		itemsList.add(banco);
		FacesContext.getCurrentInstance().addMessage("", new FacesMessage("Registro guardado exitosamente"));
		bancoNombre = null;
		return "clientes";//return null
	}

	@PostConstruct
	private void metodoDeInicializacion() {
		//itemsList = BancoFactory.getInstance().getBancData();
		//itemsList = new ArrayList<>();
		itemsList = serviceBanco.findAllBancos();
		currentItem = new BancoDTO();
	}

	public List<BancoDTO> getItemsList() {
		return itemsList;
	}

	public void setItemsList(List<BancoDTO> itemsList) {
		this.itemsList = itemsList;
	}

	public String getBancoNombre() {
		return bancoNombre;
	}

	public void setBancoNombre(String bancoNombre) {
		this.bancoNombre = bancoNombre;
	}

	public BancoDTO getCurrentItem() {
		return currentItem;
	}

	public void setCurrentItem(BancoDTO currentItem) {
		this.currentItem = currentItem;
	}

}
package net.tecgurus.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

import net.tecgurus.dto.BancoDTO;
import net.tecgurus.util.BancoFactory;

@ManagedBean
@ViewScoped
public class ControladorBanco implements Serializable{

	//public List<BancoDTO> itemsList = BancoFactory.instance.getBancInstances();
	public List<BancoDTO> itemsList;
	
	
	@PostConstruct
	private void metodoDeInicializacion() {
		//itemsList = BancoFactory.getInstance().getBancData();
		itemsList = new ArrayList<>();
		BancoDTO d1 = new BancoDTO();
		d1.setId(1);
		d1.setNombre("Actinver");
		BancoDTO d2 = new BancoDTO();
		d2.setId(2);
		d2.setNombre("Serfin");
		BancoDTO d3 = new BancoDTO();
		d3.setId(3);
		d3.setNombre("Inverlat");
		BancoDTO d4 = new BancoDTO();
		d4.setId(4);
		d4.setNombre("Monex");
		BancoDTO d5 = new BancoDTO();
		d5.setId(5);
		d5.setNombre("HSBC");
		BancoDTO d6 = new BancoDTO();
		d6.setId(6);
		d6.setNombre("Santander");
		itemsList.add(d1);
		itemsList.add(d2);
		itemsList.add(d3);
		itemsList.add(d4);
		itemsList.add(d5);
		itemsList.add(d6);
	}


	public List<BancoDTO> getItemsList() {
		return itemsList;
	}


	public void setItemsList(List<BancoDTO> itemsList) {
		this.itemsList = itemsList;
	}
	
	
}
package net.tecgurus.util;

import java.util.ArrayList;
import java.util.List;

import net.tecgurus.dto.BancoDTO;

public class BancoFactory {
	
	private List<BancoDTO> list;
	
	private BancoFactory() {
		list = new ArrayList<>();
		BancoDTO bbva = new BancoDTO();
		bbva.setId(1);
		bbva.setNombre("BBVA");
		BancoDTO banamex = new BancoDTO();
		banamex.setId(2);
		banamex.setNombre("Banamex");
		list.add(bbva);
		list.add(banamex);
	}
	
	private static BancoFactory instance = new BancoFactory();

	public static BancoFactory getInstance() {
		return instance;
	}
	
	
	public List<BancoDTO> getBancData(){
		return list;
	}
	
	public void addBanco(BancoDTO dto) {
		list.add(dto);
	}
	
}

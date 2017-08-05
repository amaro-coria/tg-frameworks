package net.tecgurus.util;

import java.util.ArrayList;
import java.util.List;

import net.tecgurus.dto.BancoDTO;

public class BancoFactory {
	
	private List<BancoDTO> list;
	
	private BancoFactory() {
		list = new ArrayList<>();
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
		list.add(d1);
		list.add(d2);
		list.add(d3);
		list.add(d4);
		list.add(d5);
		list.add(d6);
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

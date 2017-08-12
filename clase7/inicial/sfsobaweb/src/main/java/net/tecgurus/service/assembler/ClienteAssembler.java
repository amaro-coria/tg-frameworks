package net.tecgurus.service.assembler;

import org.springframework.stereotype.Component;

import net.tecgurus.dto.ClienteDTO;
import net.tecgurus.entities.Banco;
import net.tecgurus.entities.Cliente;

@Component
public class ClienteAssembler extends Assembler<ClienteDTO, Cliente> {

	@Override
	public ClienteDTO getDTOTransform(Cliente mapping) {
		if (mapping == null) {
			return null;
		}
		ClienteDTO dto = new ClienteDTO();
		dto.setAmaterno(mapping.getAmaterno());
		dto.setApaterno(mapping.getApaterno());
		dto.setEdad(mapping.getEdad());
		dto.setIdBanco(mapping.getBanco().getIdBanco());
		dto.setIdCliente(mapping.getIdCliente());
		dto.setNombre(mapping.getNombre());
		return dto;
	}

	@Override
	public Cliente getMappingTransform(ClienteDTO dto) {
		if (dto == null) {
			return null;
		}
		Cliente cliente = new Cliente();
		cliente.setAmaterno(dto.getAmaterno());
		cliente.setApaterno(dto.getApaterno());
		cliente.setEdad(dto.getEdad());
		cliente.setNombre(dto.getNombre());
		if (dto.getIdBanco() != null) {
			Banco banco = new Banco();
			banco.setIdBanco(dto.getIdBanco());
			cliente.setBanco(banco);
		}
		if (dto.getIdCliente() != null) {
			cliente.setIdCliente(dto.getIdCliente());
		}
		return cliente;
	}

}

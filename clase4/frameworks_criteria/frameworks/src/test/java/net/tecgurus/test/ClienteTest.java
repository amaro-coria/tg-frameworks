package net.tecgurus.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import net.tecgurus.entities.Banco;
import net.tecgurus.entities.Cliente;
import net.tecgurus.persistence.dao.ClienteDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class ClienteTest {
	
	@Autowired
	private ClienteDAO daoCte;

	@Test
	@Transactional
	public void test() {
		printCtes(daoCte.findAll());
		System.out.println("Metodo 1");
		printCtes(daoCte.findMatches("JORGE", "AMARO", "CORIA"));
		System.out.println("Metodo 2");
		printCtes(daoCte.findMatches2("JORGE", "AMARO", "CORIA"));
		System.out.println("Metodo 3");
		printCtes(daoCte.findMatches3("JORGE", "AMARO", "CORIA"));
		System.out.println("Encontrando por rango de edades");
		printCtes(daoCte.findMatches(20, 30));
		System.out.println("######################Pruebas contra querys de bancos");
		System.out.println("Primer metodo");
		printCtes(daoCte.findFromBanco(13));
		System.out.println("Segundo metodo");
		printCtes(daoCte.findFromBanco("TEK_BANKO"));
		System.out.println("Tercer metodo");
		Banco b = new Banco();
		b.setIdBanco(3);
		b.setNombre("TEC_BANKO_333");
		printCtes(daoCte.findFromBanco(b));

	}
	
	@Test
	@Transactional
	public void testCriteria() {
		System.out.println("Test de criteria");
		System.out.println("Todos los clientes desde criteria");
		printCtes(daoCte.findAllByCriteria());
		System.out.println("Todas las coincidencias por nombre");
		printCtes(daoCte.findMatchesFromCriteria("jorge", "amaro", "coria"));
		System.out.println("Todas las coincidencias por edad");
		printCtes(daoCte.findMatchesFromCriteria(20, 30));
		System.out.println("Contra banco por id");
		printCtes(daoCte.findFromBancoCriteria(3));
		System.out.println("Contra banco por nombre");
		printCtes(daoCte.findFromBancoCriteria("TEC_BANCO"));
	}

	private void printCtes(List<Cliente> list) {
		if(list == null) {
			System.out.println("La lista es nula");
			return;
		}
		for(Cliente c : list) {
			System.out.println(c.getNombre() + c.getApaterno() + c.getAmaterno() + ":"+c.getIdCliente());
		}
	}
	
}

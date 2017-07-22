package net.tecgurus.test;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.transaction.annotation.Transactional;

import junit.framework.Assert;
import net.tecgurus.entities.Banco;
import net.tecgurus.persistence.dao.BancoDAO;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class BancoTest {

	@Autowired
	private BancoDAO dao;
	
	@Test
	@Transactional
	public void test() {
		System.out.println("Finding all bancos");
		System.out.println(dao.findAllBancos() == null);
		System.out.println("Ended");
	}
	
	@Test
	@Transactional
	public void testABC() {
		Banco nuevoBanco = new Banco();
		//nuevoBanco.setIdBanco(1);
		nuevoBanco.setNombre("BBVA");
		Integer i = dao.addBanco(nuevoBanco);
		Assert.assertNotNull(i);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

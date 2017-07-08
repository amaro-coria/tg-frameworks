package net.tecgurus.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import net.tecgurus.service.Programador;

public class Main {

	public static void main(String[] args) {
		System.out.println("-----Iniciando practicas");
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Programador programador1 = appCtx.getBean(Programador.class);
		System.out.println(programador1.evaluaPalindromo("ANA"));
		System.out.println(programador1.evaluaPalindromo("ANN"));
	}

}

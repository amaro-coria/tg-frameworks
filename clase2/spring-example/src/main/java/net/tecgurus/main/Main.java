package net.tecgurus.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import net.tecgurus.service.HelloWorldService;
import net.tecgurus.service.ProcesaSaludo;

public class Main {

	public static void main(String[] args) {
		/*
		HelloWorldService servicio = new HelloWorldServiceImpl();
		System.out.println(servicio.hello());
		 */
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloWorldService service = appContext.getBean(HelloWorldService.class);
		System.out.println(service.hello());
		
		System.out.println("Comienza segundo output---------------------");
		ProcesaSaludo proceSaludo = appContext.
				getBean(ProcesaSaludo.class);
		System.out.println(proceSaludo.
				saludoPersonalizado());
				
	}

}

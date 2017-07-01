package net.tecgurus.main;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;

import net.tecgurus.ws.WebServiceTestService;

public class Main {
	
	public static void main(String args[]) throws MalformedURLException {
		WebServiceTestService claseDeWebServ = 
				new WebServiceTestService(new URL("http://localhost:8080/WebServiceTest"), 
						new QName("http://ws.tecgurus.net/", "WebServiceTestService"));
		System.out.println(claseDeWebServ.getWebServiceTestPort().saluda("Cliente de Java!!!"));
	}

}

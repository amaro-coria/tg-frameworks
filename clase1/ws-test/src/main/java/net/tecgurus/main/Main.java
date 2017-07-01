package net.tecgurus.main;

import javax.xml.ws.Endpoint;

import net.tecgurus.ws.WebServiceTest;

public class Main {
	
	public static void main(String args[]) {
		
		
		
		Endpoint.publish("http://localhost:8080/WebServiceTest", 
				new WebServiceTest());
	}

}

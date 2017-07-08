package net.tecgurus.service.impl;

import org.springframework.stereotype.Component;

import net.tecgurus.service.HelloWorldService;

@Component
public class HelloWorldServiceImpl implements HelloWorldService {

	@Override
	public String hello() {
		return "Hola mundo";
	}

}

package com.leecottrell.simplewebservice;

import javax.swing.Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.sprinframework.web.bind.annotation.RequestMethod;
import org.sprinframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SimplewebserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimplewebserviceApplication.class, args);
	}

	@RequestMapping(value="Z", method=RequestMethod.GET)
public ResposeEntity<string> getResponse(){
	string response = "<g1>It works</h1>";


	return new ResponseEntity<String>(response, httpStatus.OK);

} 

@RequestMapping(value"/", method=ResquestMethod.POST)
public ResposeEntity<String> postResponse(){
	String response = "not implement yet";

	return new ResponseEntity<String>(response, HttpStatus.NOT_IMPLEMENTED);

}

}

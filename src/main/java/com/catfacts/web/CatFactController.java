package com.catfacts.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.catfacts.business.CatFact;

@RestController
@RequestMapping(path="/cat-facts")
public class CatFactController {
	
	// https://howtodoinjava.com/spring-boot2/resttemplate/spring-restful-client-resttemplate-example/
	// https://apipheny.io/free-api/#apis-without-key
	@GetMapping(path="/")
	public CatFact getEmployees()
	{
	    final String uri = "https://catfact.ninja/fact";

	    RestTemplate restTemplate = new RestTemplate();
	    //String result = restTemplate.getForObject(uri, String.class);
	    CatFact catFact = restTemplate.getForObject(uri, CatFact.class);

	    //System.out.println(result);
	    return catFact;
	}

}

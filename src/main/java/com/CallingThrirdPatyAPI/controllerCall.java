package com.CallingThrirdPatyAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class controllerCall {
	
	
	@GetMapping("/callclient")
	private String  getHelloClient()
	{
		String uri="http://localhost:9001/hello";
		RestTemplate restTemplate = new RestTemplate();
		String result =restTemplate.getForObject(uri,String.class);			
		return result;
		
	}
}

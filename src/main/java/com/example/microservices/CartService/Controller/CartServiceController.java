package com.example.microservices.CartService.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CartServiceController {
	@Autowired
	private RestTemplate template;

	@GetMapping("/home")
	public String getMycart() {
		ResponseEntity<String> response=template.getForEntity("http://ProductService/home", String.class);
		String response1=response.getBody();
		return response1;
	}


}

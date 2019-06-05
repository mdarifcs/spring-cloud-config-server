package com.example.client.service.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RefreshScope
public class ClientResource {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${insurance.provider.url}")
	private String url;

	@GetMapping("/getPlan")
	public List<String> getPlans() {
		System.out.println("URL: "+url);
		return restTemplate.getForObject(url, List.class);
	}
	
}

package com.example.insurance.provider.resource;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/insurance-service")
public class InsuranceResource {

	@GetMapping("/getUpdatePlans")
	public List<String> getPlans() {
		return Stream.of("premium","gold","platinum").collect(Collectors.toList());
	}
	
}

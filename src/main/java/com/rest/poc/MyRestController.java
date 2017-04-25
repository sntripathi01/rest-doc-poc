package com.rest.poc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
@RequestMapping("/demo")
	public ServiceReponse demoService(@RequestParam String id) {
		ServiceReponse reponse = new ServiceReponse();
		reponse.setId(id);
		reponse.setName("Sachi");
		return reponse;
	}

}

package com.hongkongcoder.salon.controller;



import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hongkongcoder.salon.model.SalonServiceDetail;
import com.hongkongcoder.salon.repository.SalonServiceDetailRepository;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api/services")
@CrossOrigin(origins="http://localhost:3000")
public class SalonController {

	private final SalonServiceDetailRepository repoSalonDetails;
	


    public SalonController(SalonServiceDetailRepository repoSalonDetails) {
		super();
		this.repoSalonDetails = repoSalonDetails;
	}



	@GetMapping(
			name = "RetrieveAvailableSalonServicesAPI."
			,value =  "/retrieveAvailableSalonServices"
	)
    public Flux<SalonServiceDetail>get() {
		return repoSalonDetails.findAll();
    }
    
}

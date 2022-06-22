package com.cba.api.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cba.api.model.CouchbaseModel;
import com.cba.api.repo.CouchbaseRepo;
import org.springframework.http.HttpStatus;


@RestController
@RequestMapping("/farms")
public class CouchbaseControler {
	
	 @Autowired
	    private CouchbaseRepo farmsRepo;
	 
	 @PostMapping
	    @ResponseStatus(HttpStatus.CREATED)
	    public String saveCustomer(@RequestBody CouchbaseModel farms) {
	        farmsRepo.save(farms);
	        return "customer saved successfully!!";
	    }
	 
	 @GetMapping
	    @ResponseStatus(HttpStatus.OK)
	    public List<CouchbaseModel> getAllFarms() {
	        return farmsRepo.findAll();
	    }

}

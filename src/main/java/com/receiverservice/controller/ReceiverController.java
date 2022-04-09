package com.receiverservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.receiverservice.entities.Transaction;
import com.receiverservice.service.ReceiverService;

@RestController
@RequestMapping("/receiver")
public class ReceiverController {
	@Autowired
	private ReceiverService receiverService;
	
	@PostMapping(path="/receiveTransaction")
	public ResponseEntity<Transaction> decryptTransactionObject(@RequestBody Transaction t) {
		return receiverService.receieveTransaction(t);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Transaction> getScreen(@PathVariable("id") String id){
		return new ResponseEntity<Transaction>(receiverService.getTransByAccountNo(id),HttpStatus.OK);
	}
}

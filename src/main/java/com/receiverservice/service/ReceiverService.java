/**
 * 
 */
package com.receiverservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.receiverservice.decryption.DecryptObject;
import com.receiverservice.entities.Transaction;
import com.receiverservice.repositories.TransactionRepositories;

/**
 * @author amitabh
 *
 */
@Service
public class ReceiverService {
	
	@Autowired
	TransactionRepositories transactionRepository;

	public ResponseEntity<Transaction> receieveTransaction(Transaction t) {
		System.out.println("encrypted" + t.toString());
		t.setAccountNumber(DecryptObject.decrypt(t.getAccountNumber()));
		t.setAccountFrom(DecryptObject.decrypt(t.getAccountFrom()));
		t.setAmount(DecryptObject.decrypt(t.getAmount()));
		t.setCurrency(DecryptObject.decrypt(t.getCurrency()));
		t.setType(DecryptObject.decrypt(t.getType()));
		System.out.println("decrypted" + t.toString());
		t = transactionRepository.save((t));
		System.out.println("added to db");
		return new ResponseEntity<Transaction>(t, new ResponseEntity<>(HttpStatus.ACCEPTED).getStatusCode());

	}

	public Transaction getTransByAccountNo(String id) {
		return transactionRepository.findById(id).get();

	}
}

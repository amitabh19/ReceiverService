/**
 * 
 */
package com.receiverservice.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author amitabh
 *
 */
@Entity
public class Transaction {
	
	@Id
	private String accountNumber;
	private String type;
	private String amount;
	private String currency;
	private String accountFrom;
	
	
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Transaction(String accountNumber, String type, String amount, String currency, String accountFrom) {
		super();
		this.accountNumber = accountNumber;
		this.type = type;
		this.amount = amount;
		this.currency = currency;
		this.accountFrom = accountFrom;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getAccountFrom() {
		return accountFrom;
	}

	public void setAccountFrom(String accountFrom) {
		this.accountFrom = accountFrom;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountFrom == null) ? 0 : accountFrom.hashCode());
		result = prime * result + ((accountNumber == null) ? 0 : accountNumber.hashCode());
		result = prime * result + ((amount == null) ? 0 : amount.hashCode());
		result = prime * result + ((currency == null) ? 0 : currency.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transaction other = (Transaction) obj;
		if (accountFrom == null) {
			if (other.accountFrom != null)
				return false;
		} else if (!accountFrom.equals(other.accountFrom))
			return false;
		if (accountNumber == null) {
			if (other.accountNumber != null)
				return false;
		} else if (!accountNumber.equals(other.accountNumber))
			return false;
		if (amount == null) {
			if (other.amount != null)
				return false;
		} else if (!amount.equals(other.amount))
			return false;
		if (currency == null) {
			if (other.currency != null)
				return false;
		} else if (!currency.equals(other.currency))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Transaction [accountNumber=" + accountNumber + ", type=" + type + ", amount=" + amount + ", currency="
				+ currency + ", accountFrom=" + accountFrom + "]";
	}
	
	

}

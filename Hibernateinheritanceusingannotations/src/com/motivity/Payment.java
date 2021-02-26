package com.motivity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.DiscriminatorType;

@Entity
@Table(name="payment")
public class Payment {
   @Id
   @Column(name="paymentid")
   private int paymentid;
	
   @Column(name="amount")
   private int amount;
   
   public int getPaymentid() {
	return paymentid;
   }
   public void setPaymentid(int paymentid) {
	this.paymentid = paymentid;
   }
   public int getAmount() {
	return amount;
   }
   public void setAmount(int amount) {
	this.amount = amount;
   }
   
}

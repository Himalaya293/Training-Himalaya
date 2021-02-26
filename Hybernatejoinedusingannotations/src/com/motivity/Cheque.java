package com.motivity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="cheque")
@PrimaryKeyJoinColumn(name="pid")  


public class Cheque extends Payment {

	@Column(name="cctype")
	private String cctype;

	public String getCctype() {
		return cctype;
	}

	public void setCctype(String cctype) {
		this.cctype = cctype;
	}
}

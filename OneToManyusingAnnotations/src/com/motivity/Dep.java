package com.motivity;

import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name="dep")
public class Dep {
	@Id
	@Column(name="did")
	private int did;

	@Column(name="dname")
	private String dname;
	
	@Column(name="dcode")
	private String dcode;
	

	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="dep_id",referencedColumnName="did")
	private Set<Hima> hima;
	
	public Set<Hima> getHima() {
		return hima;
	}

	public void setHima(Set<Hima> hima) {
		this.hima = hima;
	}
	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getDcode() {
		return dcode;
	}

	public void setDcode(String dcode) {
		this.dcode = dcode;
	}
	

	
}

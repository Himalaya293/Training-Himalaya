package com.onetomany;

import java.util.Set;

public class Dep {
       
	private int did;
	private String dname;
	private String dcode;
	private Set<Hima> hima;
	
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
	public Set<Hima> getHima() {
		return hima;
	}
	public void setHima(Set<Hima> hima) {
		this.hima = hima;
	}
	
}

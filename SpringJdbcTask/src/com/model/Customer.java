package com.model;

public class Customer {
	
	public int cid;
	public String cname;
	public String caddress;
	
	

	
	public Customer() {
		//super();
	}

public Customer(int cid, String cname, String caddress) {
		//super();
		this.cid = cid;
		this.cname = cname;
		this.caddress = caddress;
	}


	public int getCid() {
	return cid;
}


	public String getCname() {
		return cname;
	}


public String getCaddress() {
		return caddress;
}

@Override
public String toString() {
	return "Customer [cid=" + cid + ", cname=" + cname + ", caddress=" + caddress + "]";
}
	

}

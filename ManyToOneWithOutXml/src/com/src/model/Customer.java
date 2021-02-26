package com.src.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;

@Entity
@Table(name="c4")
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int cid;
	private String name;
	
	
	
	@ManyToOne(targetEntity= Product.class,cascade= CascadeType.ALL)
	private Product p;



	public int getCid() {
		return cid;
	}



	public void setCid(int cid) {
		this.cid = cid;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Product getP() {
		return p;
	}



	public void setP(Product p) {
		this.p = p;
	}
	
	
	
}
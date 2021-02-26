package com.src.model;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="user3")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int uid;
private String username;
@ManyToMany(targetEntity = Product.class,cascade = CascadeType.ALL)
@JoinTable(name="que300_ans300",
joinColumns = {@JoinColumn(name="uid")},
inverseJoinColumns = {@JoinColumn(name="pid")})
private List<Product> products;
public int getUid() {
	return uid;
}
public void setUid(int uid) {
	this.uid = uid;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public List<Product> getProducts() {
	return products;
}
public void setProducts(List<Product> products) {
	this.products = products;
}


}

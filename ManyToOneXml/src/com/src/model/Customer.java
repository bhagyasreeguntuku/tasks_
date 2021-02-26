package com.src.model;



public class Customer {

	

		
		private int cid;
		private String name;
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
		@Override
		public String toString() {
			return "Customer [cid=" + cid + ", name=" + name + ", p=" + p + "]";
		}
		
		
		
		
	
}

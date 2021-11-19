package com;

public class Sum extends Mult {
	
	public Sum() {
		
	}
	
	int n3;
	int n4;
	public Sum(int n3, int n4) {
		
		this.n3 = n3;
		this.n4 = n4;
	}
	public int getN3() {
		return n3;
	}
	public void setN3(int n3) {
		this.n3 = n3;
	}
	public int getN4() {
		return n4;
	}
	public void setN4(int n4) {
		this.n4 = n4;
	}
	
	
	
	@Override
	public String toString() {
		return "Sum [n3=" + n3 + ", n4=" + n4 + ", n1=" + n1 + ", n2=" + n2 + "]";
	}
	
	
	

}

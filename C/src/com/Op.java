package com;

public class Op extends Sum {
	
	public Op() {
		
	}

	int sum=n3 + n4;

	int mult = n1 * n2;

	public Op(int sum, int mult) {
		super();
		this.sum = sum;
		this.mult = mult;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public int getMult() {
		return mult;
	}

	public void setMult(int mult) {
		this.mult = mult;
	}

	@Override
	public String toString() {
		return "Op [sum=" + sum + ", mult=" + mult + ", n3=" + n3 + ", n4=" + n4 + ", n1=" + n1 + ", n2=" + n2 + "]";
	}
	
	
	

}

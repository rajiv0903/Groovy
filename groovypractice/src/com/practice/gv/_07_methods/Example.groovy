package com.practice.gv._07_methods

class Example {

	//Instance methods
	int x;

	public int getX() {
		return x;
	}
	public void setX(int pX) {
		x = pX;
	}

	static def DisplayName() {
		println("This is how methods work in groovy");
		println("This is an example of a simple method");
	}
	//Default Parameters
	static void sum(int a,int b = 5) {
		int c = a+b;
		println(c);
	}
	//Method Return Values
	static int sumRet(int a,int b = 5) {
		int c = a+b;
		return c;
	}


	static void main(String[] args) {
		DisplayName();
		sum(6);
		println(sumRet(6));
		
		Example ex = new Example();
		ex.setX(100);
		println(ex.getX());
	}

}

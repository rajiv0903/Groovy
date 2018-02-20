package com.practice.gv._29_unit_testing

class Example {
	static void main(String[] args) {
		Student mst = new Student();
		mst.name = "Joe";
		mst.ID = 1;
		println(mst.Display())
	}
}

public class Student {
	String name;
	int ID;

	String Display() {
		return name +ID;
	}
}


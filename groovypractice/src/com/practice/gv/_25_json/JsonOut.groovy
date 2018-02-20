package com.practice.gv._25_json

import groovy.json.JsonOutput

class JsonOut {

	static void main(String[] args) {

		def output1 = JsonOutput.toJson([name: 'John', ID: 1])
		println(output1);


		def output2 = JsonOutput.toJson([
			new Student(name: 'John',ID:1),
			new Student(name: 'Mark',ID:2)
		])
		println(output2);
	}
}

class Student {
	String name
	int ID;
}

package com.practice.gv._21_closures

class Example {

	def static Display(clo) {
		// This time the $param parameter gets replaced by the string "Inner"
		clo.call("Inner");
	 }
	 
	static void main(String[] args) {
		def str1 = "Hello";
		def clos = {param -> println "${str1} ${param}"}
		clos.call("World");

		// We are now changing the value of the String str1 which is referenced in the closure
		str1 = "Welcome";
		clos.call("World");
		
		// Passing our closure to a method
		Example.Display(clos);
		
		//Using Closures with Lists
		def lst = [11, 12, 13, 14];
		lst.each {println it}
		
		//Using Closures with Maps
		def mp = ["TopicName" : "Maps", "TopicDescription" : "Methods in Maps"]
		mp.each {println it}
		mp.each {println "${it.key} maps to: ${it.value}"}
		
	}
}

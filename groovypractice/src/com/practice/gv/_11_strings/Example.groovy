package com.practice.gv._11_strings

class Example {

	static void main(String[] args) {

		String a = 'Hello Single';
		String b = "Hello Double";
		String c = "'Hello Triple" + "Multiple lines'";

		println(a);
		println(b);
		println(c);

		//String Indexing
		String sample = "Hello world";
		println(sample[4]); // Print the 5 character in the string

		//Print the 1st character in the string starting from the back
		println(sample[-1]);
		println(sample[1..2]);//Prints a string starting from Index 1 to 2
		println(sample[4..2]);//Prints a string starting from Index 4 back to 2

		//String Repetition
		String a1 = "Hello";

		println("Hello"*3);
		println(a1*3);

		//regular expression
		String a2 = "Hello World";

		println(a2.matches("Hello"));
		println(a2.matches("Hello(.*)"));

	}
}

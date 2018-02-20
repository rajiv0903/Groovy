package com.practice.gv._06_decision_making

class Example {

	static void main(String[] args) {
		// Initializing a local variable
		int a = 2

		//Check for the boolean condition
		if (a<100) {
			//If the condition is true print the following statement
			println("The value is less than 100");
		}
		else {
			//If the condition is false print the following statement
			println("The value is greater than 100");
		}

		//Evaluating the expression value
		switch(a) {
			//There is case statement defined for 4 cases
			// Each case statement section has a break condition to exit the loop

			case 1:
				println("The value of a is One");
				break;
			case 2:
				println("The value of a is Two");
				break;
			case 3:
				println("The value of a is Three");
				break;
			case 4:
				println("The value of a is Four");
				break;
			default:
				println("The value is unknown");
				break;
		}


		//Initializing 2 variables i and j
		int i = 0;
		int j = 1;

		// First evaluating the value of variable i
		switch(i) {
			case 0:
			// Next evaluating the value of variable j
				switch(j) {
					case 0:
					println("i is 0, j is 0");
					break;
					case 1:
					println("i is 0, j is 1");
					break;

					// The default condition for the inner switch statement
					default:
					println("nested default case!!");
				}
				break;

			// The default condition for the outer switch statement
			default:
				println("No matching case found!!");
		}
	}
}

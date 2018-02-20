package com.practice.gv._05_loops

class Example {

	static main(args) {

		int count = 0;

		while(count<5) {
			println(count);
			count++;
		}

		for(int i = 0;i<5;i++) {
			println(i);
		}

		int[] array = [0, 1, 2, 3];

		for(int i in array) {
			println(i);
			if(i == 2)
				break;
		}

		for(int i in 1..5) {
			println(i);
		}

		for(int i in 1..5) {
			if(i == 2)
				continue;
			println(i);
		}
	}
}

package com.practice.gv._15_date_time

class Example {

	static void main(String[] args) {
		Date date = new Date();
		// display time and date using toString()
		System.out.println(date.toString());

		//January 1, 1970, 00:00:00 GMT.
		Date date2 = new Date(100);
		// display time and date using toString()
		System.out.println(date2.toString());
	}
}

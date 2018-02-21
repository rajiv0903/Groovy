package com.practice.gv._12_ranges

class Example {

	static void main(String[] args) {
		//Get the lower value of this Range.
		def rint = 1..10;
		println(rint.getFrom());

		//Get the upper value of this Range.
		println(rint.getTo());

		//sub list
		println(rint.subList(1,4));
		println(rint.subList(4,8));
	}
}

package com.practice.gv._20_traits

class ExtendingTraits {
	static void main(String[] args) {
		Student st = new Student();
		st.StudentID = 1;
		st.DisplayMarks();
	}
}

trait Marks {
	void DisplayMarks() {
		println("Marks1");
	}
}

trait Total extends Marks {
	void DisplayMarks() {
		println("Total");
	}
}

class Student implements Total {
	private int StudentID;
}


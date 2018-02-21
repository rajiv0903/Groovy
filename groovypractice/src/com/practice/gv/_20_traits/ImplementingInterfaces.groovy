package com.practice.gv._20_traits

class ImplementingInterfaces {

	static void main(String[] args) {
		Student st = new Student();
		st.StudentID = 1;
		st.Marks1 = 10;

		st.DisplayMarks();
		st.DisplayTotal();
	}
}

interface Total {
	void DisplayTotal()
}

trait Marks implements Total {
	void DisplayMarks() {
		println("Display Marks");
	}

	void DisplayTotal() {
		println("Display Total");
	}
}

class Student implements Marks {
	int StudentID
	int Marks1;
}

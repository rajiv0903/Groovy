package com.practice.gv._29_unit_testing

class StudentTest extends GroovyTestCase {
	
   void testDisplay() {
      def stud = new Student(name : 'Joe', ID : '1')
      def expected = 'Joe1'
      assertToString(stud.Display(), expected)
   }
}

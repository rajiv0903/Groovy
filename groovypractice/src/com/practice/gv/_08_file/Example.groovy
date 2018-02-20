package com.practice.gv._08_file

class Example {

	static main (args) {
		
		// Writing to Files
		new File('E:/','Example.txt').withWriter('utf-8') {
			writer -> writer.writeLine 'Hello World'
		}
		
		// Reading files
		new File("E:/Example.txt").eachLine { 
			 line -> println "line : $line"; 
		}
		 
		// Reading the Contents of a File as an Entire String
		 File file = new File("E:/Example.txt") 
		 println file.text;
		 
		
		// Testing if a File is a Directory
		 def fileD = new File('E:/') 
		 println "File? ${fileD.isFile()}" 
		 println "Directory? ${fileD.isDirectory()}"
		 
	}
}

package com.practice.gv._25_json

import groovy.json.JsonSlurper

class JsonParser {

	static void main(String[] args) {
		//Parsing Text
		def jsonSlurper = new JsonSlurper()
		def object = jsonSlurper.parseText('{ "name": "John", "ID" : "1"}')
		println(object.name);
		println(object.ID);

		//Parsing List of Integers
		Object lst = jsonSlurper.parseText('{ "List": [2, 3, 4, 5] }')
		lst.each { println it }

		//Parsing List of Primitive Data types
		def obj = jsonSlurper.parseText ''' {"Integer": 12, "fraction": 12.55, "double": 12e13}'''
		println(obj.Integer);
		println(obj.fraction);
		println(obj.double);
	}
}

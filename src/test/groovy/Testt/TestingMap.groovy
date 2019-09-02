package Testt

import groovy.json.JsonSlurper

class TestingMap {
    static int c
  // static JsonSlurper json2
    static void main(String[] args)
    {
      //  def map = [name: "Jerry", age: 42, city: "New York"]
        String json1 = '''
  {
  "name": "John",  
  "age": 20
  }
 '''
       def json2 = new JsonSlurper().parseText(json1)
                json2 << [
               age: "5"
       ]
        println json2
        c = add(10, 20)
        println c
    }
   static int add(int a, int b)
    {
        c = a + b
        return c
    }
}

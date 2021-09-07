/*
This is the entry point of the program i.e 
main method
*/
fun main(args:Array<String>) {
  println("Hello World")

  // Variables and Datatypes
  var name = "Sadeeq" //string
  var age = 20 //integer
  var cgpa = 4.6 //float
  val surname = "Ismail"  //constant

  //variable declaration
  var school:String 
  school = "Modibbo Adama University Yola"
  println("I am ${name} ${surname}")
  println("age ${age}")
  println("my cgpa is ${cgpa}")
  
  //object initialization
  var person1 = Person()
  person1.display(name)

  
  var person2 = Person()
  person2.myName = "Ihsan"
  person2.display(person2.myName);

  var car1 = Car("Honda")
  car1.description()
}

// class defination
class Person {

  //class variables
  var myName:String = "";

  //class method
  fun display(name:String){
    println("pheww "+name)
    println(myName)
  }
}
class Car(var name:String){

  fun description(){
    println("the name of this car is ${name}")
  }
}
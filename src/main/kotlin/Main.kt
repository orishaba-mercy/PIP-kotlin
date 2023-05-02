fun main() {
   myDetails("Lucy",23,"keyan")
   println( getAddition(4,5,2,3))
   println(getAverage(7,78,34,23,23))
   personsRecords("okoti",11,"78932217176","orishabamer@gmai.com",67.0,"ugandan")





}
//. Create and invoke a function that takes in a users name, age, and nationality and prints out “Hello my name is ${name}, I am ${age} and I am from ${nationality}” e.g
//given “Lucy”, 23, and “Kenya” it will print out “Hello my name is Lucy, I am 23 years old and I am from Kenya” (2 points)
fun myDetails(name:String,age:Int,nationality:String){
   println("Hello my name is $name,I am $age years old and i am from $nationality")

}
//2. Create and invoke a function that returns the sum of any given 4 numbers (3 points)
fun getAddition(num1:Int,num2: Int,num3: Int,num4: Int):Int{
   var numbers =num1+num2+num3+num4
   return numbers
   println(getAverage(7,78,34,23,23))
}
//
//3. Create and invoke a function that given any 5 numbers, it returns their average (2 points)
fun getAverage(num1: Int,num2: Int,num3: Int,num4: Int,num5: Int):Int{
   var sum=num1+num2+ num3+num4+num5
   var average=sum/5
   return average

}
//
//4. You are creating an app to capture a person’s records. Some of the data you will
//capture includes full name, age, phone number, email, weight in kg, and citizen. For the
//citizen field, you will track whether a student is a Ugandan or not. (3 points)
fun personsRecords(fullName:String,age:Int,phoneName: String,email:String,weight:Double,citizen:String){
   var citizens ="uganda"
   if (citizens===citizens)
      println(true)
   else{
      println(false)
   }



}
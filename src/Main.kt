fun main() {
    println("Hello World!")

    val x : Int = 9
    println("The value of x is $x")

    val b = 3L
    println("The val of b is  $b and its a long number !")

    val c =3.33 // double for more precision and takes space
    println("The value of c is $c and its decimal ")

    val d = 3.33f // float takes less space and store less precision
    println("The value of d is $d its a float ")

    //Arithmetic op
    val e = 3*4
    println("The value of e is $e")

    val f = 3 /4
    println("f is division $f")

    val g = 3/4.toDouble()    // to get the ans in float
    println("e is division $g")

    /// Boolean plus comparison op
    val amAdult = true
    val amProgrammer = false
//    val amAdultProgrammer = amAdult && amProgrammer
//    val amAdultProgrammer = amAdult == amProgrammer
//    val amAdultProgrammer = amAdult ||  amProgrammer
//    val amAdultProgrammer = amAdult !=  amProgrammer
    val amAdultProgrammer = !( amAdult !=  amProgrammer)
    println("The ans for am Adult Plus Programmer is $amAdultProgrammer")


//    conditions
    val z = 1+7
    if (z == 10){
       println("Yes , Z is 10")
    }else  if(z == 9){
        println("Okay , Z is 9")
    }else {
        println("Z is neither 10 or 9 ")
    }

   //shortcut of if
   val u = if(z == 9) "yess" else "no"
    println(u)

   // null value
   val k : Int? = null
   println("Here k is Null  : $k")

   val i = readLine()
   val o = readLine()
   val h = i!!.toInt() + o!!.toInt()  // may crase our code so use the below one
    println("Sum i + o is $h")


  val num1 = readLine() ?: "0"
    val num2= readLine() ?: "0"
    val sum = num1.toInt() + num2.toInt()
    println("A better way to calculate - $sum")



  // Lists
  val shoppingList = mutableListOf<String>("Face Wash", "Body Wash","Diet Coke")
    println(shoppingList[1]) //fetch element using index
   shoppingList.add("Highlighter") // add element
    println("Full shopping list : $shoppingList")
    // change he list to mutable so we can add the item




    // Iterate through list
    var j = 0
    while(j < shoppingList.size){
        println(shoppingList[j])
        j++
    }

    for(x in shoppingList) {
        println("For Loop Used to Print - $x")
    }

    for (i in 1..20) {
        println(i)
    }

  //when expression
    val xy = 8

    when(xy){
     in 1..4 -> println("value is in range 1 to 4")
     in 5..10 -> println("value is in range 5 to 10")
        else -> {
            println("Value is not where")
        }
    }

    /// Functions
    fun printNum() {
        for(i in 1..30){
            println(i)
        }
    }

    fun isEven(number : Int) : Boolean{
        return number % 2 == 0
    }

    //extention function
    fun Int.isOdd() : Boolean{
        return this % 2 == 1
    }

    printNum()
    val even = isEven(9)
    println(even)
    val odd =9
    println(odd.isOdd())


    ///classInstance
    val dog = Dog()
    dog.makeSound()


    val cat = Cat()
    cat.makeSound()



    /// Anonymous function
    var bear  = object: Animal("Camme Bear", 4){
        override fun makeSound() {
            println("Roarrhhhhh !!!")
        }
    }

    println(bear.makeSound())

    //try and catch
    val number1 = readLine()  ?: "0"
    val number2 = readLine()  ?: "0"
    val parsedNumber = try{
      number1.toInt() + number2.toInt()
    }catch(e : Exception) {
        0
    }

    println(parsedNumber)

}
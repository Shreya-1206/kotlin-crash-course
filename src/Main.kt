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

}
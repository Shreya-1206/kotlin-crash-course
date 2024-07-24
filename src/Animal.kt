abstract class Animal (
    val name : String,
    val legCount : Int
) {

    //Init runs when we create instnce
    init{
        println("Hello I am In the Category of the $name and I have $legCount legs")
    }

    abstract fun makeSound()  // abstract function
}
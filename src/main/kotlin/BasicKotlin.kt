fun myFun3() {
    println("I am function 3")
}

fun main() {

    var name = "vaibhav"
    name = "vinayak"

//    var num : Float = 10.0007f
//    println(num)
//
//    val input = readln().toInt()
//
//    println(input + 10)

    var char = 'a'
    var str = "vaibhav"

    val array = arrayOf(1,2,69,7,3,4,13)

    println(array.size)

    val myArray : Array<Int> = arrayOf()



    val arrayOfChar = arrayOf('a', 'c','d')

   // println(array[3])

    println(calculateTip(serviceType = "Good", costOfService =  1000))


//    println("Hello World!")
//
//    var myName  = "vaibhav"
//    val phn = 98967676868
//    val myChar = 'a'
//    val decimal = 0.9
//    var new = "sanny"
//
//    myName = "raj"
//
//    println(myName)
//
//    var num = 1
//
//    while(num <= 10 ) {
//        println(num)
//        num = num + 1
//    }
//
//    do {
//      println(num)
//    }while (num <= 10)
//    println()
//
//    for (i in 21..30) {
//        println(i)
//    }

//    val myCGPA = 7.5
//
//    if(myCGPA > 8) {
//        println("I am a topper")
//    }else if (myCGPA > 7.5) {
//        println("I m good")
//
//    }else if (myCGPA > 7){
//        println("i care")
//    } else {
//        println("I dont care ")
//    }
//
//    myFun()
//    myFun2()
//
//    var starbucksCoffee: String = "chai"

}

fun myFun() {
    println("I m  a function and I am being called")
}

fun myFun2() {
    println("I am function 2")
    myFun3()
}

fun calculateTip(costOfService : Int, serviceType : String) : Float {
    val tip = costOfService * 0.1f
    return tip
}


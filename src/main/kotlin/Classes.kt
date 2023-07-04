fun main() {

    //Creating a Dog object using a constructor
    val myDog = Dog(name = "Sheru", weight = 30, breed = "German Shepherd")

    val myDog2 = Dog(name = "Tommy", weight = 15 , breed = "Indian")

    myDog.name = "Charlie"

    myDog.dateOfDeath = "13/06/2040"

    println(myDog.dateOfDeath)

    val dog3= AnotherDogClass("chummt", 45, "Shiba inu")





    //calling walk function of myDog
    myDog.walk()

    //calling bark function of myDog
    myDog.bark()

    myDog2.walk()

    myDog2.bark()

}


/*
What are classes?

Classes are templates/blueprints that allow you to create your own types of objects, and define their properties and functions.


//Let's define our own classes

When you want to design your own class, you need to think about objects that will be created from that class.
    1)The things that each object knows about itself (state/properties/data)
    2)The things each object can do (behaviour/functions/actions)

Let's take an example of a class that represents Dogs

The state/data/properties we should know about a Dog are

a)Name
b)Weight
c)Breed

The behaviour/actions/functions that each dog can perform are

a)walk/run
b)bark


Some other examples of classes/types can be Song class/type.

*** Practice Time ***

Create a Song class with following properties and functions

1)Properties - title, artist, durationInSeconds, coverUrl
2)functions - start, pause, play, stop

 */

class Dog (var name: String,val weight: Int, val breed: String ) {

    lateinit var dateOfDeath : String
    fun walk() {
        println(name + " is walking....")
    }

    fun bark() {
        if (weight < 20) {
            println("yipp..")
        } else {
            println("Wooof...")
        }
    }

    init {
        println("An object is created that's why I was printed")
        println("we can write any kind of code in here which you want to execute everytime an object is created")
        //you can even initialise object properties in here
    }
}

/*
What is a constructor?

-- A constructor contains the code that’s needed to initialize an object.A constructor runs when you instantiate an
object. It’s used to define properties and initialize them.

In our Dog class , the constructor is "(val name: String, val weight: Int, val breed: String )"


What if we don't use val or var?

If we don't use val or var inside constructor then they are no more properties they are simple old
parameters of a function.

And we would have to do things like this

class Dog ( name: String, weight: Int, breed: String ) {
    val name : String = name
    val weight : Int = weight
    val breed : String = breed
    ...
}

Creating properties this way has its own benefits, we can perform some operations on parameters taken
while creating an object before assigning them to its properties

for example,  you may want to store the name of the breed in all Capital letters, to do this you will have
to call toUpperCase() method on the string parameter.

class Dog (name: String, weight: Int, breed: String) {
    val name : String = name
    val weight : Int = weight
    val breed : String = breed.toUpperCase()

    ...
}

So now whenever we access breed property of an object it will give us breed in all capital letters instead of
what we passed in the constructor.


What are initializer blocks?

Initializer blocks are nothing but blocks of code inside a class that run every time we create an
object of a class.

They can be declared using init keyword followed by { }

we can have multiple initializer blocks and they will be executed in the order they are declared
inside the class

YOU MUST INITIALIZE YOUR PROPERTIES BEFORE YOU TRY TO USE THEM


But if you are completely certain that there is a property which we cannot initialize when we create
an object , we can use lateinit keyword

add deathDate as a lateinit property for Dog

Be Careful!! Don't try to access properties before they are initialized or you will get a runtime error

Q: Can I use lateinit with any type of property?
A: You can only use lateinit with properties defined using var, and you can’t use it with any of the
following types: Byte, Short, Int, Long,Double, Float, Char or Boolean.
This is down to how these types are treated when the code runs in the JVM.
This means that properties of any of these types must be initialized when the property is defined,
 or in an initializer block.

You can create a class without a visible constructor but compiler creates an empty constructor if we don't.

How do you validate your property values?
For example a dog with a negetive weight would be a bad thing.

The solution is Custom getters and setters.

If you want to tweak a property’s return value, or validate a value before it gets assigned to a property,
 you can write your own getters and setters.

 Add custom getters and setters to get a dog's weight in Kgs and set it

*/
class AnotherDogClass (nameFromPara: String, weightFromPara: Int, breedFromPara: String) {
    val name : String = nameFromPara
    val weight: Int = weightFromPara
    val breed: String = breedFromPara

    init {

    }
}

class AnotherDogClass2 {
    val name : String = ""
    val weight: Int = 2
    val breed: String = ""

    init {

    }
}










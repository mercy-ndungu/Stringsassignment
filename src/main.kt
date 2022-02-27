fun main(){
    var text = "Akirachix"
    var char1 = (text[0])
    var char3 = (text[2])
    var char4 =(text[3])
    println(char1.toString()+char3+char4)
     var y=myFunction("phelisia","23")
    println(y)
    myCars("Chevlorette")
    var mimi = "Kirigo Ndungu"
    if(mimi=="Kirigo Ndungu"){
        println("That's me.")
    }else{
        println("That's not me!")
    }

}
fun myFunction(name:String, age:String): String {
    var name = "Mercy"
    var age = "23"
    var result = "Hi,my name is $name and i am $age years old"
    return result


}
fun myCars(text:String): Int {
    var text = "Chevlorette"
    var size = text.length
    println("The length of the textstring is " + size)
return size
}







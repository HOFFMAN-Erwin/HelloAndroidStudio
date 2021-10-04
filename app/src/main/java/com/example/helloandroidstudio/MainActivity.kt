package com.example.helloandroidstudio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        variablesYConstantes()

        tipoDeDato()

        sentenciaIf()

        sentenciaWhen()

        arrays()

        maps ()

        loops()

        nullSafety()

        funciones()
    }
    private fun variablesYConstantes (){

        //VARIABLES
        var myFirstVariable = "Hello hackerman"

        println(myFirstVariable)

        myFirstVariable = "Bienvenides a mi aplicacion"

        println(myFirstVariable)

        var mySecondVariable = "probando segunda variable."

        println(mySecondVariable)

        mySecondVariable = myFirstVariable

        println(mySecondVariable)

        //CONSTANTES

        val myFirstConstant = "Hasta aca vamos muy bien"

        println(myFirstConstant)

        val mySecondConstant = myFirstVariable

        println(mySecondConstant)

    }
    //tipos de datos
    private fun tipoDeDato(){
        //string
        val myString ="Hola hackerman";
        val myString2 ="Bienvenides a la aplicacion";
        val myString3 = myString +" "+ myString2;
        println(myString3)

       //enteros (byte, short, int, long)

       val myInt = 1
       val myInt2 = 2
       val myInt3 = myInt + myInt2
       println(myInt3)

       //decimales (float,double)

       val myFloat = 1.5f
       val myDouble = 1.5
       val myDouble2 = 2.6
       val myDouble3 = 1
       val myDouble4 = myDouble + myDouble2 + myDouble3
       println(myDouble4)

       //Boolean

       val myBool = true
       val myBool2 = false
       println(myBool==myBool2)
       println(myBool&&myBool2)

    }

    //Condicional IF

    private fun sentenciaIf(){

        /*Operadores lógicos
        && operador "y"
        || operador "o"
        ! operador "no"*/

        val myNumber = 71

        if (!(myNumber <= 10 && myNumber > 5) || myNumber == 53) {
            println("$myNumber es menor o igual que 10 y mayor que 5 o es igual a 53")
        } else if(myNumber == 60){
            println("$myNumber es igual a 60")

        } else if(myNumber != 70){
            println("$myNumber no es igual a 70")
        }
        else {
            println("$myNumber es mayor que 10 o menor o igual que 5 y no es igual a 53")
        }

    }

    private fun sentenciaWhen(){

        //Aca vamos a ver la sentencia when
        val country = "Argentina"

        when(country){
            "Argentina", "España", "Mexico", "Colombia"->{
                println("El idioma es español")
            }"EEUU"->{
                println("El idioma es ingles")
            }"Canada"->{
                println("El idioma es ingles")
            }else ->{
                println("No conocemos el idioma")
            }
        }

        val age = 10

        when(age){
            0,1,2->{
                println("Eres un bebe.")
            }in 3 .. 10 ->{
                println("Eres un niño.")
            }in 11 .. 17 ->{
                println("Eres un adolescente.")
            }in 18 .. 69 ->{
                println("Eres un adulto.")
            }in 70 .. 99 ->{
                println("Eres un anciano.")
            }else ->{
                println(":c")
            }

        }

    }

    fun arrays(){

        val name = "Erwin"
        val surename = "Hoffman"
        val company = "Mater"
        val age = "32"

        val myArray = arrayListOf<String>()

        //añadir datos de uno en uno

        myArray.add(name)
        myArray.add(surename)
        myArray.add(company)
        myArray.add(age)

        println(myArray)

        //Añadir un conjunto de datos
        myArray.addAll(listOf("Hola","Practicando Android"))

        println(myArray)

        //Acceso a datos
        val myCompany = myArray[2]
        println(myCompany)

        //Modificacion de datos
        myArray[5] = "Aca antes decia practicando android"
        println(myArray)

        //Eliminar datos
        myArray.removeAt(4)
        println(myArray)

        //Recorrer datos
        myArray.forEach {
            println(it)
        }

        //Otras operaciones
        myArray.count()
        myArray.clear()
        myArray.first()
        myArray.last()
        myArray.sort()



    }

    fun maps() {

        //sintaxis
        var myMap: Map<String,Int> = mapOf()
        println(myMap)

        //Añadir elemento
        myMap = mutableMapOf("Erwin" to 1, "Pedro" to 2, "Marcia" to 5)

        //Añadir un solo valor
        myMap["Ana"] = 7
        myMap.put("Maria",8)
        println(myMap)

        //Actualizacion de un dato
        myMap.put("Erwin",3)
        myMap["Erwin"]= 5
        println(myMap)

        myMap.put("Marcos",3)
        println(myMap)

        //Acceso a un dato
        println(myMap["Erwin"])

        //Eliminar un dato
        myMap.remove("Erwin")
        println(myMap)
    }

    private fun loops(){

        val myArray = listOf<String>("Hola","Bienvenidos al loop","Adios")
        val myMap = mutableMapOf("Erwin" to 1, "Pedro" to 2, "Marcia" to 5)

        //for
        for (myString in myArray){
            println(myString)
        }

        for (myElement in myMap){

            println("${myElement.key}-${myElement.value}")

        }
        for (x in 0 ..10){
            println(x)
        }
        for (x in 9 until 30){
            println(x)
        }
        for (x in 0 ..10 step 2) {
            println(x)
        }
        for (x in 10 downTo 0 step 3) {
            println(x)
        }

        val myNumericArray = (0 .. 20)
        for (myNum in myNumericArray){
            println(myNum)
        }

        //While
        var x = 0
        while (x<10){
            println(x)
            x += 2
        }
    }
    //Seguridad contra nulos
    fun nullSafety(){

        var myString="Colorr"
        //myString = null   Esto daria un error de compilacion
        println(myString)
        //variable null safety
        var mySafetyString:String? = "ColorDev null safety"
        mySafetyString=null
        println(mySafetyString)

       /* if(mySafetyString != null){
            println(mySafetyString!!)
        } else{
            println(mySafetyString)
        }

        //safe call
        println(mySafetyString?.length)

        mySafetyString?.let {
            println(it)
        }?: kotlin.run {
            println(mySafetyString)
        }*/
    }
    fun funciones (){
        sayHello()
        sayHello()
        sayHello()

        sayMyName("Erwin")
        sayMyName("Pedro")
        sayMyName("Lucia")

        sayMyNameAndAge("Erwin", 27)

        val sumResult = sumTwoNumbers(10,5)
        println(sumResult)

        println(sumTwoNumbers(15,9))

        println(sumTwoNumbers(10, sumTwoNumbers(5,5)))

    }
    //funcion simple
    fun sayHello (){
        println("Hola!")
    }
    //funcion con un parametro de entrada
    fun sayMyName(name: String){
        println("Hola mi nombre es $name")
    }
    //funcion con mas de un parametro de entrada
    fun sayMyNameAndAge(name: String, age: Int){
        println("Hola mi nombre es $name y mi edad es $age")
    }

    //funcion con valor de retorno
    fun sumTwoNumbers (firstNumber: Int, secondNumber: Int) : Int {
        val sum = firstNumber+secondNumber
        return sum
    }

}






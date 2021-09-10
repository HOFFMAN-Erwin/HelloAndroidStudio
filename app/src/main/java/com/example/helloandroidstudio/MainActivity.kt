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
            }Else ->{
                println(":c")
            }

        }

    }

}
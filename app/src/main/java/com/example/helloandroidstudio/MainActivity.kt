package com.example.helloandroidstudio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //variablesYConstantes()

        tipoDeDato()
    }
   /* private fun variablesYConstantes (){

        //VARIABLES
        var myFirstVariable = "Hello hackerman";

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

        val mySecondConstant:string = myFirstVariable

        printLn(mySecondConstant)

    }*/
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

       val myFloat:float= 1.5f
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
}
package com.example.helloandroidstudio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        variablesYConstantes()
    }
    private fun variablesYConstantes (){

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

    }
}
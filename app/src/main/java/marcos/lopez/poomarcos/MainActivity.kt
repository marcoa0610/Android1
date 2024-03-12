 package marcos.lopez.poomarcos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1- Variables
        var dia: String
        var edad: Int = 24
        var velocidad: Double
        var temperature: Float = 30.9f //Le tengo que poner la f al momento de asignarle el valor


        //2- Valores (Constantes)
        val numeroPi: Double = 3.141592
        val DUI: String = "00009460-1"
        val fechaNacimiento: String ="29 de Julio del 99"

        //3- Variables nulas
        //Null safety, esto quiere decir que la variable puede contener
        //valores nulos, pero primero comprueba si es nulo o no, para que la aplicacion no se cierre.
        var telefono: Int? = null

        //6- Objetos

        val objCalculadora = Calculadora()
        objCalculadora.sumar(2,4)



    }
    //4- Clases
    class Personas {

    }

    class Animales {

    }


}
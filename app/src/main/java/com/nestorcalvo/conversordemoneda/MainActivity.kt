package com.nestorcalvo.conversordemoneda

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var map_currency = mapOf("COL" to 0.00031, "USD" to 1, "EUR" to 1.23, "MXN" to 0.053)



        btConvertir.setOnClickListener {
            var Valor1 = etCurrency1.text.toString().toDouble()
            var Moneda1 = spCurrency_1.selectedItem.toString()
            var Moneda2 = spCurrency_2.selectedItem.toString()
            var Resultado = "Hola"
            if (Moneda1 == Moneda2){
                Resultado = Valor1.toString()
            }
            else{
                Resultado = (Valor1*(map_currency[Moneda1].toString().toDouble()/map_currency[Moneda2].toString().toDouble())).toString()
            }
            tvResult.text = Resultado

        }//Hola


    }
}


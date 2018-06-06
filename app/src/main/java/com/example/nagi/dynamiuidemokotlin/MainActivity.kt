package com.example.nagi.dynamiuidemokotlin

import android.content.DialogInterface
import android.graphics.Point
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.view.Gravity
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.*

class MainActivity : AppCompatActivity() {

    val countries = arrayOf("brazil","canada","china","italy","japan",
            "korea","mexico","thailand","turkey","usa")

    private val facts = arrayOf(
            "Brazilians dont get along with Argentina",
            "Canada is 150 years old",
            "You can not use Google,Facebook,YouTube",
            "You can have free wine for 24hours",
            "You can rent a boyfriend or girlfriend",
            "There are over 20 different kinds of kimchies",
            "You can try Torta de Tacos",
            "Lady Boys are prettier than average women",
            "Santa is from South Turkey",
            "Trump!?"

    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val gridLayout = findViewById<GridLayout>(R.id.main_grid)

        for (i in 0 until countries.size){
            val countryBox = layoutInflater.inflate(R.layout.country_flag,null)
            val flagImage = countryBox.findViewById<ImageButton>(R.id.countryImage)
            val countryName = countryBox.findViewById<TextView>(R.id.countryText)

            flagImage.setImageResource(resources.getIdentifier(countries[i],"drawable",packageName))
            countryName.text = countries[i].capitalize()
            flagImage.setOnClickListener {
//                Toast.makeText(this,countries[i].capitalize(),Toast.LENGTH_SHORT).show()

                // Dialog Builder
                var builder = AlertDialog.Builder(this)
                builder.setTitle("Quick Fact")
                builder.setMessage(facts[i])
                
                builder.setPositiveButton("TRUE",DialogInterface.OnClickListener { dialog, which ->
                })
                
                builder.setNegativeButton("FALSE",DialogInterface.OnClickListener { dialog, which ->  })

                // Dialog to create from the builder
                val alertDialog = builder.create();
                alertDialog.show()



            }

            gridLayout.addView(countryBox)

        }




//        in Java TextView tv = new TextView(this);
//        val tv = TextView(this)
//        tv.setText("Hello Kotlin Android")
//
//        val tv2 = TextView(this)
//        tv2.setText("Hello")
//
//        val display = windowManager.defaultDisplay
//        val endPoint = Point()
//        display.getSize(endPoint)
//
//        val screenWidth = endPoint.x
//        val screenHeight = endPoint.y
//
//        val button1 = Button(this)
//        button1.setText("CLICK ME")
//        button1.gravity = Gravity.TOP
//
//        val layoutParams = LinearLayout.LayoutParams(
//                screenWidth/2,
//               screenHeight/2)
//
////        layoutParams.gravity = Gravity.BOTTOM
//        button1.layoutParams = layoutParams
//
//
//        val linearLayout = findViewById<LinearLayout>(R.id.main_linear)
//        linearLayout.addView(tv)
//        linearLayout.addView(tv2)
//        linearLayout.addView(button1)


    }
}

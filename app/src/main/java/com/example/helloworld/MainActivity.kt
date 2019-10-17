package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

// := extends
class MainActivity : AppCompatActivity() {

    //onCreate = main()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Create the UI
        //R = resources
        setContentView(R.layout.activity_main)
        //TODO : Continue work here
        //val = value, var = variable
        //findViewById = link program to UI
        val buttonOK : Button = findViewById(R.id.buttonOK)
        buttonOK.setOnClickListener { showMessage() }

        val buttonBack : Button = findViewById(R.id.buttonBack)
        buttonBack.setOnClickListener { showMessageBack() }
    }

    private fun showMessageBack() {
        val textViewMessage : TextView = findViewById(R.id.textViewMessage)
        textViewMessage.setText(getString(R.string.app_name))
    }

    private fun showMessage() {
        val textViewMessage : TextView = findViewById(R.id.textViewMessage)
        textViewMessage.setText(getString(R.string.hello))
    }
}

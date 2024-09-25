package edu.temple.helloworld

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // Declare view properties - the first one is done for you
    lateinit var displayTextView: TextView

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize with views defined in Layout - the first one is done for you
        displayTextView = findViewById(R.id.displayTextView)

        
        findViewById<Button>(R.id.clickMeButton).setOnClickListener {
            //displayTextView.text = "Hello, ${findViewById<EditText>(R.id.nameEditText).text}"

            val name = findViewById<EditText>(R.id.nameEditText).text.toString().trim()

            if (name.isEmpty())
                displayTextView.text = "Please enter your name"

            else {
                displayTextView.text = "Hello, $name"
            }

        }


    }
}
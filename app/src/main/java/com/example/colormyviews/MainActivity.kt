package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var red_button: View;
    lateinit var yellow_button: View;
    lateinit var green_button: View;

    lateinit var box_one_text: View;
    lateinit var box_two_text: View;
    lateinit var box_three_text: View;
    lateinit var box_four_text: View;
    lateinit var box_five_text: View;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        box_one_text = findViewById(R.id.box_one_text)
        box_two_text = findViewById(R.id.box_two_text)
        box_three_text = findViewById(R.id.box_three_text)
        box_four_text = findViewById(R.id.box_four_text)
        box_five_text = findViewById(R.id.box_five_text)

        red_button = findViewById(R.id.red_button)
        yellow_button = findViewById(R.id.yellow_button)
        green_button = findViewById(R.id.green_button)

        setListeners()
    }

    private
    fun setListeners() {
        val clickableViews: List<View> =
                listOf(box_one_text,
                        box_two_text,
                        box_three_text,
                        box_four_text,
                        box_five_text,
                        red_button,
                        yellow_button,
                        green_button)

        for (item in clickableViews) {
            item.setOnClickListener { makeColorClickListener(item) }
        }
    }

    private
    fun makeColorClickListener(view: View) {
        when (view.id) {

            // Boxes using Color class colors for background
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_green_light)

            // Boxes using custom colors for background
            R.id.red_button -> box_three_text.setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> box_four_text.setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> box_five_text.setBackgroundResource(R.color.my_green)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}
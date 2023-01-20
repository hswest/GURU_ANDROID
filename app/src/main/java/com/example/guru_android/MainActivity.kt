package com.example.guru_android

import android.app.DatePickerDialog
import android.icu.util.Calendar
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import com.google.android.material.datepicker.MaterialDatePicker
import java.util.Date

class MainActivity : AppCompatActivity() {

    lateinit var date : TextView
    lateinit var selectDate : ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}
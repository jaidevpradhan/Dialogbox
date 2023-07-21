package com.example.dialogbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    // variable declaration
    var btnAlertDialog : Button ?= null
    var btnSimpleListAlertDialog : Button ?= null
    var btnCheckboxListAlertDialog : Button ?= null
    var btnCustomDialog : Button?= null
    var tvSelectedColors: Button?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //intialization
        btnAlertDialog = findViewById(R.id.btnAlertDialog)
        btnSimpleListAlertDialog = findViewById(R.id.btnSimpleListAlertDialog)
        btnCheckboxListAlertDialog = findViewById(R.id.btnCheckboxListAlertDialog)
        tvSelectedColors = findViewById(R.id.tvSelectedColors)
        btnCustomDialog = findViewById(R.id.btnCustomDialog)
    }
}
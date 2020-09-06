package com.example.aisatsuapp

import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
    }
    override fun onClick(v: View){
        when(v.id){
            R.id.button1 -> showTimePickerDialog()
        }
    }
    fun showTimePickerDialog(){
        val timePickerDialog  = TimePickerDialog(
            this,TimePickerDialog.OnTimeSetListener { timePicker, i, i2 -> AisatsuSelect(i,i2) },13,0,true)

        timePickerDialog.show()
    }
    fun AisatsuSelect(i :Int,i2 :Int){
        if (i in 2..9){
            text1.text = "おはよう"
        }else if(i in 10..17){
            text1.text = "こんにちは"
        }else{
            text1.text = "こんばんは"
        }
    }
}
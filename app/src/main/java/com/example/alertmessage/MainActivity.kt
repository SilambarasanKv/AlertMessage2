package com.example.alertmessage

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun save(view: View) {
        var Alert = AlertDialog.Builder(this)

        Alert.setTitle("Save")
        Alert.setMessage("Are You Sure?")
        Alert.setPositiveButton("Yes") {dialog: DialogInterface?, which: Int -> Toast.makeText(applicationContext, "Saved", Toast.LENGTH_SHORT).show() }
        Alert.setNegativeButton("No") {dialog: DialogInterface?, which: Int -> Toast.makeText(applicationContext, "Not Saved", Toast.LENGTH_SHORT).show() }
        Alert.show()
    }

}
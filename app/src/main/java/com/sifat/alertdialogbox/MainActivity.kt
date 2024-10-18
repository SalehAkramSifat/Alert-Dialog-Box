package com.sifat.alertdialogbox

import android.app.AlertDialog
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.sifat.alertdialogbox.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.dialogbutton.setOnClickListener {
            showAlterDialog()
        }
    }

    private fun showAlterDialog() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Alert Dialog Box")
            .setMessage("Do You like this app?")
            .setPositiveButton("Yes") { dialog, which ->
                Toast.makeText(this, "You liked this app", Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("No"){ dialog, which ->
                Toast.makeText(this,"You don't like this app", Toast.LENGTH_SHORT).show()
            dialog.dismiss()
            }
        val alertDialog: AlertDialog = builder.create()
        alertDialog.show()
    }
}
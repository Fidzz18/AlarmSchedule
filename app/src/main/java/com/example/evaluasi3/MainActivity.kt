package com.example.evaluasi3

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View.inflate
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast
import com.example.evaluasi3.databinding.ActivityMainBinding
import com.example.evaluasi3.databinding.ActivityMainBinding.inflate

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.llNotif.setOnClickListener{
            Toast.makeText(this, "Berhasil Pindah Ke Menu Alrm", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this, ActivityAlarm::class.java))
        }
        binding.llIg.setOnClickListener {
            val url = "https://www.instagram.com/mhmmdhafiidz18_"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            Toast.makeText(this, "Membuka Instagram", Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }
        binding.llDial.setOnClickListener {
            val phoneNumber = "089601653110"
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
            Toast.makeText(this, "Berhasi Menyalin", Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }
        binding.btnEdit.setOnClickListener {
            val intent = Intent(this, EditProfilActivity::class.java)
            startActivity(intent)
            Toast.makeText(this, "Berhasil Pindah", Toast.LENGTH_SHORT).show()
        }
    }
    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
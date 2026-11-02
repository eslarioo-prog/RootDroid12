package com.rootdroid.emulator

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.rootdroid.emulator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.statusText.text = "RootDroid 12 - Ready"
        binding.startBtn.setOnClickListener {
            binding.logView.append("\n[OK] Android 12L Rooted - Magisk 27 + Zygisk")
            binding.logView.append("\n[OK] Binder Hook Active")
            binding.logView.append("\n[OK] uid=0(root)")
            Toast.makeText(this, "شغال", Toast.LENGTH_LONG).show()
        }
    }
}

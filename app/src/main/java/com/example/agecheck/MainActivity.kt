package com.example.agecheck

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.agecheck.ui.theme.AgeCheckTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ageEditText: EditText = findViewById(R.id.ageEditText)
        val checkAgeButton: Button = findViewById(R.id.checkAgeButton)

        checkAgeButton.setOnClickListener {
            val ageText = ageEditText.text.toString()
            if (ageText.isNotEmpty()) {
                val age = ageText.toInt()
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("age", age)
                startActivity(intent)
            }
        }
    }
}

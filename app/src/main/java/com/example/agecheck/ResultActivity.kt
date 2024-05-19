package com.example.agecheck

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
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

class ResultActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val resultTextView: TextView = findViewById(R.id.resultTextView)
        val backButton: Button = findViewById(R.id.backButton)
        var age = intent.getIntExtra("age",0)

        if(age >= 18) {
            resultTextView.text = "Eres un adulto!"
        } else {
            resultTextView.text = "Eres menor de edad!"
        }

        backButton.setOnClickListener {
            finish()
        }
    }
}
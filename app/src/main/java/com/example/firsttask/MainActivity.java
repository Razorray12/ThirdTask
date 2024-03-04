package com.example.firsttask;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;
    public final static String EXTRA_MESSAGE = "com.itproger.firstprak.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendMessage(View v){
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText emailEditText = findViewById(R.id.editTextTextEmailAddress);
        EditText passwordEditText = findViewById(R.id.editTextTextPassword);
        String email = emailEditText.getText().toString();
        String password = passwordEditText.getText().toString();
        String message = email + "\n"+ password;
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
        Toast.makeText(this, "Вы вошли!", Toast.LENGTH_SHORT).show();
    }
}
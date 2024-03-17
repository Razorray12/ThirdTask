package com.example.firsttask;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;
    public final static String EXTRA_MESSAGE = "com.itproger.firstprak.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onNextActivity(View view){
        String email = ((EditText) findViewById(R.id.editTextTextEmailAddress)).getText().toString();
        String password = ((EditText) findViewById(R.id.editTextTextPassword)).getText().toString();
        Data data = new Data("John", 30,email,password);
        Intent intent = new Intent(this, FrameActivity.class);
        intent.putExtra("Data", data);
        startActivity(intent);
        Toast.makeText(this, "Вы вошли!", Toast.LENGTH_SHORT).show();
    }
}
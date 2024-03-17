package com.example.firsttask;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class FrameActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);
        Data dataInput = (Data) getIntent().getParcelableExtra("Data");
        if (dataInput!=null) {
            ((TextView) findViewById(R.id.textView2)).setText(dataInput.getEmail());
            ((TextView) findViewById(R.id.textView3)).setText(dataInput.getPassword());
        }
    }
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.button3) {
            Intent intent = new Intent(this, LinearActivity.class);
            Data dataInput = (Data) getIntent().getParcelableExtra("Data");
            intent.putExtra("Data", dataInput);
            startActivity(intent);
            finish();
        }
        if (id == R.id.button2) {
            Intent intent2 = new Intent(this, MainActivity.class);
            intent2.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent2);
        }
    }
}
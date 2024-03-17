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

public class RelativeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative);
        Data dataInput = (Data) getIntent().getParcelableExtra("Data");
        if (dataInput!=null) {
            ((TextView) findViewById(R.id.textView6)).setText(dataInput.getEmail());
            ((TextView) findViewById(R.id.textView7)).setText(dataInput.getPassword());
        }
    }
    public void onClick3(View view) {
        int id = view.getId();
        if (id == R.id.button6) {
            Intent intent = new Intent(this, FrameActivity.class);
            Data dataInput = (Data) getIntent().getParcelableExtra("Data");
            intent.putExtra("Data", dataInput);
            startActivity(intent);
            finish();
        } else if (id == R.id.button7) {
            Intent intent2 = new Intent(this, MainActivity.class);
            intent2.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent2);
        }
    }
}
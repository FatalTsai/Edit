package com.example.edittext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public  void  sayhello(View v)
    {
        EditText name = (EditText)findViewById(R.id.name);
        TextView txv = (TextView)findViewById(R.id.tvx);

        txv.setText(name.getText().toString()+",hello");
    }
}

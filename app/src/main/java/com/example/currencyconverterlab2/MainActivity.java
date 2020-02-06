package com.example.currencyconverterlab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View v) {
    EditText myCurrency = (EditText) findViewById((R.id.input));
    goToConverted(myCurrency.getText().toString());
    }
    public void goToConverted(String s) {
        Intent intent = new Intent(this,Main2Activity.class);
        intent.putExtra("message",s);
        startActivity(intent);
    }
}

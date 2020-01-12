package com.example.myfirstproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent("A");
                intent.addCategory("A new Category!");
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.second, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.standard_item:
                Intent intent1 = new Intent(SecondActivity.this,SecondActivity.class);
                startActivity(intent1);
                break;
            case R.id.singletop:
                Intent intent2 = new Intent(SecondActivity.this,SecondActivity.class);
                startActivity(intent2);
                break;
            case R.id.singletask:
                Intent intent3 = new Intent(SecondActivity.this,SecondActivity.class);
                startActivity(intent3);
                break;
            case R.id.singleinstance:
                Intent intent4 = new Intent(SecondActivity.this,SecondActivity.class);
                startActivity(intent4);
                break;
        }
        return true;
    }
}

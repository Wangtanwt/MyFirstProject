package com.example.myfirstproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
//                finish();
//                Toast.makeText(MainActivity.this, "欢迎您再来！",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.add_item:
                Toast.makeText(this,"Addition",Toast.LENGTH_LONG).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this,"Remove",Toast.LENGTH_LONG).show();
                break;
            case R.id.baidu_item:
                Toast.makeText(this, "Baidu: 有事搜一搜，没事看一看！", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.baidu.com"));
                startActivity(intent);
                break;
            case R.id.google:
                Toast.makeText(this, "Hello Google!", Toast.LENGTH_SHORT).show();
                Intent intent1 = new Intent(Intent.ACTION_VIEW);
                intent1.setData(Uri.parse("http://www.google.com"));
                startActivity(intent1);
                break;
            case R.id.MyBrowers:
                Intent intent2 = new Intent(Intent.ACTION_VIEW);
                startActivity(intent2);
        }
        return true;
    }
}

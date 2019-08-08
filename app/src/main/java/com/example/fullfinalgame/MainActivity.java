package com.example.fullfinalgame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button s=findViewById(R.id.button);
        Button s2=findViewById(R.id.button2);
        Button s3=findViewById(R.id.button3);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startInstructActivity();
            }
        });
        s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startLeaderActivity();
            }
        });
        s3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startGameActivity();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void startInstructActivity(){
        Intent intent = new Intent(this, Instructions.class);
        //intent.putExtra("the",x);
        startActivity(intent);
    }
    public void startLeaderActivity(){
        Intent intent = new Intent(this, LearderBoard.class);
        //intent.putExtra("the",x);
        startActivity(intent);
    }

    public void startGameActivity(){
        Intent intent = new Intent(this, GameActivity.class);
        //intent.putExtra("the",x);
        startActivity(intent);
    }
}

package com.example.fullfinalgame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Instructions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instructions);

        TextView text=(TextView)findViewById(R.id.textView12);
        text.setText(Html.fromHtml("<h1>Instructions</h1>" +
                "<br>" +
                "<h2>The goal of the game is to keep your character alive for as long as possible.</h2>" +
                "<br>" +
                "<h2>Click where you want your character to go on the screen so they can avoid the oncoming dangers!</h2>" +
                "<br>" +
                "<h2>Good Luck!</h2>" +
                "<br>" +
                "<h2>And Have Fun!</h2>"));

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button s=findViewById(R.id.button);
        Button s2=findViewById(R.id.button2);
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startLeaderActivity();
            }
        });
        s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startMainActivity();
            }
        });

    }

    public void startMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        //intent.putExtra("the",x);
        startActivity(intent);
    }
    public void startLeaderActivity(){
        Intent intent = new Intent(this, LearderBoard.class);
        //intent.putExtra("the",x);
        startActivity(intent);
    }

}

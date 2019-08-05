package com.example.fullfinalgame;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class LearderBoard extends AppCompatActivity {
    ArrayList<String> nameEntries;
    ArrayList<String> scoreEntries;
    TextView t1;
    TextView t2;
    TextView t3;
    TextView t4;
    TextView t5;
    TextView t6;
    TextView t7;
    TextView t8;
    TextView t9;
    TextView t10;

    EditText e1;
    EditText e2;
    EditText e3;
    EditText e4;
    EditText e5;
    EditText e6;
    EditText e7;
    EditText e8;
    EditText e9;
    EditText e10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learder_board);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        t1= findViewById(R.id.textView);
        t2= findViewById(R.id.textView2);
        t3= findViewById(R.id.textView3);
        t4= findViewById(R.id.textView4);
        t5= findViewById(R.id.textView5);
        t6= findViewById(R.id.textView6);
        t7= findViewById(R.id.textView7);
        t8= findViewById(R.id.textView8);
        t9= findViewById(R.id.textView9);
        t10= findViewById(R.id.textView10);

        e1=findViewById(R.id.editText2);
        e2=findViewById(R.id.editText3);
        e3=findViewById(R.id.editText4);
        e4=findViewById(R.id.editText5);
        e5=findViewById(R.id.editText6);
        e6=findViewById(R.id.editText7);
        e7=findViewById(R.id.editText8);
        e8=findViewById(R.id.editText9);
        e9=findViewById(R.id.editText10);
        e10=findViewById(R.id.editText11);

        //e1.setText("434");
        nameEntries=getNameArray();
        if(nameEntries.size()>1){
            e1.setText(nameEntries.get(0));
            e2.setText(nameEntries.get(1));
            e3.setText(nameEntries.get(2));
            e4.setText(nameEntries.get(3));
            e5.setText(nameEntries.get(4));
            e6.setText(nameEntries.get(5));
            e7.setText(nameEntries.get(6));
            e8.setText(nameEntries.get(7));
            e9.setText(nameEntries.get(8));
            e10.setText(nameEntries.get(9));
        }

        scoreEntries=getScoreArray();
        if(scoreEntries.size()>1){
            t1.setText(scoreEntries.get(0));
            t2.setText(scoreEntries.get(1));
            t3.setText(scoreEntries.get(2));
            t4.setText(scoreEntries.get(3));
            t5.setText(scoreEntries.get(4));
            t6.setText(scoreEntries.get(5));
            t7.setText(scoreEntries.get(6));
            t8.setText(scoreEntries.get(7));
            t9.setText(scoreEntries.get(8));
            t10.setText(scoreEntries.get(9));
        }




        Button s=findViewById(R.id.button);
        Button s2=findViewById(R.id.button2);
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startInstructActivity();
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
        nameEntries.clear();
        nameEntries.add(e1.getText().toString());
        nameEntries.add(e2.getText().toString());
        nameEntries.add(e3.getText().toString());
        nameEntries.add(e4.getText().toString());
        nameEntries.add(e5.getText().toString());
        nameEntries.add(e6.getText().toString());
        nameEntries.add(e7.getText().toString());
        nameEntries.add(e8.getText().toString());
        nameEntries.add(e9.getText().toString());
        nameEntries.add(e10.getText().toString());
        scoreEntries.clear();
        scoreEntries.add(t1.getText().toString());
        scoreEntries.add(t2.getText().toString());
        scoreEntries.add(t3.getText().toString());
        scoreEntries.add(t4.getText().toString());
        scoreEntries.add(t5.getText().toString());
        scoreEntries.add(t6.getText().toString());
        scoreEntries.add(t7.getText().toString());
        scoreEntries.add(t8.getText().toString());
        scoreEntries.add(t9.getText().toString());
        scoreEntries.add(t10.getText().toString());
        saveNameArray();
        saveScoreArray();



        Intent intent = new Intent(this, MainActivity.class);


        //intent.putExtra("the",x);
        startActivity(intent);
    }
    public void startInstructActivity(){

        nameEntries.clear();
        nameEntries.add(e1.getText().toString());
        nameEntries.add(e2.getText().toString());
        nameEntries.add(e3.getText().toString());
        nameEntries.add(e4.getText().toString());
        nameEntries.add(e5.getText().toString());
        nameEntries.add(e6.getText().toString());
        nameEntries.add(e7.getText().toString());
        nameEntries.add(e8.getText().toString());
        nameEntries.add(e9.getText().toString());
        nameEntries.add(e10.getText().toString());
        scoreEntries.clear();
        scoreEntries.add(t1.getText().toString());
        scoreEntries.add(t2.getText().toString());
        scoreEntries.add(t3.getText().toString());
        scoreEntries.add(t4.getText().toString());
        scoreEntries.add(t5.getText().toString());
        scoreEntries.add(t6.getText().toString());
        scoreEntries.add(t7.getText().toString());
        scoreEntries.add(t8.getText().toString());
        scoreEntries.add(t9.getText().toString());
        scoreEntries.add(t10.getText().toString());
        saveNameArray();
        saveScoreArray();


        Intent intent = new Intent(this, Instructions.class);
        //intent.putExtra("the",x);
        startActivity(intent);
    }


    public boolean saveNameArray() {
        SharedPreferences sp = this.getSharedPreferences("45", Activity.MODE_PRIVATE);
        SharedPreferences.Editor mEdit1 = sp.edit();
        Set<String> set = new HashSet<String>();
        set.addAll(nameEntries);
        mEdit1.putStringSet("list", set);
        return mEdit1.commit();
    }

    public ArrayList<String> getNameArray() {
        SharedPreferences sp = this.getSharedPreferences("45", Activity.MODE_PRIVATE);

        //NOTE: if shared preference is null, the method return empty Hashset and not null
        Set<String> set = sp.getStringSet("list", new HashSet<String>());



        return new ArrayList<String>(set);
    }

    public boolean saveScoreArray() {
        SharedPreferences sp = this.getSharedPreferences("46", Activity.MODE_PRIVATE);
        SharedPreferences.Editor mEdit1 = sp.edit();
        Set<String> set = new HashSet<String>();
        set.addAll(scoreEntries);
        mEdit1.putStringSet("list", set);
        return mEdit1.commit();
    }

    public ArrayList<String> getScoreArray() {
        SharedPreferences sp = this.getSharedPreferences("46", Activity.MODE_PRIVATE);

        //NOTE: if shared preference is null, the method return empty Hashset and not null
        Set<String> set = sp.getStringSet("list", new HashSet<String>());



        return new ArrayList<String>(set);
    }
    /*public void onPause() {
        nameEntries.clear();
        nameEntries.add(e1.getText().toString());
        nameEntries.add(e2.getText().toString());
        nameEntries.add(e3.getText().toString());
        nameEntries.add(e4.getText().toString());
        nameEntries.add(e5.getText().toString());
        nameEntries.add(e6.getText().toString());
        nameEntries.add(e7.getText().toString());
        nameEntries.add(e8.getText().toString());
        nameEntries.add(e9.getText().toString());
        nameEntries.add(e10.getText().toString());
        scoreEntries.clear();
        scoreEntries.add(t1.getText().toString());
        scoreEntries.add(t2.getText().toString());
        scoreEntries.add(t3.getText().toString());
        scoreEntries.add(t4.getText().toString());
        scoreEntries.add(t5.getText().toString());
        scoreEntries.add(t6.getText().toString());
        scoreEntries.add(t7.getText().toString());
        scoreEntries.add(t8.getText().toString());
        scoreEntries.add(t9.getText().toString());
        scoreEntries.add(t10.getText().toString());
        saveNameArray();
        saveScoreArray();
        super.onPause();
    }*/
    public void onStop() {
        nameEntries.clear();
        nameEntries.add(e1.getText().toString());
        nameEntries.add(e2.getText().toString());
        nameEntries.add(e3.getText().toString());
        nameEntries.add(e4.getText().toString());
        nameEntries.add(e5.getText().toString());
        nameEntries.add(e6.getText().toString());
        nameEntries.add(e7.getText().toString());
        nameEntries.add(e8.getText().toString());
        nameEntries.add(e9.getText().toString());
        nameEntries.add(e10.getText().toString());
        scoreEntries.clear();
        scoreEntries.add(t1.getText().toString());
        scoreEntries.add(t2.getText().toString());
        scoreEntries.add(t3.getText().toString());
        scoreEntries.add(t4.getText().toString());
        scoreEntries.add(t5.getText().toString());
        scoreEntries.add(t6.getText().toString());
        scoreEntries.add(t7.getText().toString());
        scoreEntries.add(t8.getText().toString());
        scoreEntries.add(t9.getText().toString());
        scoreEntries.add(t10.getText().toString());
        saveNameArray();
        saveScoreArray();
        super.onStop();
    }

}

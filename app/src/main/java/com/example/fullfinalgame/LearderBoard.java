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
    int score=0;
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
        Intent intent=getIntent();
        score=intent.getIntExtra("the1", 0);
        //e1.setText("434");
        nameEntries=getNameArray();
        if(nameEntries.size()>1){
            for (int j=0;j<10; j++) {
                if(nameEntries.get(j).charAt(0)=='0'){
                    e1.setText(nameEntries.get(j).substring(1));
                }
                if(nameEntries.get(j).charAt(0)=='1'){
                    e2.setText(nameEntries.get(j).substring(1));
                }
                if(nameEntries.get(j).charAt(0)=='2'){
                    e3.setText(nameEntries.get(j).substring(1));
                }
                if(nameEntries.get(j).charAt(0)=='3'){
                    e4.setText(nameEntries.get(j).substring(1));
                }
                if(nameEntries.get(j).charAt(0)=='4'){
                    e5.setText(nameEntries.get(j).substring(1));
                }
                if(nameEntries.get(j).charAt(0)=='5'){
                    e6.setText(nameEntries.get(j).substring(1));
                }
                if(nameEntries.get(j).charAt(0)=='6'){
                    e7.setText(nameEntries.get(j).substring(1));
                }
                if(nameEntries.get(j).charAt(0)=='7'){
                    e8.setText(nameEntries.get(j).substring(1));
                }
                if(nameEntries.get(j).charAt(0)=='8'){
                    e9.setText(nameEntries.get(j).substring(1));
                }
                if(nameEntries.get(j).charAt(0)=='9'){
                    e10.setText(nameEntries.get(j).substring(1));
                }
                /*e1.setText(nameEntries.get(0));
                e2.setText(nameEntries.get(1));
                e3.setText(nameEntries.get(2));
                e4.setText(nameEntries.get(3));
                e5.setText(nameEntries.get(4));
                e6.setText(nameEntries.get(5));
                e7.setText(nameEntries.get(6));
                e8.setText(nameEntries.get(7));
                e9.setText(nameEntries.get(8));
                e10.setText(nameEntries.get(9));*/
            }
        }

        scoreEntries=getScoreArray();
        if(scoreEntries.size()>1){
            for (int j=0;j<10; j++) {
                if (scoreEntries.get(j).charAt(0) == '0') {
                    t1.setText(scoreEntries.get(j).substring(1));
                }
                if (scoreEntries.get(j).charAt(0) == '1') {
                    t2.setText(scoreEntries.get(j).substring(1));
                }
                if (scoreEntries.get(j).charAt(0) == '2') {
                    t3.setText(scoreEntries.get(j).substring(1));
                }
                if (scoreEntries.get(j).charAt(0) == '3') {
                    t4.setText(scoreEntries.get(j).substring(1));
                }
                if (scoreEntries.get(j).charAt(0) == '4') {
                    t5.setText(scoreEntries.get(j).substring(1));
                }
                if (scoreEntries.get(j).charAt(0) == '5') {
                    t6.setText(scoreEntries.get(j).substring(1));
                }
                if (scoreEntries.get(j).charAt(0) == '6') {
                    t7.setText(scoreEntries.get(j).substring(1));
                }
                if (scoreEntries.get(j).charAt(0) == '7') {
                    t8.setText(scoreEntries.get(j).substring(1));
                }
                if (scoreEntries.get(j).charAt(0) == '8') {
                    t9.setText(scoreEntries.get(j).substring(1));
                }
                if (scoreEntries.get(j).charAt(0) == '9') {
                    t10.setText(scoreEntries.get(j).substring(1));
                }
            }


            /*t1.setText(scoreEntries.get(0));
            t2.setText(scoreEntries.get(1));
            t3.setText(scoreEntries.get(2));
            t4.setText(scoreEntries.get(3));
            t5.setText(scoreEntries.get(4));
            t6.setText(scoreEntries.get(5));
            t7.setText(scoreEntries.get(6));
            t8.setText(scoreEntries.get(7));
            t9.setText(scoreEntries.get(8));
            t10.setText(scoreEntries.get(9));*/
        }

        if(score>Integer.parseInt(t1.getText().toString())){

            t10.setText(t9.getText());
            t9.setText(t8.getText());
            t8.setText(t7.getText());
            t7.setText(t6.getText());
            t6.setText(t5.getText());
            t5.setText(t4.getText());
            t4.setText(t3.getText());
            t3.setText(t2.getText());
            t2.setText(t1.getText());
            t1.setText(Integer.toString(score));

            e10.setText(e9.getText());
            e9.setText(e8.getText());
            e8.setText(e7.getText());
            e7.setText(e6.getText());
            e6.setText(e5.getText());
            e5.setText(e4.getText());
            e4.setText(e3.getText());
            e3.setText(e2.getText());
            e2.setText(e1.getText());
            e1.setText("New Score");
        }else if(score>Integer.parseInt(t2.getText().toString())){

            t10.setText(t9.getText());
            t9.setText(t8.getText());
            t8.setText(t7.getText());
            t7.setText(t6.getText());
            t6.setText(t5.getText());
            t5.setText(t4.getText());
            t4.setText(t3.getText());
            t3.setText(t2.getText());
            t2.setText(Integer.toString(score));

            e10.setText(e9.getText());
            e9.setText(e8.getText());
            e8.setText(e7.getText());
            e7.setText(e6.getText());
            e6.setText(e5.getText());
            e5.setText(e4.getText());
            e4.setText(e3.getText());
            e3.setText(e2.getText());
            e2.setText("New Score");
        }else if(score>Integer.parseInt(t3.getText().toString())){

            t10.setText(t9.getText());
            t9.setText(t8.getText());
            t8.setText(t7.getText());
            t7.setText(t6.getText());
            t6.setText(t5.getText());
            t5.setText(t4.getText());
            t4.setText(t3.getText());
            t3.setText(Integer.toString(score));

            e10.setText(e9.getText());
            e9.setText(e8.getText());
            e8.setText(e7.getText());
            e7.setText(e6.getText());
            e6.setText(e5.getText());
            e5.setText(e4.getText());
            e4.setText(e3.getText());
            e3.setText("New Score");
        }else if(score>Integer.parseInt(t4.getText().toString())){

            t10.setText(t9.getText());
            t9.setText(t8.getText());
            t8.setText(t7.getText());
            t7.setText(t6.getText());
            t6.setText(t5.getText());
            t5.setText(t4.getText());
            t4.setText(Integer.toString(score));

            e10.setText(e9.getText());
            e9.setText(e8.getText());
            e8.setText(e7.getText());
            e7.setText(e6.getText());
            e6.setText(e5.getText());
            e5.setText(e4.getText());
            e4.setText("New Score");
        }else if(score>Integer.parseInt(t5.getText().toString())){

            t10.setText(t9.getText());
            t9.setText(t8.getText());
            t8.setText(t7.getText());
            t7.setText(t6.getText());
            t6.setText(t5.getText());
            t5.setText(Integer.toString(score));

            e10.setText(e9.getText());
            e9.setText(e8.getText());
            e8.setText(e7.getText());
            e7.setText(e6.getText());
            e6.setText(e5.getText());
            e5.setText("New Score");
        }else if(score>Integer.parseInt(t6.getText().toString())){

            t10.setText(t9.getText());
            t9.setText(t8.getText());
            t8.setText(t7.getText());
            t7.setText(t6.getText());
            t6.setText(Integer.toString(score));

            e10.setText(e9.getText());
            e9.setText(e8.getText());
            e8.setText(e7.getText());
            e7.setText(e6.getText());
            e6.setText("New Score");
        }else if(score>Integer.parseInt(t7.getText().toString())){

            t10.setText(t9.getText());
            t9.setText(t8.getText());
            t8.setText(t7.getText());
            t7.setText(Integer.toString(score));

            e10.setText(e9.getText());
            e9.setText(e8.getText());
            e8.setText(e7.getText());
            e7.setText("New Score");
        }else if(score>Integer.parseInt(t8.getText().toString())){

            t10.setText(t9.getText());
            t9.setText(t8.getText());
            t8.setText(Integer.toString(score));

            e10.setText(e9.getText());
            e9.setText(e8.getText());
            e8.setText("New Score");
        }else if(score>Integer.parseInt(t9.getText().toString())){

            t10.setText(t9.getText());
            t9.setText(Integer.toString(score));

            e10.setText(e9.getText());
            e9.setText("New Score");
        }else if(score>Integer.parseInt(t10.getText().toString())){

            t10.setText(Integer.toString(score));

            e10.setText("New Score");
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
        nameEntries.add("0"+e1.getText().toString());
        nameEntries.add("1"+e2.getText().toString());
        nameEntries.add("2"+e3.getText().toString());
        nameEntries.add("3"+e4.getText().toString());
        nameEntries.add("4"+e5.getText().toString());
        nameEntries.add("5"+e6.getText().toString());
        nameEntries.add("6"+e7.getText().toString());
        nameEntries.add("7"+e8.getText().toString());
        nameEntries.add("8"+e9.getText().toString());
        nameEntries.add("9"+e10.getText().toString());
        scoreEntries.clear();
        scoreEntries.add("0"+t1.getText().toString());
        scoreEntries.add("1"+t2.getText().toString());
        scoreEntries.add("2"+t3.getText().toString());
        scoreEntries.add("3"+t4.getText().toString());
        scoreEntries.add("4"+t5.getText().toString());
        scoreEntries.add("5"+t6.getText().toString());
        scoreEntries.add("6"+t7.getText().toString());
        scoreEntries.add("7"+t8.getText().toString());
        scoreEntries.add("8"+t9.getText().toString());
        scoreEntries.add("9"+t10.getText().toString());
        saveNameArray();
        saveScoreArray();



        Intent intent = new Intent(this, MainActivity.class);


        //intent.putExtra("the",x);
        startActivity(intent);
    }
    public void startInstructActivity(){

        nameEntries.clear();
        nameEntries.add("0"+e1.getText().toString());
        nameEntries.add("1"+e2.getText().toString());
        nameEntries.add("2"+e3.getText().toString());
        nameEntries.add("3"+e4.getText().toString());
        nameEntries.add("4"+e5.getText().toString());
        nameEntries.add("5"+e6.getText().toString());
        nameEntries.add("6"+e7.getText().toString());
        nameEntries.add("7"+e8.getText().toString());
        nameEntries.add("8"+e9.getText().toString());
        nameEntries.add("9"+e10.getText().toString());
        scoreEntries.clear();
        scoreEntries.add("0"+t1.getText().toString());
        scoreEntries.add("1"+t2.getText().toString());
        scoreEntries.add("2"+t3.getText().toString());
        scoreEntries.add("3"+t4.getText().toString());
        scoreEntries.add("4"+t5.getText().toString());
        scoreEntries.add("5"+t6.getText().toString());
        scoreEntries.add("6"+t7.getText().toString());
        scoreEntries.add("7"+t8.getText().toString());
        scoreEntries.add("8"+t9.getText().toString());
        scoreEntries.add("9"+t10.getText().toString());
        saveNameArray();
        saveScoreArray();


        Intent intent = new Intent(this, Instructions.class);
        //intent.putExtra("the",x);
        startActivity(intent);
    }


    public boolean saveNameArray() {
        SharedPreferences sp = this.getSharedPreferences("50", Activity.MODE_PRIVATE);
        SharedPreferences.Editor mEdit1 = sp.edit();
        Set<String> set = new HashSet<String>();
        set.addAll(nameEntries);
        mEdit1.putStringSet("list", set);
        return mEdit1.commit();
    }

    public ArrayList<String> getNameArray() {
        SharedPreferences sp = this.getSharedPreferences("50", Activity.MODE_PRIVATE);

        //NOTE: if shared preference is null, the method return empty Hashset and not null
        Set<String> set = sp.getStringSet("list", new HashSet<String>());



        return new ArrayList<String>(set);
    }

    public boolean saveScoreArray() {
        SharedPreferences sp = this.getSharedPreferences("60", Activity.MODE_PRIVATE);
        SharedPreferences.Editor mEdit1 = sp.edit();
        Set<String> set = new HashSet<String>();
        set.addAll(scoreEntries);
        mEdit1.putStringSet("list", set);
        return mEdit1.commit();
    }

    public ArrayList<String> getScoreArray() {
        SharedPreferences sp = this.getSharedPreferences("60", Activity.MODE_PRIVATE);

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
        nameEntries.add("0"+e1.getText().toString());
        nameEntries.add("1"+e2.getText().toString());
        nameEntries.add("2"+e3.getText().toString());
        nameEntries.add("3"+e4.getText().toString());
        nameEntries.add("4"+e5.getText().toString());
        nameEntries.add("5"+e6.getText().toString());
        nameEntries.add("6"+e7.getText().toString());
        nameEntries.add("7"+e8.getText().toString());
        nameEntries.add("8"+e9.getText().toString());
        nameEntries.add("9"+e10.getText().toString());
        scoreEntries.clear();
        scoreEntries.add("0"+t1.getText().toString());
        scoreEntries.add("1"+t2.getText().toString());
        scoreEntries.add("2"+t3.getText().toString());
        scoreEntries.add("3"+t4.getText().toString());
        scoreEntries.add("4"+t5.getText().toString());
        scoreEntries.add("5"+t6.getText().toString());
        scoreEntries.add("6"+t7.getText().toString());
        scoreEntries.add("7"+t8.getText().toString());
        scoreEntries.add("8"+t9.getText().toString());
        scoreEntries.add("9"+t10.getText().toString());
        saveNameArray();
        saveScoreArray();
        super.onStop();
    }

}

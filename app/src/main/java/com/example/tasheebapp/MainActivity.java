package com.example.tasheebapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String name ;
    TextView tv1;
    TextView tv2;
    Button tasbih,kalma,astagfar,darood,ayat,reset,count;
    int counter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1=findViewById(R.id.textView);
        tv2=findViewById(R.id.textView1);
        tasbih=findViewById(R.id.tasbih);
        kalma=findViewById(R.id.kalma);
        astagfar=findViewById(R.id.astagfar);
        darood=findViewById(R.id.darood);
        ayat=findViewById(R.id.ayat);
        reset=findViewById(R.id.reset);
        count=findViewById(R.id.count);
        Toast.makeText(this, name, Toast.LENGTH_SHORT).show();
        count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;
                if(counter==33)
                {

                    counter=0;
                    tv1.setText("Select Tasbeeh");
                }
                if(counter==34)
                {
                    counter=0;
                }
                tv2.setText(Integer.toString(counter));

            }
        });
        tasbih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
           tv1.setText("Say Alhudullilah");
            }
        });
        kalma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText("Say Allah O Akbar");
            }
        });
        astagfar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText("Say Astafirullah");
            }
        });
        darood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText("Recite Darood");
            }
        });
        ayat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText("Recite Ayat E Karima");
            }
        });

       reset.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               counter=0;
               tv2.setText(Integer.toString(counter));
               tv1.setText("Select Tasbeeh");
           }
       });



    }
}
package com.example.androidhw6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class Bpage extends AppCompatActivity {
   int BpageColor;
int BtoAClick=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bpage);
        Intent AtoB=getIntent();
        BpageColor =AtoB.getIntExtra("bpagecolor",0);
       final LinearLayout BLayout=(LinearLayout)findViewById(R.id.BLayout);
        final Button BtoA = (Button) findViewById(R.id.BtoA);
        BLayout.setBackgroundColor(BpageColor);
        BtoA.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
               BtoAClick++;


                Intent BtoA = new Intent(Bpage.this, MainActivity .class);
                BtoA.putExtra("apagecolor",Color.YELLOW);
                BtoA.putExtra("BtoAClick",BtoAClick);
                startActivity(BtoA);
            }
        });



    }
}

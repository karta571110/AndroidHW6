package com.example.androidhw6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
int ApageColor=Color.WHITE;
int BpageColor=Color.BLACK;
int BtoAClickApage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent BtoA=getIntent();
        BtoAClickApage=BtoA.getIntExtra("BtoAClick",0);

        final LinearLayout ALayout=(LinearLayout)findViewById(R.id.ALayout);
        final Button AtoB = (Button) findViewById(R.id.AtoB);
        if(BtoAClickApage>=1) {
            ApageColor=BtoA.getIntExtra("apagecolor",0);
            ALayout.setBackgroundColor(ApageColor);
        }
        ALayout.setBackgroundColor(ApageColor);
        AtoB.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent AtoB = new Intent(MainActivity.this, Bpage.class);
                AtoB.putExtra("bpagecolor",BpageColor);
                startActivity(AtoB);
            }
        });


    }
}

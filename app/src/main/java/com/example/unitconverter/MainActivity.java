package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnLength;
    private Button btnArea;
    private Button btnVol;
    private Button btnSpeed;
    private Button btnWeight;
    private Button btnTemp;
    private Button btnPower;
    private Button btnPress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLength = findViewById(R.id.btnLength);
        btnArea = findViewById(R.id.btnArea);
        btnVol = findViewById(R.id.btnVol);
        btnSpeed = findViewById(R.id.btnSpeed);
        btnWeight = findViewById(R.id.btnWeight);
        btnTemp = findViewById(R.id.btnTemp);
        btnPress =findViewById(R.id.btnPress);
        btnPower=findViewById(R.id.btnPow);

        btnLength.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iTemp = new Intent(MainActivity.this,LengthCal.class);
                startActivity(iTemp);
            }
        });
        btnTemp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iTemp = new Intent(MainActivity.this,TempCal.class);
                startActivity(iTemp);
            }
        });
        btnArea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iTemp = new Intent(MainActivity.this,AreaCal.class);
                startActivity(iTemp);
            }
        });

        btnVol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iTemp = new Intent(MainActivity.this,VolumeCal.class);
                startActivity(iTemp);
            }
        });

        btnSpeed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iTemp = new Intent(MainActivity.this,SpeedCal.class);
                startActivity(iTemp);
            }
        });

        btnWeight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iTemp = new Intent(MainActivity.this,WeightCal.class);
                startActivity(iTemp);
            }
        });

        btnPower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iTemp = new Intent(MainActivity.this,PowerCal.class);
                startActivity(iTemp);
            }
        });

        btnPress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iTemp = new Intent(MainActivity.this,PressCal.class);
                startActivity(iTemp);
            }
        });
    }
}
package com.example.unitconverter;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Presentation;
import android.content.DialogInterface;
import android.content.SearchRecentSuggestionsProvider;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PressCal extends AppCompatActivity {

    TextView selectForm,selectTo,btnConvert,setUnit1,setUnit2;
    EditText editFrom,editTo;
    String[] unit = {"Bar","Pascal","Torr"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_press_cal);

        selectForm = findViewById(R.id.tv2_fromUnit);
        selectTo=findViewById(R.id.tv2_toUnit);

        setUnit1 =findViewById(R.id.tv_fromUnit);
        setUnit2 =findViewById(R.id.tv_toUnit);

        editFrom =findViewById(R.id.et_fromUnit);
        editTo=findViewById(R.id.et_toUnit);
        btnConvert=findViewById(R.id.btn_convert);



        selectForm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAlertDialogListFrom();
            }
        });

        selectTo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAlertDialogListTo();
            }
        });

        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String frm =setUnit1.getText().toString();
                String to = setUnit2.getText().toString();

                String edfrm = editFrom.getText().toString();

                if((setUnit1.getText().toString()).equals("") || (setUnit2.getText().toString()).equals("")){
                    Toast.makeText(PressCal.this, "Please Enter the unit", Toast.LENGTH_SHORT).show();
                }
                if((editFrom.getText().toString()).equals("")){
                    Toast.makeText(PressCal.this, "Enter some Value", Toast.LENGTH_SHORT).show();
                }

                if(frm.equals(unit[0]) && to.equals(unit[1])){
                    double a = Double.parseDouble(edfrm);
                    double b;
                    b = a*1000;
                    String ans = String.valueOf(b);
                    editTo.setText(ans);
                }
                else if(frm.equals(unit[0]) && to.equals(unit[0])) {
                    double a = Double.parseDouble(edfrm);
                    String ans = String.valueOf(a);
                    editTo.setText(ans);
                }
                else if(frm.equals(unit[0]) && to.equals(unit[2])) {
                    double a = Double.parseDouble(edfrm);
                    double b;
                    b = a * 750.062;
                    String ans = String.valueOf(b);
                    editTo.setText(ans);
                }
                else if(frm.equals(unit[1]) && to.equals(unit[0])) {
                    double a = Double.parseDouble(edfrm);
                    double b;
                    b = a * 1.000000423e-5;
                    String ans = String.valueOf(b);
                    editTo.setText(ans);
                }
                else if(frm.equals(unit[1]) && to.equals(unit[1])) {
                    double a = Double.parseDouble(edfrm);
                    String ans = String.valueOf(a);
                    editTo.setText(ans);
                }
                else if(frm.equals(unit[1]) && to.equals(unit[2])) {
                    double a = Double.parseDouble(edfrm);
                    double b;
                    b = a *  0.007500620000987;
                    String ans = String.valueOf(b);
                    editTo.setText(ans);
                }
                else if(frm.equals(unit[2]) && to.equals(unit[0])) {
                    double a = Double.parseDouble(edfrm);
                    double b ;
                    b = a * 0.0013332;
                    String ans = String.valueOf(b);
                    editTo.setText(ans);
                }
                else if(frm.equals(unit[2]) && to.equals(unit[1])) {
                    double a = Double.parseDouble(edfrm);
                    double b ;
                    b = a *  133.3224;
                    String ans = String.valueOf(b);
                    editTo.setText(ans);
                }
                else if(frm.equals(unit[2]) && to.equals(unit[2])) {
                    double a = Double.parseDouble(edfrm);
                    String ans = String.valueOf(a);
                    editTo.setText(ans);
                }
            }
        });

    }
    private void showAlertDialogListFrom(){
        AlertDialog.Builder dialogListFrom = new AlertDialog.Builder(this);
        dialogListFrom.setTitle("From");
        dialogListFrom.setItems(unit, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                switch (which){
                    case 0:
                        setUnit1.setText(unit[0]);
                        break;
                    case 1:
                        setUnit1.setText(unit[1]);
                        break;
                    case 2:
                        setUnit1.setText(unit[2]);
                        break;
                    case 3:
                        setUnit1.setText(unit[3]);
                        break;
                    case 4:
                        setUnit1.setText(unit[4]);
                        break;
                    case 5:
                        setUnit1.setText(unit[5]);
                        break;
                    case 6:
                        setUnit1.setText(unit[6]);
                        break;
                }
            }
        });
        AlertDialog alert = dialogListFrom.create();
        alert.setCanceledOnTouchOutside(true);
        alert.show();
    }

    private void showAlertDialogListTo() {
        AlertDialog.Builder dialogListFrom = new AlertDialog.Builder(this);
        dialogListFrom.setTitle("From");

        dialogListFrom.setItems(unit, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                switch (which) {
                    case 0:
                        setUnit2.setText(unit[0]);
                        break;
                    case 1:
                        setUnit2.setText(unit[1]);
                        break;
                    case 2:
                        setUnit2.setText(unit[2]);
                        break;
                    case 3:
                        setUnit2.setText(unit[3]);
                        break;
                    case 4:
                        setUnit2.setText(unit[4]);
                        break;
                    case 5:
                        setUnit2.setText(unit[5]);
                        break;
                    case 6:
                        setUnit2.setText(unit[6]);
                        break;
                }
            }
        });
        AlertDialog alert = dialogListFrom.create();
        alert.setCanceledOnTouchOutside(true);
        alert.show();
    }
}
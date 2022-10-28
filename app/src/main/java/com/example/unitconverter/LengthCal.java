package com.example.unitconverter;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.SearchRecentSuggestionsProvider;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LengthCal extends AppCompatActivity {

    TextView selectForm,selectTo,btnConvert,setUnit1,setUnit2;
    EditText editFrom,editTo;
    String[] unit = {"Kilometer","Meter","Centimeter","Feet","Inches","Micrometer"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length_cal);

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
                      Toast.makeText(LengthCal.this, "Please Enter the unit", Toast.LENGTH_SHORT).show();
                  }
                  if((editFrom.getText().toString()).equals("")){
                      Toast.makeText(LengthCal.this, "Enter some Value", Toast.LENGTH_SHORT).show();
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
                       double b ;
                       b = a * 100000;
                       String ans = String.valueOf(b);
                       editTo.setText(ans);
                   }
                   else if(frm.equals(unit[0]) && to.equals(unit[3])) {
                       double a = Double.parseDouble(edfrm);
                       double b ;
                       b = a * 3280.84;
                       String ans = String.valueOf(b);
                       editTo.setText(ans);
                   }
                   else if(frm.equals(unit[0]) && to.equals(unit[4])) {
                       double a = Double.parseDouble(edfrm);
                       double b ;
                       b = a * 39370.08;
                       String ans = String.valueOf(b);
                       editTo.setText(ans);
                   }
                   else if(frm.equals(unit[0]) && to.equals(unit[5])) {
                       double a = Double.parseDouble(edfrm);
                       double b ;
                       b = a * 1e+9;
                       String ans = String.valueOf(b);
                       editTo.setText(ans);                // comparison of kilo with all done
                   }
                   else if(frm.equals(unit[1]) && to.equals(unit[2])) {
                       double a = Double.parseDouble(edfrm);
                       double b;
                       b = a * 100;
                       String ans = String.valueOf(b);
                       editTo.setText(ans);
                   }
                   else if(frm.equals(unit[1]) && to.equals(unit[3])) {
                       double a = Double.parseDouble(edfrm);
                       double b;
                       b = a * 3.28084;
                       String ans = String.valueOf(b);
                       editTo.setText(ans);
                   }
                   else if(frm.equals(unit[1]) && to.equals(unit[4])) {
                       double a = Double.parseDouble(edfrm);
                       double b;
                       b = a * 39.37008;
                       String ans = String.valueOf(b);
                       editTo.setText(ans);
                   }
                   else if(frm.equals(unit[1]) && to.equals(unit[5])) {
                       double a = Double.parseDouble(edfrm);
                       double b;
                       b = a * 1000000.032;
                       String ans = String.valueOf(b);
                       editTo.setText(ans);
                   }
                   else if(frm.equals(unit[1]) && to.equals(unit[0])) {
                       double a = Double.parseDouble(edfrm);
                       double b ;
                       b = a * 0.001;
                       String ans = String.valueOf(b);
                       editTo.setText(ans);
                   }
                   else if(frm.equals(unit[2]) && to.equals(unit[0])) {
                       double a = Double.parseDouble(edfrm);
                       double b ;
                       b = a * 1e-5;
                       String ans = String.valueOf(b);
                       editTo.setText(ans);
                   }
                   else if(frm.equals(unit[2]) && to.equals(unit[1])) {
                       double a = Double.parseDouble(edfrm);
                       double b ;
                       b = a * 0.01;
                       String ans = String.valueOf(b);
                       editTo.setText(ans);
                   }
                   else if(frm.equals(unit[2]) && to.equals(unit[2])) {
                       double a = Double.parseDouble(edfrm);
                       String ans = String.valueOf(a);
                       editTo.setText(ans);
                   }
                   else if(frm.equals(unit[2]) && to.equals(unit[3])) {
                       double a = Double.parseDouble(edfrm);
                       double b ;
                       b = a * 0.0328084;
                       String ans = String.valueOf(b);
                       editTo.setText(ans);
                   }
                   else if(frm.equals(unit[2]) && to.equals(unit[4])) {
                       double a = Double.parseDouble(edfrm);
                       double b ;
                       b = a * 0.3937008;
                       String ans = String.valueOf(b);
                       editTo.setText(ans);
                   }
                   else if(frm.equals(unit[2]) && to.equals(unit[5])) {
                       double a = Double.parseDouble(edfrm);
                       double b ;
                       b = a * 10000.00032;
                       String ans = String.valueOf(b);
                       editTo.setText(ans);
                   }
                   else if(frm.equals(unit[3]) && to.equals(unit[0])) {
                       double a = Double.parseDouble(edfrm);
                       double b ;
                       b = a * 0.0003048;
                       String ans = String.valueOf(b);
                       editTo.setText(ans);
                   }
                   else if(frm.equals(unit[3]) && to.equals(unit[1])) {
                       double a = Double.parseDouble(edfrm);
                       double b ;
                       b = a * 0.3048;
                       String ans = String.valueOf(b);
                       editTo.setText(ans);
                   }
                   else if(frm.equals(unit[3]) && to.equals(unit[2])) {
                       double a = Double.parseDouble(edfrm);
                       double b ;
                       b = a * 30.48;
                       String ans = String.valueOf(b);
                       editTo.setText(ans);
                   }
                   else if(frm.equals(unit[3]) && to.equals(unit[3])) {
                       double a = Double.parseDouble(edfrm);

                       String ans = String.valueOf(a);
                       editTo.setText(ans);
                   }
                   else if(frm.equals(unit[3]) && to.equals(unit[4])) {
                       double a = Double.parseDouble(edfrm);
                       double b ;
                       b = a * 10000.00032;
                       String ans = String.valueOf(b);
                       editTo.setText(ans);
                   }
                   else if(frm.equals(unit[3]) && to.equals(unit[5])) {
                       double a = Double.parseDouble(edfrm);
                       double b ;
                       b = a * 304800;
                       String ans = String.valueOf(b);
                       editTo.setText(ans);                    // unit[3] completed
                   }
                   else if(frm.equals(unit[4]) && to.equals(unit[0])) {
                       double a = Double.parseDouble(edfrm);
                       double b ;
                       b = a * 2.54e-5;
                       String ans = String.valueOf(b);
                       editTo.setText(ans);
                   }
                   else if(frm.equals(unit[4]) && to.equals(unit[1])) {
                       double a = Double.parseDouble(edfrm);
                       double b ;
                       b = a * 0.0254;
                       String ans = String.valueOf(b);
                       editTo.setText(ans);
                   }
                   else if(frm.equals(unit[4]) && to.equals(unit[2])) {
                       double a = Double.parseDouble(edfrm);
                       double b ;
                       b = a * 2.54;
                       String ans = String.valueOf(b);
                       editTo.setText(ans);
                   }
                   else if(frm.equals(unit[4]) && to.equals(unit[3])) {
                       double a = Double.parseDouble(edfrm);
                       double b ;
                       b = a * 0.0833333;
                       String ans = String.valueOf(b);
                       editTo.setText(ans);
                   }
                   else if(frm.equals(unit[4]) && to.equals(unit[4])) {
                       double a = Double.parseDouble(edfrm);
                       String ans = String.valueOf(a);
                       editTo.setText(ans);
                   }
                   else if(frm.equals(unit[4]) && to.equals(unit[5])) {
                       double a = Double.parseDouble(edfrm);
                       double b ;
                       b = a * 25399.98984;
                       String ans = String.valueOf(b);
                       editTo.setText(ans);
                   }
                   else if(frm.equals(unit[5]) && to.equals(unit[0])) {
                       double a = Double.parseDouble(edfrm);
                       double b ;
                       b = a * 9.999996e-10;
                       String ans = String.valueOf(b);
                       editTo.setText(ans);
                   }
                   else if(frm.equals(unit[5]) && to.equals(unit[1])) {
                       double a = Double.parseDouble(edfrm);
                       double b;
                       b = a * 9.999996e-7;
                       String ans = String.valueOf(b);
                       editTo.setText(ans);
                   }
                   else if(frm.equals(unit[5]) && to.equals(unit[2])) {
                       double a = Double.parseDouble(edfrm);
                       double b;
                       b = a * 9.999996e-5;
                       String ans = String.valueOf(b);
                       editTo.setText(ans);
                   }
                   else if(frm.equals(unit[5]) && to.equals(unit[3])) {
                       double a = Double.parseDouble(edfrm);
                       double b;
                       b = a * 3.2808385827e-6;
                       String ans = String.valueOf(b);
                       editTo.setText(ans);
                   }
                   else if(frm.equals(unit[5]) && to.equals(unit[4])) {
                       double a = Double.parseDouble(edfrm);
                       double b;
                       b = a * 3.9370063e-5;
                       String ans = String.valueOf(b);
                       editTo.setText(ans);
                   }
                   else if(frm.equals(unit[5]) && to.equals(unit[5])) {
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
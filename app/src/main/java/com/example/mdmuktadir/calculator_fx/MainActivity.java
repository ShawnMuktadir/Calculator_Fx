package com.example.mdmuktadir.calculator_fx;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
;

public class MainActivity extends AppCompatActivity  {
    Button btn_scintifc,btn_unit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        makeObj();
    }

//    private void makeObj(){
//        btn_scintifc=(Button)findViewById(R.id.btn_scintifc);
//        btn_unit=(Button)findViewById(R.id.btn_unit);
//    }

    public void onClick(View view) {
        Intent intent;
        switch (view.getId()){
            case R.id.btn_scintifc:
                intent=new Intent(getApplicationContext(),SciCalcActivity.class);
                startActivity(intent);
                break;

            case R.id.btn_unit:
                intent=new Intent(getApplicationContext(),UnitConverter.class);
                startActivity(intent);
                break;


        }
    }
}








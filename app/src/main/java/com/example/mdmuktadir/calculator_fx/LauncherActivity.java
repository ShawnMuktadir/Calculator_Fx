package com.example.mdmuktadir.calculator_fx;

import android.content.Intent;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;


public class LauncherActivity extends AppCompatActivity {
    private static final int SPLASH_TIME = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//                new Handler().postDelayed(new Runnable() {
//                    @Override
//                    public void run() {
//                        Intent intent=new Intent(LauncherActivity.this,MainActivity.class);
//                        startActivity(intent);
//                        LauncherActivity.this.finish();
//                    }
//                },SPLASH_TIME);
//        new Loader().execute();


        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_launcher);
        getSupportActionBar().hide();


        LogoLauncher logoLauncher=new LogoLauncher();
        logoLauncher.start();



    }

    private class LogoLauncher extends Thread{
        public void run(){

            try{
                sleep(SPLASH_TIME);
            }catch (InterruptedException e){
                e.printStackTrace();

            }
            Intent intent = new Intent(LauncherActivity.this,MainActivity.class);
            startActivity(intent);
            LauncherActivity.this.finish();


        }
    }

//        private class Loader extends AsyncTask<Void,Void, Void>{
//
//            @Override
//            protected void onPreExecute() {
//                // TODO Auto-generated method stub
//                super.onPreExecute();
//
//            }
//
//
//            @Override
//            protected Void doInBackground(Void... params) {
//                // TODO Auto-generated method stub
//
//                try {
//
//                    Thread.sleep(SPLASH_TIME);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//
//                return null;
//            }
//
//            @Override
//            protected void onPostExecute(Void result) {
//                // TODO Auto-generated method stub
//                super.onPostExecute(result);
//
//                Intent intent = new Intent(LauncherActivity.this,MainActivity.class);
//
//                startActivity(intent);
//                finish();
//
//            }
//        }
}










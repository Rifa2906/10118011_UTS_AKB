package com.example.akb_10118011_uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class   Splash extends AppCompatActivity {

    //    tanggal pengerjaan 2/6/2021
//    Moch Rifa Maualana N
//    10118011
//    IF10

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        Thread thread = new Thread(){
            public  void run(){
                try {
                    sleep(3000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    startActivity(new Intent(Splash.this, Walkthrough.class));
                    finish();
                }
            }
        };
        thread.start();
    }
}
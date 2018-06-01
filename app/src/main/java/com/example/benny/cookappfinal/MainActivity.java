package com.example.benny.cookappfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public Button button_snz;
    public Button button_snn;
    public Button button_zr;
    public Button button_me;
    public Button button_i;
    public Button button_im;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_snz = (Button) findViewById(R.id.button_snz);
        button_snz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSucheNachZutatenActivity();
            }
        });{
        }

        button_snn = (Button) findViewById(R.id.button_snn);
        button_snn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSucheNachNameActivity();
            }
        });

        button_zr = (Button) findViewById(R.id.button_zr);
        button_zr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openZufälligesRezeptActivity();
            }
        });

        button_me = (Button) findViewById(R.id.button_me);
        button_me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMeinEinkaufActivity();
            }
        });

        button_i = (Button) findViewById(R.id.button_i);
        button_i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInfoActivity();
            }
        });

        button_im = (Button) findViewById(R.id.button_im);
        button_im.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openImpressumActivity();
            }
        });

    }

    public void openSucheNachNameActivity(){
        Intent idonno = new Intent(this, SucheNachNameActivity.class);
        startActivity(idonno);
    }

    public void openSucheNachZutatenActivity(){
        Intent idonno = new Intent(this, SucheNachZutatenActivity.class);
        startActivity(idonno);
    }

    public void openZufälligesRezeptActivity(){
        Intent idonno = new Intent(this, ZufaelligesRezeptActivity.class);
        startActivity(idonno);
    }

    public void openMeinEinkaufActivity(){
        Intent idonno = new Intent(this, MeinEinkaufActivity.class);
        startActivity(idonno);
    }

    public void openInfoActivity(){
        Intent idonno = new Intent(this, InfoActivity.class);
        startActivity(idonno);
    }

    public void openImpressumActivity(){
        Intent idonno = new Intent(this, ImpressumActivity.class);
        startActivity(idonno);
    }
}

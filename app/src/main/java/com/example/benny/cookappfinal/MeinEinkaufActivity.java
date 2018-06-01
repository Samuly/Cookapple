package com.example.benny.cookappfinal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

/**
 * Created by Benny on 13.05.2018.
 */

public class MeinEinkaufActivity extends AppCompatActivity {
    public ListView list1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mein_einkauf);
    }
}

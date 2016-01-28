package com.example.nganv.baucua;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
GridView gridView;
    CustomGridview_Banco adapter;
    Integer[] dshinh={R.drawable.bau,R.drawable.nai, R.drawable.ca,R.drawable.ga,R.drawable.cua1,R.drawable.tom};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView= (GridView) findViewById(R.id.imgBanco);
        adapter= new CustomGridview_Banco(this, R.layout.custom_banco,dshinh);
        gridView.setAdapter(adapter);

    }


}

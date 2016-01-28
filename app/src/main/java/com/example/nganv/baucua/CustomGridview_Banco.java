package com.example.nganv.baucua;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

/**
 * Created by nganv on 27/01/2016.
 */
public class CustomGridview_Banco extends ArrayAdapter<Integer> {
Context context;
    int resource;
    Integer[] objects;
    Integer[] giatien={0,10,20,50,100,200,500};
     ArrayAdapter<Integer> adapter;
    public CustomGridview_Banco (Context context,int resource, Integer[] objects)
    {
        super(context,resource, objects);
        this.context=context;
        this.resource=resource;
        this.objects=objects;
        adapter= new ArrayAdapter<Integer>(context,android.R.layout.simple_spinner_item,giatien);
    }
public View getView(int position, View converView, ViewGroup parent)
{
    View view=View.inflate(context,resource, null);


ImageView imgBanco=(ImageView) view.findViewById(R.id.imgBanco);
    Spinner spinGiatien=(Spinner) view.findViewById(R.id.spinGiatien);
    imgBanco.setImageResource(objects[position]);
spinGiatien.setAdapter(adapter);
    return view;

}

}

package com.example.furkantzn.arkadaslistesi;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;
import java.util.List;

/**
 * Created by Furkan Tüzün on 13.2.2017.
 */

public class OzelAdaptor extends BaseAdapter {

    LayoutInflater layoutInflater;
    List<Arkadaslar> list;
    Activity activity;

    public OzelAdaptor(Activity activity, List<Arkadaslar> mList){
        layoutInflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        list=mList;
        this.activity=activity;
    }
    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View satirView;

        satirView=layoutInflater.inflate(R.layout.satir,null);

        ImageView iv=(ImageView)satirView.findViewById(R.id.imageView);
        TextView tvisim=(TextView)satirView.findViewById(R.id.textViewisim);
        Button buton=(Button)satirView.findViewById(R.id.button);


        final Arkadaslar ArkadasListesi = list.get(position);

        tvisim.setText(ArkadasListesi.getIsim().toString());
        buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(activity,"Merhaba  "+ArkadasListesi.getIsim().toString(),Toast.LENGTH_SHORT).show();
            }
        });
        String arkadasIsim =ArkadasListesi.getIsim().toString();
        if(arkadasIsim.equals("Ahmet")){
            iv.setImageResource(R.drawable.karakter1);
        }
        else if(arkadasIsim.equals("Mehmet")){
            iv.setImageResource(R.drawable.karakter2);
        }
        else if(arkadasIsim.equals("Büşra")){
            iv.setImageResource(R.drawable.karakter3);
        }
        else if(arkadasIsim.equals("Deniz")){
            iv.setImageResource(R.drawable.karakter1);
        }
        else
        {
            iv.setImageResource(R.drawable.profilyok);
        }



        return satirView;
    }
}

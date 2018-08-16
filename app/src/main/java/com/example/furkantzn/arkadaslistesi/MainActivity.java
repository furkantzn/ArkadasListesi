package com.example.furkantzn.arkadaslistesi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    List<Arkadaslar> ArkadasListesi = new ArrayList<Arkadaslar>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        ArkadasListesi.add(new Arkadaslar("Ahmet"));
        ArkadasListesi.add(new Arkadaslar("Büşra"));
        ArkadasListesi.add(new Arkadaslar("Deniz"));
        ArkadasListesi.add(new Arkadaslar("Mehmet"));
        ArkadasListesi.add(new Arkadaslar("Alp"));
        ArkadasListesi.add(new Arkadaslar("Seda"));
        ArkadasListesi.add(new Arkadaslar("Gül"));
        ArkadasListesi.add(new Arkadaslar("Mirza"));
        ArkadasListesi.add(new Arkadaslar("Mustafa"));
        ArkadasListesi.add(new Arkadaslar("Berkay"));
        ArkadasListesi.add(new Arkadaslar("John"));
        ArkadasListesi.add(new Arkadaslar("Leonardo"));

        listView = (ListView) findViewById(R.id.listView);

        OzelAdaptor adaptor=new OzelAdaptor(this,ArkadasListesi);
        listView.setAdapter(adaptor);
    }
}

package com.example.ai.museum_bentoel;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private CardView desc_cV;
    private CardView facy_cV;
    private CardView gambar_cV;
    private CardView opini_cV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //goto Desc Page
        desc_cV = (CardView) findViewById(R.id.deskripsi_cardView);
        desc_cV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i_desc = new Intent(getApplicationContext(),DeskripsiActivity.class);
                startActivity(i_desc);
                finish();
            }
        });
        //goto Fasilitas Page
        facy_cV = (CardView) findViewById(R.id.fasilitas_cardView);
        facy_cV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i_facy = new Intent(getApplicationContext(),FasilitasActivity.class);
                startActivity(i_facy);
                finish();
            }
        });
        //goto Gambar Page
        gambar_cV = (CardView) findViewById(R.id.gambar_cardView);
        gambar_cV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i_gambar = new Intent(getApplicationContext(),GambarMusiumActivity.class);
                startActivity(i_gambar);
                finish();
            }
        });
        //goto Opini Page
        opini_cV = (CardView) findViewById(R.id.opini_cardView);
        opini_cV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i_opini = new Intent(getApplicationContext(),OpiniActivity.class);
                startActivity(i_opini);
                finish();
            }
        });

        final Toolbar toolbar = (Toolbar)findViewById(R.id.MyToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //for set Tittle in CollapseToolbar
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout)findViewById(R.id.collapse_toolbar);
        collapsingToolbarLayout.setTitle("Wisata Sejarah");
        //backgroud after slideUp
        Context context = this;
        collapsingToolbarLayout.setContentScrimColor(ContextCompat.getColor(context,R.color.darker_red));

        //open to MAPS
        Button maps_btn = (Button) findViewById(R.id.maps_btn);
        maps_btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent i_maps = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/maps/place/Museum+Bentoel+Prima.+PT/@-7.9867702,112.6298729,17z/data=!3m1!4b1!4m5!3m4!1s0x2dd6281757f4fcd1:0xadf614e532e90331!8m2!3d-7.9867755!4d112.6320616"));
                startActivity(i_maps);
            }
        });




    }
}

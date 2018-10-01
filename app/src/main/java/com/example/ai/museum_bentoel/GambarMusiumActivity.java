package com.example.ai.museum_bentoel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GambarMusiumActivity extends AppCompatActivity {

    private Button back2_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gambar_musium);

        back2_btn = (Button)findViewById(R.id.back2);
        back2_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i_back2 = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i_back2);
                finish();
            }
        });
    }
}

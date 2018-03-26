package com.udacity.moaazfathy.androidlibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;



public class JokeUi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.joke_ui);
        Intent intent = this.getIntent();
        if (intent != null) {
            String joke = getIntent().getStringExtra("joke");
            TextView joke_tv =  findViewById(R.id.txt);
            joke_tv.setText(joke);
        }
    }
}

package com.jacquessmuts.androidjoker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AndroidJokerActivity extends AppCompatActivity {

    public static final String EXTRA_JOKE = "extra_joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_joker);

        Bundle bundle = getIntent().getExtras();
        if (bundle.containsKey(EXTRA_JOKE)){
            TextView textView = (TextView) findViewById(R.id.text_joke);
            textView.setText(bundle.getString(EXTRA_JOKE));
        }
    }
}

package com.tarikachawla.productflavor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView title = (TextView) findViewById(R.id.movieTitle);
        title.setText(R.string.movieTitle);
        TextView desc = (TextView) findViewById(R.id.movieDescription);
        desc.setText(R.string.movieDescription);
    }

    public void onDetailClick(View view) {
        view.getContext().startActivity(DetailsActivity.newIntent(this));
    }
}

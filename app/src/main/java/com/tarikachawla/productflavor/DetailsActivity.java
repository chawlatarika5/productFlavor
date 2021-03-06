package com.tarikachawla.productflavor;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;
import com.tarikachawla.productflavor.R;

public class DetailsActivity extends AppCompatActivity {
    private static final String TAG = DetailsActivity.class.getSimpleName() ;
    private ImageView bobImage;
    private ImageView kevinImage;

    public static Intent newIntent(Context context) {
        return new Intent(context, DetailsActivity.class);
    }


    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        TextView kevinName = (TextView) findViewById(R.id.kevinName);
        TextView bobName = (TextView) findViewById(R.id.bobName);
        bobImage = (ImageView) findViewById(R.id.bobImage);
        kevinImage = (ImageView) findViewById(R.id.kevinImage);
        TextView kevinDesc = (TextView) findViewById(R.id.kevinDescription);
        TextView bobDesc = (TextView) findViewById(R.id.bobDescription);
        kevinName.setText(R.string.KevinName);
        bobName.setText(R.string.BobName);
        kevinDesc.setText(R.string.KevinDesc);
        bobDesc.setText(R.string.BobDesc);
        getImages();
    }

    private void getImages() {
        loadImage(bobImage,
            "https://s-media-cache-ak0.pinimg.com/originals/a2/31/56/a231564081aedeb54f5aa630741e37af.jpg");
        loadImage(kevinImage,
            "https://s-media-cache-ak0.pinimg.com/736x/63/b5/51/63b551a3d3eaf5b5e5275c744132eed2--the-rules-kevin-oleary.jpg");
    }

    private void loadImage(ImageView imageView, String iconUrl) {
        Log.d(TAG, "Reached here");
        if(BuildConfig.glideLibrary) {
            Toast.makeText(getApplicationContext(), "Using Glide", Toast.LENGTH_LONG).show();
            Glide.with(imageView.getContext())
                .load(iconUrl)
                .into(imageView);
        } else {
            Toast.makeText(getApplicationContext(), "Using Picasso", Toast.LENGTH_LONG).show();
            Picasso.with(imageView.getContext())
                .load(iconUrl)
                .into(imageView);
        }
    }
}

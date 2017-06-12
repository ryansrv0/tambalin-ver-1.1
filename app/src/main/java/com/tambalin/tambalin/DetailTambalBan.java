package com.tambalin.tambalin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;


public class DetailTambalBan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_tambal_ban);

      //  ImageView eventImageView = (ImageView) findViewById(R.id.eventImageView);
        TextView titleTextView = (TextView) findViewById(R.id.namaTextView);
        //TextView descriptionTextView = (TextView) findViewById(R.id.descriptionLabel);
        TextView dateTextView = (TextView) findViewById(R.id.addressTextView);
        TextView placeTextView = (TextView) findViewById(R.id.locationLabel);
        //TextView speakerTextView = (TextView) findViewById(R.id.ownerTextView);

        Intent currentIntent = getIntent();
        String title = currentIntent.getStringExtra("Nama");
        String date = currentIntent.getStringExtra("Alamat");
        String place = currentIntent.getStringExtra("Jam Buka");

        titleTextView.setText(title);
        dateTextView.setText(date);
        placeTextView.setText(place);


    }
}

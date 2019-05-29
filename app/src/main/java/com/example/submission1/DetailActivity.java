package com.example.submission1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
    TextView tvTitle, tvDesc;
    ImageView imgPoster;
    Button btnFav;

    public final static String EXTRA_NAME = "extra_name";
    public final static String EXTRA_DESCRIPTION = "extra_description";
    //public final static Integer EXTRA_PHOTO = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        imgPoster = findViewById(R.id.img_item_photo);
        tvTitle = findViewById(R.id.tv_item_name);
        tvDesc = findViewById(R.id.tv_item_description);

        Glide.with(this)
                .load(getIntent().getStringExtra("foto"))
                .into(imgPoster);

        tvTitle.setText(getIntent().getStringExtra(EXTRA_NAME));
        tvDesc.setText(getIntent().getStringExtra(EXTRA_DESCRIPTION));

        btnFav = findViewById(R.id.btn_set_fav);
        btnFav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DetailActivity.this, "Favorite "+getIntent().getStringExtra(EXTRA_NAME), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

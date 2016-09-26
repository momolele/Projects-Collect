package com.qfz.app.projectscollect;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button popularMoviesButton,stockHawkButton,buildItBiggerButton,
            makeYoutAppMaterialButton,goUbiquitousButton,capstoneButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        popularMoviesButton.setOnClickListener(this);
        stockHawkButton.setOnClickListener(this);
        buildItBiggerButton.setOnClickListener(this);
        makeYoutAppMaterialButton.setOnClickListener(this);
        goUbiquitousButton.setOnClickListener(this);
        capstoneButton.setOnClickListener(this);
    }

    private void init() {
        Button popularMoviesButton = (Button)findViewById(R.id.popular_movies_button);
        Button stockHawkButton = (Button)findViewById(R.id.stock_hawk_button);
        Button buildItBiggerButton = (Button)findViewById(R.id.build_it_bigger_button);
        Button makeYoutAppMaterialButton = (Button)findViewById(R.id.make_yout_app_material_button);
        Button goUbiquitousButton = (Button)findViewById(R.id.go_ubiquitous_button);
        Button capstoneButton = (Button)findViewById(R.id.capstone_button);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.popular_movies_button:
                Toast.makeText(getApplicationContext(),"This button will launch my PopularMovies app!",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.stock_hawk_button:
                Toast.makeText(getApplicationContext(),"This button will launch my STOCK HAWK app!",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.build_it_bigger_button:
                Toast.makeText(getApplicationContext(),"This button will launch my BUILD IT BIGGER app!",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.make_yout_app_material_button:
                Toast.makeText(getApplicationContext(),"This button will launch my MAKE YOUR APP MATERIAL app!",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.go_ubiquitous_button:
                Toast.makeText(getApplicationContext(),"This button will launch my GO UBIQUITOUS app!",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.capstone_button:
                Toast.makeText(getApplicationContext(),"This button will launch my CAPSTONE app!",
                        Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }

    }
}

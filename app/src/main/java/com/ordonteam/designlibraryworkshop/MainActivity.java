package com.ordonteam.designlibraryworkshop;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(findViewById(R.id.container), R.string.button, Snackbar.LENGTH_LONG)
                        .setAction(R.string.action, null).show();
            }
        });
        NavigationView navigationView = (NavigationView) findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.navigation_gallery_item){
            Snackbar.make(findViewById(R.id.container), R.string.gallery, Snackbar.LENGTH_LONG).show();
            return true;
        }
        return false;
    }
}

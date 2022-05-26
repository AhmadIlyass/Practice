package com.example.glidepractice;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        getSupportActionBar().setTitle("My Toolbar");

        toolbar.setSubtitle("OMG Subtitle");
        toolbar.setTitle("OMG title");

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        new MenuInflater(this).inflate(R.menu.opt_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemId= item.getItemId();
        if (itemId==R.id.opt_save){
            Toast.makeText(this, "YouClickedSave", Toast.LENGTH_SHORT).show();
        }else if(itemId==android.R.id.home){
            Toast.makeText(this, "Exiting", Toast.LENGTH_SHORT).show();
            super.onBackPressed();
        }else if(itemId==R.id.opt_open){
            Toast.makeText(this, "You Clicked Open", Toast.LENGTH_SHORT).show();
        }
        
        
        
        return super.onOptionsItemSelected(item);
    }
}
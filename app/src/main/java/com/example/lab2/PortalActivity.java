package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class PortalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_portal);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.principal, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.menu_inicio:
                Log.i("====>","Click en Clientes!!");
                startActivity(new Intent(this,RegistroActivity.class) );
                return true;
            case R.id.menu_productos:
                Log.i("====>","Click en Productos!!");
                startActivity(new Intent(this,ProductoActivity.class) );
                return true;
            case R.id.menu_servicios:
                Log.i("====>","Click en Servicios!!");
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
package com.Azimzada.firstapplication;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.Azimzada.firstapplication.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;

import java.util.function.DoubleToIntFunction;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

        binding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        /**/
        int sayi1;
        sayi1 = 27;

        int sayi2 = sayi1;
        int sayi3  = -15 ;
        int not1 = 77, not2 = 56;
        int ortlama1 = 55 , ortalama2;
        ortalama2 = 22;
        System.out.println(sayi1);
        System.out.println("Salam qadasi");
        System.out.println("sayi bir deyiskenin deyeri  " + sayi2);
        System.out.println(sayi3 + " " +  not1  + " "+  not2);
        System.out.println(ortlama1 +  ""  + ortalama2);
        System.out.println(" ============= Double =================");
        double litre = 2.5; //
        System.out.println(litre);
        System.out.println("===========FLoat ==========");
        float vize = 77.9f; // Floata "f" yazilmalidi
        float _final = 55f;
        System.out.println(vize + " " + _final);
        System.out.println("=========== BYTE ==========");
        byte s1 = -127; // max 127    || -128
        System.out.println(s1);
        System.out.println("===Char==");
        char a1 = 'a';
        System.out.println(a1);
        String a3 = "sa";
        System.out.println(a3);
        System.out.println("Boolean");
        boolean t1 = true;
        boolean t2 = false;

        System.out.println(t1 + " " + t2);
        boolean b1 = 5 < 1 ; // ! false
        System.out.println(b1);
        boolean b2 = 5 > 1 ; // ! true
        System.out.println(b2);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }
}
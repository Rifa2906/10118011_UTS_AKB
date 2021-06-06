package com.example.akb_10118011_uts;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.example.akb_10118011_uts.Crud.Tambah;
import com.example.akb_10118011_uts.Fragment_navigation.Aktivitas_harian;
import com.example.akb_10118011_uts.Fragment_navigation.Profile;
import com.example.akb_10118011_uts.Fragment_navigation.Tentang_aplikasi;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import org.jetbrains.annotations.NotNull;

public class Bottom_navigation extends AppCompatActivity {

//    tanggal pengerjaan 6/6/2021
//    Moch Rifa Maualana N
//    10118011
//    IF10



    BottomNavigationView bottomNavigationView;
    private BottomNavigationView.OnNavigationItemSelectedListener navigation = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(MenuItem item) {

            Fragment f = null;
            switch (item.getItemId()){
                case R.id.menu_profile:
                    f = new Profile();
                    break;
                case R.id.menu_Catatan:
                    f = new Aktivitas_harian();
                    break;
                case R.id.menu_tentang:
                    f = new Tentang_aplikasi();
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.isi,f).commit();
            return true;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bottom_navigation);

        bottomNavigationView = findViewById(R.id.button_navigation_menu);
        bottomNavigationView.setOnNavigationItemSelectedListener(navigation);



    }
}
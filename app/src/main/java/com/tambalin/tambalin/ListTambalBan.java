package com.tambalin.tambalin;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ListTambalBan extends AppCompatActivity {

    ListView nEventListView;
    ImageButton buttonAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_tambal_ban);

        nEventListView = (ListView) findViewById(R.id.tambalListView);
        List<ListItem> events = generateFakeEvents();
        final ListAdapter adapter = new
                ListAdapter(this,R.layout.row_item,events);
        nEventListView.setAdapter(adapter);
        nEventListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                ListItem selectedEvent = (ListItem)
                        adapterView.getItemAtPosition(i);
                Intent  nextPage = new Intent(ListTambalBan.this, DetailTambalBan.class);
                nextPage.putExtra("Nama",selectedEvent.getNama());
                nextPage.putExtra("Alamat",selectedEvent.getAlamat());
                nextPage.putExtra("Jam Buka",selectedEvent.getJam());

                startActivity(nextPage);

            }
        });
        buttonAdd = (ImageButton) findViewById(R.id.fab);
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(new Intent(ListTambalBan.this,
                        AddLokasi.class), 212);
            }
        });
    }

    private List<ListItem> generateFakeEvents(){
        List<ListItem> events = new ArrayList<>();
        for (int i = 0; i < 35; i++) {
            events.add(new ListItem("Tambal Ban Pak Ali","Condong Catur",
                    "08.00-22.00"));
        }
        return events;
    }

    /*private void logout() {
        Intent i =new Intent(ListTambalBan.this, LoginActivity.class);
        startActivity(i);
        finish();
    }*/
}

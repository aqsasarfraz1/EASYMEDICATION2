package com.example.easymedication;

import android.app.Activity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

import com.example.easymedication.R.id;

public class dashboard extends AppCompatActivity {
    public TextView dashboard;
    public EditText searchbar1,searchbar2;
    public ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        // Initialize UI elements
         dashboard = findViewById(R.id.dashboardTitle);
         searchbar1 = findViewById(R.id.searchBar1);
         searchbar2 = findViewById(R.id.searchBar2);
         listView = findViewById(R.id.list_item);

        // Set the title
      //  dashboardTitle.setText("Dashboard Title");

        // Create an ArrayAdapter for the ListView
        String[] suggestions = {"Suggestion 1", "Suggestion 2", "Suggestion 3", "Suggestion 4", "Suggestion 5"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, suggestions);
        // Set the adapter on the ListView
        listView.setAdapter(adapter);

        // Set an item click listener for the ListView
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Get the selected item
                String selectedItem = (String) parent.getItemAtPosition(position);

                // Show a toast message with the selected item
                Toast.makeText(dashboard.this, "Selected: " + selectedItem, Toast.LENGTH_SHORT).show();
            }
        });

        // Set a click listener for searchBar

        searchbar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle click event for searchBar
                // Add your code here
                Toast.makeText(dashboard.this, "Search Bar Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        // Set a click listener for searchBar2
        searchbar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle click event for searchBar2
                // Add your code here
                Toast.makeText(dashboard.this, "Search Bar 2 Clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

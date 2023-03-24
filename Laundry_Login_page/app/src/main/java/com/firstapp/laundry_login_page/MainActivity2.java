package com.firstapp.laundry_login_page;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    LinearLayout l1;
    LinearLayout l2;
    LinearLayout l3;
    ConstraintLayout cl1;
    TextView t1;
    Integer currentIndex = 1;
    Integer currentColorIndex = 1;
    RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        l1 = findViewById(R.id.ll1);
        l2 = findViewById(R.id.ll2);
        l3 = findViewById(R.id.ll3);
        cl1 = findViewById(R.id.constraintLayout1);
        t1 = findViewById(R.id.textView8);
        rv = findViewById(R.id.my_recycler);
        l3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(MainActivity2.this, PricelistActivity.class);
                startActivity(intentLoadNewActivity);
            }
        });

        int[] colors = {Color.GREEN, Color.RED};
        String[] texts = {"Request for Laundry", "Cancel Request"};

        cl1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the current color from the array using the current color index
                int currentColor = colors[currentColorIndex%2];
                String currentText = texts[currentIndex%2];
                currentIndex = currentIndex +1;

                // Set the text color of the TextView to the current color
                t1.setTextColor(currentColor);
                t1.setText(currentText);
                Toast.makeText(getApplicationContext(), "Text changed to " + currentText, Toast.LENGTH_SHORT).show();

                // Increment the current color index and wrap around if necessary
                currentColorIndex = (currentColorIndex + 1);
            }
        });
        l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, User_Profile.class);
                startActivity(intent);
            }
        });

    }
}
package com.techeasylife.clocktest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextClock;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    //Button Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView banglaTextClock = findViewById(R.id.banglaTextClock);
        TextView banglaTextClock2 = findViewById(R.id.banglaTextClock2);
        //Button =findViewById(R.id.Button);


      /* Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent secondActivityIntent = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(secondActivityIntent);
            }
        });

       */



        Locale locale = new Locale("bn");

// Get the current date and time in Bangla format
        DateFormat dateFormat = new SimpleDateFormat("আজ: EEEE, dd MMMM yyyy", locale);
        Calendar cal = Calendar.getInstance();
        String banglaDateTime = dateFormat.format(cal.getTime());

// Replace the English month names with Bangla month names
        String[] englishMonths = getResources().getStringArray(R.array.english_months);
        String[] banglaMonths = getResources().getStringArray(R.array.bangla_months);

        for (int i = 0; i < englishMonths.length; i++) {
            banglaDateTime = banglaDateTime.replace(englishMonths[i], banglaMonths[i]);
        }

// Set the text of the TextView to the Bangla date and time
        banglaTextClock.setText(banglaDateTime);




    }
}
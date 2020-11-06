package com.example.android_no5_dateNtimeexchange;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(time);

    }
    private View.OnClickListener time = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            DecimalFormat time = new DecimalFormat("0");
            EditText year = (EditText)findViewById(R.id.editview1);
            EditText mouth = (EditText)findViewById(R.id.editview2);
            EditText day = (EditText)findViewById(R.id.editview3);
            EditText hour = (EditText)findViewById(R.id.editview4);
            EditText minute = (EditText)findViewById(R.id.editview5);
            EditText secord = (EditText)findViewById(R.id.editview6);


            int years = Integer.parseInt(year.getText().toString());
            int mouths = Integer.parseInt(mouth.getText().toString());
            int days = Integer.parseInt(day.getText().toString());
            int hours = Integer.parseInt(hour.getText().toString());
            int minutes = Integer.parseInt(minute.getText().toString());
            int secords = Integer.parseInt(secord.getText().toString());


            TextView yNmNd = (TextView)findViewById(R.id.setyNmNd);
            yNmNd.setText(time.format(years) + "/" + time.format(mouths) + "/" + time.format(days));
            TextView oNmNs = (TextView)findViewById(R.id.setoNmNs);
            oNmNs.setText(time.format(hours) + ":" + time.format(minutes) + ":" + time.format(secords));
            TextView leap = (TextView)findViewById(R.id.setleapear);


            if (years % 4 == 0)
                leap.setText("是");
            else if (years % 100 == 0)
                leap.setText("是");
            else if (years % 400 == 0)
                leap.setText("是");
            else
                leap.setText("不是");
        }
    };
}
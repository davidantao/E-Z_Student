package com.example.e_zstudent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button result = (Button) findViewById(R.id.results);
        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText gradeone = (EditText) findViewById(R.id.gradeone);
                EditText gradetwo = (EditText) findViewById(R.id.gradetwo);
                EditText gradethree = (EditText) findViewById(R.id.gradethree);
                EditText gradefour = (EditText) findViewById(R.id.gradefour);
                EditText gradefive = (EditText) findViewById(R.id.gradefive);
                EditText avgaim = (EditText) findViewById(R.id.avgaim);
                TextView diagnosis = (TextView) findViewById(R.id.diagnosis);

                int grade1 = Integer.parseInt(gradeone.getText().toString());
                int grade2 = Integer.parseInt(gradetwo.getText().toString());
                int grade3 = Integer.parseInt(gradethree.getText().toString());
                int grade4 = Integer.parseInt(gradefour.getText().toString());
                int grade5 = Integer.parseInt(gradefive.getText().toString());
                int aimed = Integer.parseInt(avgaim.getText().toString());
                double curravg = ((grade1 + grade2 + grade3 + grade4 + grade5) / 5);
                double odds = ((100 - (aimed - curravg)) * 0.7);
                diagnosis.setText("Right now, your term average is "  + curravg +". At your current rate," +
                        "you have a " + odds + " percent chance at reaching your goal." );


            }
        });
    }

}

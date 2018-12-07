package org.emi.uebung.emiapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String inputNumber = Integer.toString(1234);
                int[] digits = new int[inputNumber.length()];
                int digitSum = 0;
                for (int i = 0; i < digits.length; i++) {
                    digits[i] = inputNumber.charAt(i) - '0';
                    digitSum += digits[i];
                }

                Log.d("Output: ", Integer.toString(digitSum) );
                Log.d("count: ", Integer.toString(digits.length));

            }
        });


    }
}

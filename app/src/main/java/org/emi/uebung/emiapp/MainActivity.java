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

        final Button buttonFib = findViewById(R.id.button2);
        buttonFib.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                String idk = calculateFibonacciRow();
            }
        });

    }
        public static String calculateFibonacciRow(){
            int[] row = new int[30];
            row[0]=0;
            row[1]=1;
            for(int i=2;i <= row.length; i++){
                row[i]=row[i-1]+row[i-2];
            }
            String FibinacciRowString = "";
            for(int elem : row){
                FibinacciRowString = FibinacciRowString + Integer.toString(row[elem]) + "\n";
            }
            Log.d("Output: ", FibinacciRowString );
            return FibinacciRowString;
        }

}





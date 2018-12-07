package org.emi.uebung.emiapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = findViewById(R.id.button1);
        final TextView digitSumTextView = findViewById(R.id.textView2);
        final EditText digitSumInput = findViewById(R.id.editText);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String inputNumber = digitSumInput.getText().toString();
                int[] digits = new int[inputNumber.length()];
                int digitSum = 0;
                for (int i = 0; i < digits.length; i++) {
                    digits[i] = inputNumber.charAt(i) - '0';
                    digitSum += digits[i];
                }


                digitSumTextView.setText(Integer.toString(digitSum));
                Log.d("Output: ", Integer.toString(digitSum) );
                Log.d("count: ", Integer.toString(digits.length));

            }
        });


        final TextView FibTextView = findViewById(R.id.textView4);
        FibTextView.setMovementMethod(new ScrollingMovementMethod());
        final Button buttonFib = findViewById(R.id.button2);
        buttonFib.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                FibTextView.setText(calculateFibonacciRow());
            }
        });



    }
        public static String calculateFibonacciRow(){
            int[] row = new int[30];
            row[0]=0;
            row[1]=1;
            for(int i=2;i < row.length; i++){
                row[i]=row[i-1]+row[i-2];
            }
            String FibunacciRowString = "";
            for(int i = 0; i < row.length; i++){
                FibunacciRowString = FibunacciRowString + Integer.toString(row[i]) + "\n";
            }
            Log.d("Output: ", FibunacciRowString );
            return FibunacciRowString;
        }

}





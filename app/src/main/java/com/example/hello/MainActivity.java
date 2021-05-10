package com.example.hello;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public int mCount = 0;

    private TextView mShowCount;
    Button button_zero;
    Button call;
    public static final String a = "ai";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);

        button_zero = (Button)findViewById(R.id.button_zero);
        button_zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCount = 0;
                mShowCount.setText(Integer.toString(mCount));
            }
        });

        call = (Button) findViewById(R.id.button_toast);

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);

                String mess = "Hello!" + Integer.toString(mCount);
                intent.putExtra(a,mess);
                startActivity(intent);
            }
        });
    }

//    public void showToast(View view) {
//        Toast toast = Toast.makeText(this, R.string.toast_message,
//                Toast.LENGTH_SHORT);
//        toast.show();
//    }

    public void countUp(View view) {
        ++mCount;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }
}
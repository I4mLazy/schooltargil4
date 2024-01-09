package com.example.schooltargil4;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;



public class MainActivity extends AppCompatActivity
{
    private Button btn;
    private int counter;
    private int temp;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn= findViewById(R.id.button);



    }

    public void go(View view)
    {
        counter++;
        btn.setText("This is click number: " + counter);
        temp = counter;
        while(temp / 10 >= 10)
        {
            if(temp % 10 == 7)
            {
                btn.setText("BOOM!");
            }
            temp= temp / 10;
        }
        if(counter % 7 == 0 || counter % 10 == 7)
        {
            btn.setText("BOOM!");
        }

    }
}
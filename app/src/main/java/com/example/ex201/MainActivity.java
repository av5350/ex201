package com.example.ex201;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btn;

    ImageView iv;

    Random rnd = new Random();

    int randomNum = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=(Button)findViewById(R.id.btn);
        iv=(ImageView)findViewById(R.id.iv);
    }

    public void random(View view) {

        randomNum = rnd.nextInt(3)+1;

        btn.setText(""+randomNum);

        switch (randomNum)
        {
            case 1:
                iv.setImageResource(R.drawable.one);
                break;
            case 2:
                iv.setImageResource(R.drawable.two);
                break;
            case 3:
                iv.setImageResource(R.drawable.three);
                break;
        }

    }
}
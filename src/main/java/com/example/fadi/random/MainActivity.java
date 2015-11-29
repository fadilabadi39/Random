package com.example.fadi.random;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;


public class MainActivity extends AppCompatActivity {


    Random rand = new Random();

    int e;
    int r;
    int x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button a1 = (Button) findViewById(R.id.A);

        x = rand.nextInt(1001);


        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final EditText edit = (EditText) findViewById(R.id.f);
                String m = String.valueOf(edit.getText());
                e = Integer.parseInt(m);

                r = x - e;

                if (r == 0)
                    message("equal");
                if ((r > 5 && r < 100) || (r > -100 && r < -5))
                    message("closed");
                if ((r > 0 && r < 5) || (r > -5 && r < 0)) {


                    message("the number is very closed");
                } else {
                    message("the number is far");
                }
            }
        });


    }

    private void message(String text) {
        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT)
                .show();
    }


}




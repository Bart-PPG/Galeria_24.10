package com.example.galeria;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    private TextView like;
    private Button next;
    private Button prev;
    private int licznik;

    private ArrayList<Integer> obrazki = new ArrayList<>();



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        obrazki.add(R.drawable.butterfly1);
        obrazki.add(R.drawable.butterfly2);
        obrazki.add(R.drawable.butterfly3);
        obrazki.add(R.drawable.butterfly4);
        obrazki.add(R.drawable.butterfly5);
        imageView = findViewById(R.id.imageView);
        like = findViewById(R.id.textView);
        prev = findViewById(R.id.button1);
        next = findViewById(R.id.button2);
        prev.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        wstecz();
                    }
                }
        );
        next.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dalej();
                    }
                }
        );
    }

    private void dalej(){
        if(licznik < 4){
            licznik++;
            imageView.setImageResource(obrazki.get(licznik));
        }

    }
    private void wstecz(){

        if(licznik > 0 ){
            licznik--;
            imageView.setImageResource(obrazki.get(licznik));
        }

    }
}
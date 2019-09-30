package com.example.muakiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);


        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("red", "weṭeṭṭi",R.drawable.color_red,R.raw.family_father));
        words.add(new Word("green", "chokokki",R.drawable.color_green,R.raw.family_father));
        words.add(new Word("brown", "ṭakaakki",R.drawable.color_brown,R.raw.family_father));
        words.add(new Word("gray", "ṭopoppi",R.drawable.color_gray,R.raw.family_father));
        words.add(new Word("black", "kululli",R.drawable.color_black,R.raw.family_father));
        words.add(new Word("white", "kelelli",R.drawable.color_white,R.raw.family_father));
        words.add(new Word("dusty yellow", "ṭopiisә",R.drawable.color_dusty_yellow,R.raw.family_father));
        words.add(new Word("mustard yellow", "chiwiiṭә",R.drawable.color_mustard_yellow,R.raw.family_father));


        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);


    }


}

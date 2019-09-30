package com.example.muakiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);


        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Where are you going?", "minto wuksus",R.raw.family_father));
        words.add(new Word("What is your name?", "tinnә oyaase'nә",R.raw.family_father));
        words.add(new Word("My name is...", "oyaaset...",R.raw.family_father));
        words.add(new Word("How are you feeling?", "michәksәs?",R.raw.family_father));
        words.add(new Word("I’m feeling good.", "kuchi achit",R.raw.family_father));
        words.add(new Word("Are you coming?", "әәnәs'aa?",R.raw.family_father));
        words.add(new Word("Yes, I’m coming.", "hәә’ әәnәm",R.raw.family_father));
        words.add(new Word("I’m coming.", "әәnәm",R.raw.family_father));
        words.add(new Word("Let’s go.", "yoowutis",R.raw.family_father));
        words.add(new Word("Come here.", "әnni'nem",R.raw.family_father));


        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);


    }
}

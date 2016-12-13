package com.example.user.wordcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by user on 13/12/2016.
 */
public class App extends AppCompatActivity {
    EditText sentenceEditText; //instance variable
    Button countButton; //instance variable
    TextView displayCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        sentenceEditText = (EditText)findViewById(R.id.sentence_text);
        countButton = (Button) findViewById(R.id.count_button);
        displayCount = (TextView) findViewById(R.id.display_count);

    //  Copy and paste this instance creator
    //setONclicklistener wants to take in an object and know the object has an onClick behaviour, view.onclicklistener is an interface! SO when you say new that's a new class with that interface!

    countButton.setOnClickListener(new View.OnClickListener() {


        @Override
        public void onClick(View view) {
        //QuestionAnswerText is a special class of string that can be edited
        String textPassage = sentenceEditText.getText().toString();
        WordCounter wordcounter = new WordCounter();
        int wordcount = wordcounter.getNumberOfWords(textPassage);
        displayCount.setText("There are " + wordcount);
        }
    });
}
}
package com.example.user.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by user on 13/12/2016.
 */

public class WordCounter {

    //Constructor 1
    public WordCounter()    {
    }

    ///////////////////////

    public int getNumberOfWords(String text) {
        String[] textarray = text.split(" ");
        System.out.println("The number of words is: " + textarray.length);
        return textarray.length;
    }

}

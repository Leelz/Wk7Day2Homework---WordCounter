package com.example.user.wordcounter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 13/12/2016.
 */
public class WordCounterTest {

    @Test
    public void getLength(){
        WordCounter wordCounter = new WordCounter();
        int value = wordCounter.getNumberOfWords("Hello I am a string");
        assertEquals(5, value);
    }

}

package edu.macalester.comp124.stringtransformer;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ScramblerTransformerTest {

    private final StringTransformer scrambler = new ScramblerTransformer();

    @Test
    public void scramblesWord() {
        assertEquals(2, characterCount("Football", 'o'));

    }


    private int characterCount(String s, char c) {
        int countCharacter = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == c) {
                countCharacter++;
            }
        }
        return countCharacter;
    }
}

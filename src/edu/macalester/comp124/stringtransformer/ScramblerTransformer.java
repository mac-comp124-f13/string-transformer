package edu.macalester.comp124.stringtransformer;

import java.util.Random;

import edu.macalester.comp124.stringtransformer.StringTransformer;


public class ScramblerTransformer extends StringTransformer {
    public String transform(String s) {
        String scrambledWord = "";
        for (int i = 0; i <= s.length() - 1; i++) {
            int m = randomIndex();
            char ch = s.charAt(m);
            String s1 = scrambledWord.substring(0, m);
            String s2 = scrambledWord.substring(m + 1);
            scrambledWord = s1 + ch + s2;
        }
        return scrambledWord;
    }

    public String toString() {
        return "Word scrambled";
    }

    private int randomIndex() {
        Random rand = new Random();
        String word = "";
        int index = rand.nextInt(word.length());
        return index;
    }
}

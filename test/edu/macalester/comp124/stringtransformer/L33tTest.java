package edu.macalester.comp124.stringtransformer;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: Christopher
 * Date: 10/1/13
 * Time: 10:31 AM
 * To change this template use File | Settings | File Templates.
 */
public class L33tTest {
    private final StringTransformer L33tSp34k = new L33t();

    @Test
    public void handlesEmptyString() {
        assertEquals("", L33tSp34k.transform(""));
    }
    @Test
    public void replacesVowels() {
        assertEquals("4",L33tSp34k.transform("a"));
        assertEquals("1",L33tSp34k.transform("I"));
        assertEquals("3",L33tSp34k.transform("e"));
        assertEquals("0",L33tSp34k.transform("O"));
    }
}

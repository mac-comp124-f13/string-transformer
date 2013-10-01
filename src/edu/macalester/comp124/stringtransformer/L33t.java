package edu.macalester.comp124.stringtransformer;

/**
 * Created with IntelliJ IDEA.
 * User: Christopher
 * Date: 10/1/13
 * Time: 10:26 AM
 * To change this template use File | Settings | File Templates.
 */
public class L33t extends StringTransformer {
    @Override
    public String transform(String s) {
        s = s.toUpperCase();
        s = s.replace("A","4");
        s = s.replace("E","3");
        s = s.replace("O","0");
        s = s.replace("I","1");
        return s;
    }

    @Override
    public String toString() {
        return "L33tSp34k";
    }
}

package org.mengtian;

public class StubRandomDigitGenerator implements RandomDigitGeneratorInterface {
    private final char[] fakeReturnChars;
    private int counter = 0;


    public StubRandomDigitGenerator(String fakeInput) {
        fakeReturnChars = fakeInput.toCharArray();
    }

    public char next() {
        return fakeReturnChars[counter++];
    }

    public char generate() {
        return next();
    }
}

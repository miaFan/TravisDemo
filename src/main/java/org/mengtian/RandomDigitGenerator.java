package org.mengtian;

import java.util.Random;

public class RandomDigitGenerator implements RandomDigitGeneratorInterface {
    public char generate() {
        int max = 9;
        int min = 1;
        Random random = new Random();
        return (char)(random.nextInt(max - min + 1) + min);
    }
}

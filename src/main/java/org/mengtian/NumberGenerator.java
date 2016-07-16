package org.mengtian;

public class NumberGenerator {
    private RandomDigitGeneratorInterface randomDigitGenerator;

    public NumberGenerator(RandomDigitGeneratorInterface randomDigitGenerator) {
        this.randomDigitGenerator = randomDigitGenerator;
    }

    public String generate() {
        String generatedNumber = "";
        int i = 0;
        while (true) {
            char generatedChar = randomDigitGenerator.generate();
            if (generatedNumber.indexOf(generatedChar) >= 0) {
                continue;

            } else {
                generatedNumber += generatedChar;
                i++;
            }

            if(i == 4) {
                break;
            }
        }
        return generatedNumber;
    }
}

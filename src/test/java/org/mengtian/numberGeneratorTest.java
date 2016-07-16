package org.mengtian;

import junit.framework.Assert;
import org.junit.Test;

public class numberGeneratorTest {
    @Test
    public void should_return_four_digits_number() {
        RandomDigitGenerator randomDigitGenerator = new RandomDigitGenerator();
        NumberGenerator numberGenerator = new NumberGenerator(randomDigitGenerator);
        String generatedNumber = numberGenerator.generate();

        Assert.assertEquals(4, generatedNumber.length());
    }

    @Test
    public void should_skip_repeated_digit() {
        StubRandomDigitGenerator stubRandomDigitGenerator = new StubRandomDigitGenerator("21234");
        NumberGenerator numberGenerator = new NumberGenerator(stubRandomDigitGenerator);
        String generatedNumber = numberGenerator.generate();

        Assert.assertEquals("2134", generatedNumber);
    }
}

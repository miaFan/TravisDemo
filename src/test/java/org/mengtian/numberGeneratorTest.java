package org.mengtian;

import junit.framework.Assert;
import org.junit.Test;

public class numberGeneratorTest {
    @Test
    public void should_generate_four_different_digits() {
        StubRandomDigitGenerator stubRandomDigitGenerator = new StubRandomDigitGenerator("21234");
        NumberGenerator numberGenerator = new NumberGenerator(stubRandomDigitGenerator);
        String generatedNumber = numberGenerator.generate();

        Assert.assertEquals("2134", generatedNumber);
    }
}

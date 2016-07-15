package org.mengtian;

import junit.framework.Assert;
import org.junit.Test;

public class numberGeneratorTest {
    @Test
    public void should_generate_four_different_digits() {
        NumberGenerator numberGenerator = new NumberGenerator();
        String generatedNumber = numberGenerator.generate();

        Assert.assertEquals("1234", generatedNumber);
    }
}

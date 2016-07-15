package org.mengtian;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;


public class numberComparerTest {
    @Test
    public void should_return_0A0B_when_comparing_1234_and_5678() {
        NumberComparer numberComparer = new NumberComparer();
        String comparisonResult = numberComparer.compare("1234", "5678");

        assertEquals("0A0B", comparisonResult);
    }

    @Test
    public void should_return_4A0B_when_comparing_1234_and_1234() {
        NumberComparer numberComparer = new NumberComparer();
        String comparisonResult = numberComparer.compare("1234", "1234");

        assertEquals("4A0B", comparisonResult);
    }


    @Test
    public void should_return_1A0B_when_comparing_1234_and_1567() {
        NumberComparer numberComparer = new NumberComparer();
        String comparisonResult = numberComparer.compare("1234", "1567");

        assertEquals("1A0B", comparisonResult);
    }

    @Test
    public void should_return_0A1B_when_comparing_1234_and_5167() {
        NumberComparer numberComparer = new NumberComparer();
        String comparisonResult = numberComparer.compare("1234", "5167");

        assertEquals("0A1B", comparisonResult);
    }

    @Test
    public void should_return_0A1B_when_comparing_3214_and_1342() {
        NumberComparer numberComparer = new NumberComparer();
        String comparisonResult = numberComparer.compare("3214", "1342");

        assertEquals("0A4B", comparisonResult);
    }

    @Test
    public void should_return_0A1B_when_comparing_3214_and_1564() {
        NumberComparer numberComparer = new NumberComparer();
        String comparisonResult = numberComparer.compare("3214", "1564");

        assertEquals("1A1B", comparisonResult);
    }

}
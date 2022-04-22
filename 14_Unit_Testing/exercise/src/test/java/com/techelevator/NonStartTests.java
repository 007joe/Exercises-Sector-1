package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class NonStartTests {

    @Test
    public void cut_first_character_of_string() {
        NonStart omitChar = new NonStart();
        Assert.assertEquals("ellohere", omitChar.getPartialString("Hello", "There"));
        Assert.assertEquals("avaode", omitChar.getPartialString("java", "code"));
        Assert.assertEquals("hotlava", omitChar.getPartialString("shotl", "java"));



    }
}

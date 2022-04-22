package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class FrontTimesTests {

    @Test
    public void does_first_3_repeat() {
        FrontTimes threeChar = new FrontTimes();

        Assert.assertEquals("ChoCho", threeChar.generateString("Chocolate", 2));

        Assert.assertEquals("ChoChoCho", threeChar.generateString("Chocolate", 3));


        Assert.assertEquals("AbcAbcAbc", threeChar.generateString("Abc", 3));


    }

}

package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class Lucky13Tests {
    Lucky13 fourLeaf = new Lucky13();

    @Test
    public void contains_no_1_or_3() {
       boolean luckNums = fourLeaf.getLucky(new int[] {0, 2, 4});
       Assert.assertTrue(luckNums);

    }
    @Test
    public void contains_1_or_3() {
        boolean luckNums = fourLeaf.getLucky(new int[] {1, 2, 3});

        Assert.assertFalse(luckNums);
    }


}

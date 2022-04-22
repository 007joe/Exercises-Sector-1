package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class Less20Tests {
Less20 modNum = new Less20();
    @Test
    public void is_num_one_less_than_20() {

        Assert.assertTrue(modNum.isLessThanMultipleOf20(19));
    }

    @Test
    public void is_num_two_less_than_20() {
        Assert.assertTrue(modNum.isLessThanMultipleOf20(18));
    }

@Test
public void is_num_not_1_or_2_less_than_20() {
    Assert.assertFalse(modNum.isLessThanMultipleOf20(20));;
}
}

package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class MaxEnd3Tests {
    MaxEnd3 biggerNum = new MaxEnd3();

    @Test
    public void which_is_larger_between_elements() {
      int[] numbers = biggerNum.makeArray(new int[] { 1, 2, 3});
    Assert.assertArrayEquals(new int[] {3, 3, 3,}, numbers);

    }
}

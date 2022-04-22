package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class SameFirstLastTests {

    @Test
    public void is_first_element_same_as_last_element() {
        SameFirstLast testElement = new SameFirstLast();

        boolean intNumbers = testElement.isItTheSame(new int[] {1, 2, 3, 1});

        Assert.assertTrue(intNumbers);
    }

    @Test
    public void is_first_element_different_than_last_element() {
        SameFirstLast testElement = new SameFirstLast();

        boolean intNumbers = testElement.isItTheSame(new int[] {1,2,3});

        Assert.assertFalse(intNumbers);

    }
}

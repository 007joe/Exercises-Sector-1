package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class DateFashionTests {

    @Test
    public void is_your_date_stylish() {

        DateFashion stylish = new DateFashion();

        Assert.assertEquals(stylish.getATable(5, 10), 2);
        Assert.assertEquals(stylish.getATable(5, 2), 0);
        Assert.assertEquals(stylish.getATable(5, 5), 1);
    }
}

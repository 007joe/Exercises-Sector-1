package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class AnimalGroupNameTests {

    @Test
    public void return_group_of_animal_name() {
        AnimalGroupName packName = new AnimalGroupName();

        Assert.assertEquals(packName.getHerd("Rhino"), "Crash");
        Assert.assertEquals(packName.getHerd("Elephant"), "Herd");
        Assert.assertEquals(packName.getHerd("Lion"), "Pride");
        Assert.assertEquals(packName.getHerd("Crow"), "Murder");
        Assert.assertEquals(packName.getHerd("Pigeon"), "Kit");
        Assert.assertEquals(packName.getHerd("Flamingo"), "Pat");
        Assert.assertEquals(packName.getHerd("Deer"), "Herd");
        Assert.assertEquals(packName.getHerd("Dog"), "Pack");
        Assert.assertEquals(packName.getHerd("Crocodile"), "Float");
        Assert.assertEquals(packName.getHerd(" "), "unknown");
        Assert.assertEquals(packName.getHerd("walrus"), "unknown");
        Assert.assertEquals(packName.getHerd("elephants"), "unknown");

    }
}

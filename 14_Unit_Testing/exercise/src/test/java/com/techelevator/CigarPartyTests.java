package com.techelevator;
import org.junit.Assert;
import org.junit.Test;
public class CigarPartyTests {

    @Test
    public void is_squirrel_party_successful_or_not () {
        CigarParty success = new CigarParty();

        Assert.assertEquals(success.haveParty(30, false), false);
        Assert.assertEquals(success.haveParty(50, false), true);
        Assert.assertEquals(success.haveParty(70, true), true);
    }
}

package com.techelevator;

import org.junit.*;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CalculatorTest {

    private Calculator calc;   //defining a variable of type 'Calculator'

    // THESE ARE OPTIONAL
    @Before
    public void setUpMyTests() {
        System.out.println("I am a BEFORE (setup ) method");
        calc = new Calculator();

        Assert.assertNotNull(calc);

    }




    @Test
    public void sampleJUNITTestThatDoesNothing() {

        // where I would call methods in the class I am testing
        System.out.println("I am test 1");
       // Assert.fail("You failed! YOu should probably do better next time. Try to suck less!");

    }

    @Test
    public void anotherSampleJUNITTestThatDoesNothing() {

        // where I would call methods in the class I am testing
        System.out.println("I am test 2");

    }

    @Test
    public void test_adding_two_integers() {

        //Act and Assert
        Assert.assertEquals(4,  calc.add(2,2));
        Assert.assertEquals(10,  calc.add(3,7));
        Assert.assertEquals(7,  calc.add(0,7));
        Assert.assertEquals(5,  calc.add(5,0));
        Assert.assertEquals(4,  calc.add(-1,5));
        Assert.assertEquals(-6,  calc.add(1,-7));

    }

    @Test
    public void is_A_greater_than_B() {

        Assert.assertTrue(calc.isAGreaterThanB(7, 3));
        Assert.assertFalse(calc.isAGreaterThanB(2, 7));
        Assert.assertFalse(calc.isAGreaterThanB(2, 2));

    }

    @Test
    public void test_fizzbuzz() {

        //test is divisible by 3 AND 5
        Assert.assertEquals("fizzbuzz", calc.fizzBuzz(15) );
        Assert.assertEquals("fizzbuzz", calc.fizzBuzz(30) );

        //test if divisible by 3
        Assert.assertEquals("fizz", calc.fizzBuzz(3) );
        Assert.assertEquals("fizz", calc.fizzBuzz(33) );

        //test if by 5
        Assert.assertEquals("buzz", calc.fizzBuzz(5) );
        Assert.assertEquals("buzz", calc.fizzBuzz(20) );

        //test none of the above
        Assert.assertEquals("2", calc.fizzBuzz(2) );

        Assert.assertEquals("fizzbuzz", calc.fizzBuzz(0) );

        Assert.assertEquals("-1", calc.fizzBuzz(-1) );


    }


    public void testWrappedNumberAddition() {

        //Arrange
        WrappedNumbers numbers = new WrappedNumbers(2, 4);

        //Act and Assert
        Result sumOf2And4 = calc.add(numbers);
        Assert.assertEquals(6, sumOf2And4.getResult());

      //  Assert.assertEquals(6, calc.add(numbers).getResult());

    }




    // THESE ARE OPTIONAL
    @After
    public void doSomethingAfterEachTest() {
        System.out.println("I am an AFTER method. Use me for cleanup if applicable");
    }




}

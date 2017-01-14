package collazo.albert.AliceAndBobGreetingTest;

import collazo.albert.AliceAndBobGreeting.AliceAndBobGreeting;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;




public class AliceAndBobGreetingTest {

    AliceAndBobGreeting aliceAndBobGreeting;

    @Before
    public void setUP(){
        aliceAndBobGreeting = new AliceAndBobGreeting();
    }

    @Test
    public void aliceOrBobTest(){
        String expected = "Hey, Alice!";
        String actual = aliceAndBobGreeting.aliceOrBob("Alice");
        Assert.assertEquals(actual, expected);
    }


}

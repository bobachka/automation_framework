package project.org.example.functional.tests;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class PracticalTask2506 {
    @Test
    public void test1() {
        System.out.println("This test passes");
    }

    @Test
    public void test2() {
        throw new SkipException("I'm skipping this test");
    }

    @Test
    public void test3() {
        System.out.println("This test fails");
        Assert.fail();
    }


}

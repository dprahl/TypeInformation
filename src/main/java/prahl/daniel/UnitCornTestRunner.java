package prahl.daniel;

/**
 * Created by danielprahl on 5/4/17.
 */

/*
    Part II: UnitCorn

    In this part you will begin building UnitCorn®: A Magical Testing Framework™. Create a UnitCornTestRunner class with two primary methods: runTest(Class c, String methodName) runs a particular test method in a class and returns a Result object, containing useful information on the success or failure of the test; runTests(Class c) takes a Class object, finds all methods declared in that class with the org.junit.Test annotation, passing those method names to runTest() and handling the result. runTests() should produce a String that is a pretty-printed report of the result of all tests run.

    You will have to create your own Result class to hold test results.
    Your test runner should recognize the difference between failed assertions and other exceptions that occur, and report them differently (this helps developers differentiate between broken tests and failed tests).
    Put your code in a UnitCorn package, eg: lastname.firstname.unitcorn
    Stretch goals: Handle @Before and @After properly to ensure tests run well.
 */

public class UnitCornTestRunner {

    public Result runTest(Class c, String methodName){

        //return new Result();
        return null;
    }

    public String runTests(Class c) {


        return null;
    }

}

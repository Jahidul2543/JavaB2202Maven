package calculatortest;


import calculator.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
    @Test
    public void addTest(){
        Calculator calculator = new Calculator();
        int expectedValue = 22;
        int actualValue = calculator.add(10, 10); // , Actual value

        Assert.assertEquals(actualValue, expectedValue);
//
//        // if expectedValue = actualValue -> Method is functional
//        // if expectedValue = actualValue -> Method is not functional
//
//        if (expectedValue == actualValue){
//            System.out.println("Add method is healthy!!!");
//            System.out.println("AddTest Passed");
//        }
//        else if(expectedValue != actualValue){
//            System.out.println("Add method is unhealthy");
//            System.out.println("AddTest Failed");
//        }

    }



}

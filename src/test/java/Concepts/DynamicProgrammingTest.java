package Concepts;

import static org.junit.jupiter.api.Assertions.*;

class DynamicProgrammingTest {

    public void recursiveFibTest(){

        DynamicProgramming dynamicProgramming = new DynamicProgramming();
        int fibNum;

        //bad data
        fibNum= dynamicProgramming.fibRecursive(-1);
        assertEquals(fibNum, -1);

        //good data
        fibNum = dynamicProgramming.fibRecursive(2);
        assertEquals(fibNum, 1);

    }

    public static void main(String[] args) {

        DynamicProgrammingTest testRunner = new DynamicProgrammingTest();
        testRunner.recursiveFibTest();
        System.out.println("ALL TESTS PASSED FOR DYNAMIC PROGRAMMING");

    }

}
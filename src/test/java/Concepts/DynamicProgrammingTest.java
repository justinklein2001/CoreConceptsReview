package Concepts;

import static org.junit.jupiter.api.Assertions.*;

class DynamicProgrammingTest {

    public void recursiveFibTest(){

        DynamicProgramming dynamicProgramming = new DynamicProgramming();
        int fibNum;

        //bad data
        fibNum= dynamicProgramming.fibRecursive(-1);
        assertEquals(fibNum, -1);
        fibNum= dynamicProgramming.fibRecursive(38);
        assertEquals(fibNum, -1);

        //good data
        fibNum = dynamicProgramming.fibRecursive(2);
        assertEquals(fibNum, 1);

    }

    public void memoizeFibTest(){

        DynamicProgramming dynamicProgramming = new DynamicProgramming();
        int fibNum;
        int[] cache = new int[3];

        //bad data
        fibNum= dynamicProgramming.fibMemoize(-1);
        assertEquals(fibNum, -1);
        fibNum= dynamicProgramming.fibRecursive(38);
        assertEquals(fibNum, -1);

        //good data
        fibNum = dynamicProgramming.fibMemoize(2);
        assertEquals(fibNum, 1);

    }

    public void tabulationFibTest(){

        DynamicProgramming dynamicProgramming = new DynamicProgramming();
        int fibNum;

        //bad data
        fibNum= dynamicProgramming.fibTabulation(-1);
        assertEquals(fibNum, -1);
        fibNum= dynamicProgramming.fibTabulation(37);
        assertEquals(fibNum, -1);

        //good data
        fibNum = dynamicProgramming.fibTabulation(2);
        assertEquals(fibNum, 1);

    }

    public static void callTests() {

        DynamicProgrammingTest testRunner = new DynamicProgrammingTest();
        testRunner.recursiveFibTest();
        testRunner.memoizeFibTest();
        testRunner.tabulationFibTest();
        System.out.println("ALL TESTS PASSED FOR DYNAMIC PROGRAMMING");

    }

}
package Concepts;

public class ConceptRunner {
    /**
     * Program: ConceptRunner.java
     * Author: Justin Klein
     * Last Updated: Janurary 16th 2022
     * Description: Main driver class to run all concept classes via the CLI
     */
    public static void main(String[] args) {

        /**
         * Dynamic Programming Calls
         */
        DynamicProgramming dynamicProgramming = new DynamicProgramming();
        int fibNum;

        //recursive solution
        fibNum = dynamicProgramming.fibRecursive(5);
        System.out.println("Fibonacci number of [5] using recursive strategy: ["+fibNum+"]");

        //memoize solution
        fibNum= dynamicProgramming.fibMemoize(5);
        System.out.println("Fibonacci number of [5] using memoize strategy: ["+fibNum+"]");

        //memoize solution
        fibNum= dynamicProgramming.fibTabulation(5);
        System.out.println("Fibonacci number of [5] using tabulation strategy: ["+fibNum+"]");
    }
}

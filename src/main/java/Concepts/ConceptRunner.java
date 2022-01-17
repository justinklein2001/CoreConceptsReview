package Concepts;

public class ConceptRunner {
    /**
     * Program: ConceptRunner.java
     * Author: Justin Klein
     * Last Updated: Janurary 16th 2022
     * Description: Main driver class to run all concept classes via the CLI
     */
    public static void main(String[] args) {

        //Dynamic Programming
        DynamicProgramming dynamicProgramming = new DynamicProgramming();
        int fibNum;

        //recursive solution
        fibNum = dynamicProgramming.fibRecursive(5);
        System.out.println("Fibonacci number of 5 using recursive strategy:"+fibNum);
    }
}

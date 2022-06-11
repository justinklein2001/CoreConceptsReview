package Concepts;

public class ConceptRunner {
    /**
     * Program: ConceptRunner.java
     * Author: Justin Klein
     * Last Updated: May 21st 2022
     * Description: Main driver class to run all concept classes via the CLI
     */
    public static void main(String[] args) {

        /**
         * Dynamic Programming Call
         */
        DynamicProgramming dynamicProgramming = new DynamicProgramming();
        dynamicProgramming.callDynamicProgramming();

        /**
         * Bit Manipulation Call
         */
        BitManipulation bitManipulation = new BitManipulation();
        bitManipulation.callBitManipulation();
    }
}

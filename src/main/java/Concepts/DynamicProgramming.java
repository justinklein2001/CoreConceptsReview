package Concepts;

public class DynamicProgramming {

    /**
     * Program: DynamicProgramming.java
     * Author: Justin Klein
     * Last Updated: Janurary 16th 2022
     * Description: Practice dynamic programming techniques to solve the nth number in the fibonacci sequence,
     * includes solving it recursively, using Memoize & Tabulation
    */

    /**
     * Solution #1: using recursion to find the solution
     * Time Complexity: recursion through two branches results in a T(n) = n^2 (inefficent)
     */
    public static int fibRecursive(int n){
        //uncomment to show each step
        //System.out.println("current level:"+n);
        //error checking
        if (n <= 0){
            return -1;
        }
        //if it's the first or second element, it is equal to 1, comes from
        //the understanding of the fibonacci sequence
        if (n == 1 || n == 2){
            return 1;
        }

        //return the previous summation of the previous two entries
        return (fibRecursive(n-1) + fibRecursive(n-2));
    }

    /**
     * Solution #2: using memoize to find the solution, caches a solution if it already found it
     * Time Complexity: caching results in every member of the tree only being touched once, therefore in a T(n) = 2n = n (efficent)
     */
    public static int fibMemoize (int n, int[] cache){
       //error check
        if (n <= 0){
           return -1;
        }

        //checking base case
        if (n == 1 || n == 2){
            return 1;
        }
        //if this level has not yet been cached, use recursion to find
        //corresponding fibonacci number and cache it
        if (cache[n] == 0){
            cache[n]= fibMemoize(n-1, cache) +fibMemoize(n-2, cache);
        }
        //now the cache must be there, return it
        return cache[n];
    }

}

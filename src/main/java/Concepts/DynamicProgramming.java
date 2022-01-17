package Concepts;

public class DynamicProgramming {

    /**
     * Program: DynamicProgramming.java
     * Author: Justin Klein
     * Last Updated: January 16th 2022
     * Description: Practice dynamic programming techniques to solve the nth number in the fibonacci sequence,
     * includes solving it recursively, using Memoize & Tabulation
     * Assumptions: cannot go pass the 36th fibonacci number due to overflow
    */

    /**
     * Solution #1: using recursion to find the solution
     * Time Complexity: recursion through two branches results in a T(n) = n^2 (inefficent)
     */
    public static int fibRecursive(int n){
        //uncomment to show each step
        //System.out.println("current level:"+n);
        //error checking
        if (n <= 0 || n > 36){
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
     * Time Complexity: caching results in every member of the tree only being touched once, therefore in a T(n)= n (efficent)
     */
    public static int fibMemoize (int n){
        int[] cache = new int[n+1];
        return fibMemoize(n, cache); //recursive call in driver function
    }

    public static int fibMemoize (int n, int[] cache){
       //error check
        if (n <= 0 || n > 36){
           return -1;
        }

        //checking base case
        //inits the cache
        if (n == 1 || n == 2){
            cache[n]=1;
            return cache[n];
        }
        //if this level has not yet been cached, use recursion to find
        //corresponding fibonacci number and cache it
        //fills up the cache
        if (cache[n] == 0){
            cache[n]= fibMemoize(n-1, cache) +fibMemoize(n-2, cache);
        }
        //now the cache must be there, return it
        return cache[n];
    }

    /**
     * Solution #3: using tabulation to find the solution, builds up an array of size n of the fibonacci sequence
     * Time Complexity: caching results in every member of the tree only being touched once, therefore in a T(n)= n (efficent)
     */
    public static int fibTabulation(int n){
        //error check
        if (n <= 0 || n > 36){
            return -1;
        }

        //base cases, avoid some work
        if (n==1 || n==2){
            return 1;
        }
        //init array to hold values
        int[] fib = new int[n+1];
        //we already know the first two cases
        fib[1]=1;
        fib[2]=1;
        for (int i=3; i <=n; i++){
            fib[i] = fib[i-1]+fib[i-2];
        }
        return fib[n];
    }

}

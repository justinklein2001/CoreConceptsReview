package Concepts;

public class BitManipulation {
    /**
     * Program: BitManipulation.java
     * Author: Justin Klein
     * Last Updated: May 21st 2022
     * Description: Implement basic bit manipulation tactics to get a deeper grasp of bit masking, shifting and implementation using bits
     */

    /** Shifts an integer one bit to the right, maintaining it's signed value, imperative to use this implementation when
     * dealing with negative integers
     */
    public static int signedRightShift (int bit) {
        return (bit >> 1);
    }

    public static int unsignedRightShift (int bit){
        return (bit >>> 1);
    }

    /** Logic:
     *  bit = 00101010 --> get 2nd bit, which is a 1
     *  Desired output: 00000010
     *  if we & the number with a 1 at the desired position,
     *  we get the specific bit we need (see handwritten notes)
     *  Returns: Returns the desired bit in base 10 form
     */
    public static int getBit (int bit, int count){
        return (bit & (1 << count));
    }
    /** Sets the desired bit to 1 by performing an OR with 1
     */
    public static int setBit (int bit, int count){
        return (bit | (1 << count));
    }

    /** Clears the desired bit by AND the negated value at that bit*/
    public static int clearBit (int bit, int count){
        return (bit & (~(1 << count)));
    }

    /** Clears all bits from 0  to the position designed, plus one on the count for proper shift, and
     * shifting -1 is equivalent to have all 1s in your bit (11111111)
     */
    public static int clearBitCountTo0(int bit, int count){
        return (bit & (-1 << (count+1)));
    }

    /** Updates bit at given position, first mask gets you a bit with a 0 set in the count position and everything
     *  else set to 1 (11110111). then if you & this mask with the number, it would clear the bit at that position,
     *  exactly like clearBit*(). If you OR this statement with a rather given 1 or 0 in that position, you've effectively updated
     *  the bit*/
    public static int updateBit(int bit, int count, boolean bitIs1){
        int value = bitIs1 ? 1 : 0;
        int mask = ~(1 << count);
        return ((bit & mask) | (value << count));
    }
    public void callBitManipulation(){
        System.out.println("[-23] signed shift [>>] becomes : ["+signedRightShift(-23)+"]");
        System.out.println("[-23] unsigned shift [>>>] becomes : ["+unsignedRightShift(-23)+"]");
        System.out.println("[23] signed shift [>>] becomes : ["+signedRightShift(23)+"]");
        System.out.println("[23] unsigned shift [>>>] becomes : ["+unsignedRightShift(23)+"]");
        System.out.println("get 0 bit from [10] : ["+getBit(10,0)+"]");
        System.out.println("get 1st bit from [10] : ["+getBit(10,1)+"]");
        System.out.println("get 3rd bit from [10] : ["+getBit(10,3)+"]");
        System.out.println("set 0 bit from [10], becomes : ["+setBit(10,0)+"]");
        System.out.println("[10] before clearing 1st bit with value of: ["+getBit(10,1)+"], becomes : ["+clearBit(10,1)+"]");
        System.out.println("[10] before clearing up to 3rd bit becomes : ["+clearBitCountTo0(10,3)+"]");
        System.out.println("[10] updating the 3rd bit to 0, 10 becomes : ["+updateBit(10,3, false)+"]");
    }
}

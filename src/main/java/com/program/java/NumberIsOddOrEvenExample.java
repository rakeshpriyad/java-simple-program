package com.program.java;
/**
 * We will convert our decimal number into binary, binary number consists of only 0 and 1's ,
if its last digit is 1, then number is EVEN in java.
if its last digit is 0, then number is ODD in java.
 * @author aayushraj
 *
 */
public class NumberIsOddOrEvenExample {
    public static void main(String[] args) {
           
           int number=53;
           
           if((number&1) ==0)
                  System.out.println(number+" is EVEN");
           else
                  System.out.println(number+" is ODD");
    }
}
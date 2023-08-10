package codewars8kyu;

// https://www.codewars.com/kata/53dc54212259ed3d4f00071c
// Sum Arrays

/*
* Write a function that takes an array of numbers and returns the sum of the numbers.
* The numbers can be negative or non-integer.
* If the array does not contain any numbers then you should return 0.
*
* Examples)
* Input: [1, 5.2, 4, 0, -1] > Output: 9.2
* Input: []                 > Output: 0
* Input: [-2.398]           > Output: -2.398
* */

public class SumArray {

    public static double sum(double[] numbers) {
        double sum = 0.0;

        for(double number: numbers) sum += number;
        if(numbers.length == 0) sum = 0;

        return sum;
    }
}

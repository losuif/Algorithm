package codewars8kyu;

/*
* Find the smallest integer.
*
* For example:
* [34, 15, 88, 2]       ===> return 2
* [34, -345, -1, 100]   ===> return -345
* */

import java.util.Arrays;

public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
        Arrays.sort(args);
        return args[0];
    }
}

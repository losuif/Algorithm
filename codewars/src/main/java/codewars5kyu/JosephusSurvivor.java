package codewars5kyu;

// https://www.codewars.com/kata/555624b601231dc7a400017a/java
// Josephus Survivor

/* ****
    In this kata you have to correctly return who is the "survivor", ie: the last element of a Josephus permutation.
    Basically you have to assume that n people are put into a circle
        and that they are eliminated in steps of k elements, like this:

        n=7, k=3 => means 7 people in a circle
        one every 3 is eliminated until one remains
        [1,2,3,4,5,6,7] - initial sequence
        [1,2,4,5,6,7] => 3 is counted out
        [1,2,4,5,7] => 6 is counted out
        [1,4,5,7] => 2 is counted out
        [1,4,5] => 7 is counted out
        [1,4] => 5 is counted out
        [4] => 1 counted out, 4 is the last element - the survivor!
**** */

import java.util.ArrayList;
import java.util.List;

public class JosephusSurvivor {

    public static int josephusSurvivor(final int n, final int k) {

        int idx = -1;

        List<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        while (list.size() > 1) {
            idx = (k + idx) % list.size();
            list.remove(idx);
            idx -= 1;
        }

        return list.remove(0);
    }
}

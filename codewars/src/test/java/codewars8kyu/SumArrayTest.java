package codewars8kyu;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class SumArrayTest {

    @Test
    public void testSum() {
        assertEquals(0, SumArray.sum(new double[] { }), 1e-4);
        assertEquals(-2.398, SumArray.sum(new double[] {-2.398}), 1e-4);
        assertEquals(6, SumArray.sum(new double[] {1, 2, 3}), 1e-4);
        assertEquals(6.6, SumArray.sum(new double[] {1.1, 2.2, 3.3}), 1e-4);
        assertEquals(9.2, SumArray.sum(new double[]{1, 5.2, 4, 0, -1}), 1e-4);
        assertEquals(320, SumArray.sum(new double[]{30, 89, 100, 101}), 1e-4);
    }

    @Test
    public void testRandom() {

        Random rnd = new Random();
        List<double[]> testCases = new ArrayList<double[]>();

        //edge case: empty array
        testCases.add(new double[0]);

        //a couple of one element arrays
        rnd.doubles(5, -1000, -1).forEach(d -> testCases.add(new double[]{ d }));
        rnd.doubles(5, 1, 1000).forEach(d -> testCases.add(new double[]{ d }));

        for(int i = 0; i<40; ++i) {
            testCases.add(rnd.doubles(rnd.nextInt(50), 0.0, 1000.0).toArray());
            testCases.add(rnd.doubles(rnd.nextInt(50), -1000.0, 1000.0).toArray());
        }

        Collections.shuffle(testCases);

        for(double[] testCase : testCases) {
            double expected = Arrays.stream(testCase).sum();
            double actual = SumArray.sum(testCase);
            assertEquals(expected, actual, 1e-4);
        }
    }
}
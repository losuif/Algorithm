package codewars5kyu;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class JosephusSurvivorTest {
    private static int NUM_RANDOM_TESTS = 40;
    private static int MAX_N = 5000;
    private static int MAX_K = 5000;

    private Random random = new Random();

    @Test
    public void test1() {
        josephusTest(7, 3, 4);
    }

    @Test
    public void test2() {
        josephusTest(11, 19, 10);
    }

    @Test
    public void test3() {
        josephusTest(40, 3, 28);
    }

    @Test
    public void test4() {
        josephusTest(14, 2, 13);
    }

    @Test
    public void test5() {
        josephusTest(100, 1, 100);
    }

    @Test
    public void test6() {
        josephusTest(1, 300, 1);
    }

    @Test
    public void test7() {
        josephusTest(2, 300, 1);
    }

    @Test
    public void test8() {
        josephusTest(5, 300, 1);
    }

    @Test
    public void test9() {
        josephusTest(7, 300, 7);
    }

    @Test
    public void test10() {
        josephusTest(300, 300, 265);
    }

    @Test
    public void randomTests() {
        for(int i = 0; i < NUM_RANDOM_TESTS; i++) {
            int n = random.nextInt(MAX_N);
            int k = random.nextInt(MAX_K - 1) + 1;
            josephusTest(n, k, solution(n, k));
        }
    }

    private void josephusTest(final int n, final int k, final int result) {
        String testDescription = String.format("Testing where n = %d and k = %d", n, k);
        assertEquals(testDescription, result, JosephusSurvivor.josephusSurvivor(n, k));
    }

    private void assertEquals(String testDescription, int result, int josephusSurvivor) {
    }

    private int solution(final int n, final int k) {
        int result = 1;
        for(int i = 2; i < n + 1; i++) {
            result = ((result + k - 1) % i) + 1;
        }
        return result;
    }

}
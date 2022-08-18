package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void test1() {
        int[] output = Main.twoNumberSumNested(new int[] {3, 5, -4, 8, 11, 1, -1, 6}, 10);
        assertEquals(2, output.length);
        assertTrue(contains(output, -1));
        assertTrue(contains(output, 11));
    }

    @Test
    void test2() {
        int[] output = Main.twoNumberSumNested(new int[] {4, 6}, 10);
        assertEquals(2, output.length);
        assertTrue(contains(output, 4));
        assertTrue(contains(output, 6));
    }

    @Test
    void test3() {
        int[] output = Main.twoNumberSumNested(new int[] {4, 6, 1}, 5);
        assertEquals(2, output.length);
        assertTrue(contains(output, 4));
        assertTrue(contains(output, 1));
    }

    @Test
    void test4() {
        int[] output = Main.twoNumberSumNested(new int[] {4, 6, 1, -3}, 3);
        assertEquals(2, output.length);
        assertTrue(contains(output, 6));
        assertTrue(contains(output, -3));
    }

    @Test
    void test5() {
        int[] output = Main.twoNumberSumNested(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9}, 17);
        assertEquals(2, output.length);
        assertTrue(contains(output, 8));
        assertTrue(contains(output, 9));
    }

    @Test
    void test6() {
        int[] output = Main.twoNumberSumNested(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 15}, 18);
        assertEquals(2, output.length);
        assertTrue(contains(output, 3));
        assertTrue(contains(output, 15));
    }

    @Test
    void test7() {
        int[] output = Main.twoNumberSumNested(new int[] {-7, -5, -3, -1, 0, 1, 3, 5, 7}, -5);
        assertEquals(2, output.length);
        assertTrue(contains(output, -5));
        assertTrue(contains(output, 0));
    }

    @Test
    void test8() {
        int[] output = Main.twoNumberSumNested(new int[] {-21, 301, 12, 4, 65, 56, 210, 356, 9, -47}, 163);
        assertEquals(2, output.length);
        assertTrue(contains(output, 210));
        assertTrue(contains(output, -47));
    }

    @Test
    void test9() {
        int[] output = Main.twoNumberSumNested(new int[] {-21, 301, 12, 4, 65, 56, 210, 356, 9, -47}, 164);
        assertEquals(0, output.length);
    }

    @Test
    void test10() {
        int[] output = Main.twoNumberSumNested(new int[] {3, 5, -4, 8, 11, 1, -1, 6}, 15);
        assertEquals(0, output.length);
    }

    @Test
    void test11() {
        int[] output = Main.twoNumberSumNested(new int[] {14}, 15);
        assertEquals(0, output.length);
    }

    @Test
    void test12() {
        int[] output = Main.twoNumberSumNested(new int[] {15}, 15);
        assertEquals(0, output.length);
    }

    public boolean contains(int[] output, int value) {
        for(var element : output) {
            if(element == value) {
                return true;
            }
        }
        return false;
    }
}
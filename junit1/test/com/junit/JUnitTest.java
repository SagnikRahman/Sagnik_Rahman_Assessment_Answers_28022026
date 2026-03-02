package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnitTest {

	@Test
    void test1() {
        Junit j = new Junit();
        int expected = 10;
        int actual = j.add(5, 5);
        assertEquals(expected, actual);
    }

    @Test
    void test2() {
        Junit j = new Junit();
        int expected = 15;
        int actual = j.add(10, 5);
        assertEquals(expected, actual);
    }

    @Test
    void test3() {
        Junit j = new Junit();
        int expected = -25;
        int actual = j.mul(-5, 5);
        assertEquals(expected, actual);
    }
    
    @Test
    void test4() {
        Junit j = new Junit();
        int expected = 17;
        int actual = j.mul(7, 2);
        assertEquals(expected, actual);
    }
}

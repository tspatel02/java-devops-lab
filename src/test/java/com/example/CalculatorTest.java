package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    public void testAdd(){
        assertEquals(5, calc.add(2,3));
    }

    @Test
    public void testSubtract(){
        assertEquals(2, calc.subtract(5,3));
    }
}
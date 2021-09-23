package it.uom.cse;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class MathOperationTest {

    @Test
    void add() {
        assertEquals(MathOperation.add(1, 1), 2);
    }

    @Test
    void subtract() {
        assertEquals(MathOperation.subtract(2, 1), 1);
    }

    @Test
    void fibonacci(){
        assertEquals(MathOperation.fib(12), 144);
    }
}
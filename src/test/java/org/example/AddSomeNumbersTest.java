package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddSomeNumbersTest {

    int addTwoNumbers() {
        AddSomeNumbers addSomeNumbers = new AddSomeNumbers();
        int result = addSomeNumbers.addTwoNumbers(50, 30);
        assertEquals(80, result);
        return result;
    }

    @Test
    void shouldPrintSumToConsole() {
        AddSomeNumbers.main(new String[] {});
        assertEquals(addTwoNumbers(), 80);
    }

}

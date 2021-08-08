package com.example;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AppTest 
{
    @Test
    public void testInputIsEven()
    {
        assertTrue(App.checkIfInputIsAnEvenNumber(22));
    }
}

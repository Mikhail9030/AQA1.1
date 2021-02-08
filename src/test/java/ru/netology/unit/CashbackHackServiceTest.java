package ru.netology.unit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void shouldReturn10IfAmountIs2000 () {

        CashbackHackService CashbackHackService = new CashbackHackService();
        int Amount = 1000;

        int actual = CashbackHackService.C(amount);
        int expected =10;

        assertEquals(expected,actual);
    }
}
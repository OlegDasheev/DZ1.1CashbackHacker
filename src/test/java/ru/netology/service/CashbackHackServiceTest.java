package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {
    @Test
    public void shouldAskToAdd100() {
        int amount = 900;
        CashbackHackService service = new CashbackHackService();
        int expected = service.remain(amount);

        Assert.assertEquals(expected, 100);
    }

    @Test
    public void shouldNotAskToAdd() {
        int amount = 1000;
        CashbackHackService service = new CashbackHackService();
        int expected = service.remain(amount);

        Assert.assertEquals(expected, 0);

    }
}
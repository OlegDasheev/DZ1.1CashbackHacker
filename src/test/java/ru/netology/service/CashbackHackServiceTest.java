package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {
    @Test
    public void shouldAskToAdd100() {
        int amount = 900;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);

        Assert.assertEquals(100, actual);
    }

    @Test
    public void shouldNotAskToAdd() {
        int amount = 1000;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);

        Assert.assertEquals(0, actual);

    }
}
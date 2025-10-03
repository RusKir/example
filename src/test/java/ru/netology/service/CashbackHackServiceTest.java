package ru.netology.service;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CashbackHackServiceTest {
@Test
    public void ShouldReturn0IfAmount1000() {
    CashbackHackService service = new CashbackHackService();
    int amount = 1000;
    int actual = service.remain(amount);
    int expected = 0;
    assertEquals(expected, actual);

}
}

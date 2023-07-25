package com.Udemy.unitTesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    @Test
    public void depositTest() throws Exception {
        var bankAccount = new BankAccount("Tim", "Buchalka", 1000.00, BankAccount.CHECKING);
        var balance = bankAccount.deposit(200.00, true);
        assertEquals(1200.00, balance, 0);
    }

    @Test
    public void getBalance_withdraw() throws Exception {
        var bankAccount = new BankAccount("Tim", "Buchalka", 1000.00, BankAccount.CHECKING);
        bankAccount.withdraw(200.00, true);
        assertEquals(800.00, bankAccount.getBalance(), 0);
    }

    @Test
    public void getBalance_deposit() throws Exception {
        var bankAccount = new BankAccount("Tim", "Buchalka", 1000.00, BankAccount.CHECKING);
        bankAccount.deposit(200.00, true);
        assertEquals(1200.00, bankAccount.getBalance(), 0);
    }

    @Test
    public void isChecking_true() throws Exception {
        var bankAccount = new BankAccount("Tim", "Buchalka", 1000.00, BankAccount.CHECKING);
        assertTrue(bankAccount.isChecking());
    }

}
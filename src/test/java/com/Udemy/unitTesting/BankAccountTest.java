package com.Udemy.unitTesting;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    private BankAccount bankAccount;
    private static int count;

    @BeforeAll
    public static void beforeClass() {
        System.out.println("This executes before any test cases. Count = " + count++);
    }

    @BeforeEach
    public void setup() {
        bankAccount = new BankAccount("Tim", "Buchalka", 1000.00, BankAccount.CHECKING);
        System.out.println("Running a test...");
    }

    @Test
    public void withdraw_branch() throws Exception {
        var balance = bankAccount.withdraw(600.00, true);
        assertEquals(400.00, balance, 0);
    }

    @Test
    public void withdraw_notBranch() throws Exception {
        assertThrows(IllegalArgumentException.class, () -> {
            bankAccount.withdraw(600.00, false);
        });
    }

    @Test
    public void depositTest() throws Exception {
        var balance = bankAccount.deposit(200.00, true);
        assertEquals(1200.00, balance, 0);
    }

    @Test
    public void getBalance_withdraw() throws Exception {
        bankAccount.withdraw(200.00, true);
        assertEquals(800.00, bankAccount.getBalance(), 0);
    }

    @Test
    public void getBalance_deposit() throws Exception {
        bankAccount.deposit(200.00, true);
        assertEquals(1200.00, bankAccount.getBalance(), 0);
    }

    @Test
    public void isChecking_true() throws Exception {
        assertTrue(bankAccount.isChecking());
    }

    @AfterAll
    public static void afterClass() {
        System.out.println("This executes after any test cases. Count = " + count++);
    }

}
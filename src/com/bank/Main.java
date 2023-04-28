package com.bank;

public class Main {
    public static void main(String[] args) {
        Account gmIqbal = new Account("GM IQBAL", 123456,
                0123456, "abc@gmail.com",0);
        gmIqbal.DepositMoney(100);
        gmIqbal.WithdrawMoney(50);
        gmIqbal.WithdrawMoney(100);
    }
}
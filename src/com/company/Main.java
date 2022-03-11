package com.company;

import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        User user = new User("Beksultan", "Mamatkadyr uulu");
        Map<User, BankAccount> bankHolder = Map.of(user, new BankAccount(20000),
                new User("Aizhan", "Nurmatova"), new BankAccount(28976));

//        transaction(bankHolder, user, 15000);
        transaction(bankHolder,user,15200);

    }

    public static void transaction(Map<User, BankAccount> userBankAccountMap, User user, int sum) {
        BankAccount bankAccount = userBankAccountMap.get(user);
        int balance = bankAccount.getBalance();
        bankAccount.takeMoney(sum);
        System.out.printf("%s had %d money. \n%s took %d money. \nCurrent balance: %d",
                user.getName(), balance, user.getName(), sum, bankAccount.getBalance());
    }
}

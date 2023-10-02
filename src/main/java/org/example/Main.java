package org.example;

import org.example.bank.Account;
import org.example.bank.BankService;
import org.example.bank.Client;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Account> accounts = new ArrayList<>();
        Client client1 = new Client("Aljoscha", "Nyang", "adf122");
        Client client2 = new Client("Fabian", "Link", "qwe345");
        Client client3 = new Client("Dominic", "Bergmann", "yxc123");
        Client client4 = new Client("Tim", "Wiese", "hjk567");

        accounts.add(new Account("ac1", new BigDecimal("10000"), new Client[]{client1, client2}));
        accounts.add(new Account("ac2", new BigDecimal("10000"), new Client[]{client3, client4}));

        BankService service = new BankService();

        service.transferMoney(accounts, "ac1", "ac2", new BigDecimal("150"));

        System.out.println(accounts.get(0));
        System.out.println(accounts.get(1));
    }
}
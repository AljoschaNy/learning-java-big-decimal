package org.example.bank;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BankService {

    public String getCustomerNumberOfNewCustomer(Client client) {
        Account account = new Account("d1234", new BigDecimal("10000.00"), new Client[]{client});
        return account.getAccountNumber();
    }

    public void transferMoney(ArrayList<Account> accounts, String accountNumberFrom, String accountNumberTo, BigDecimal amount) {
        BigDecimal accountBalanceFrom;
        BigDecimal accountBalanceTo;

        for(Account account: accounts){
            if(account.getAccountNumber().equals(accountNumberFrom)) {
                account.setAccountBalance(account.getAccountBalance().subtract(amount));
            } else if(account.getAccountNumber().equals(accountNumberTo)) {
                account.setAccountBalance(account.getAccountBalance().add(amount));
            }
        }
        System.out.println("Money has been sent");
    }

}

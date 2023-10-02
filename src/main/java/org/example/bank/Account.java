package org.example.bank;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Objects;

public class Account {
    private String accountNumber;
    private BigDecimal accountBalance;
    private Client[] clients;


    public Account(String accountNumber, BigDecimal accountBalance, Client[] clients) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.clients = clients;
    }

    public void depositMoney(BigDecimal amount) {
        this.accountBalance.add(amount);
    }

    public void withdrawMoney(BigDecimal amount) {
        this.accountBalance.subtract(amount);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }

    public Client[] getClients() {
        return clients;
    }

    public void setClients(Client[] clients) {
        this.clients = clients;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(accountNumber, account.accountNumber) && Objects.equals(accountBalance, account.accountBalance) && Arrays.equals(clients, account.clients);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(accountNumber, accountBalance);
        result = 31 * result + Arrays.hashCode(clients);
        return result;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountBalance=" + accountBalance +
                ", clients=" + Arrays.toString(clients) +
                '}';
    }
}

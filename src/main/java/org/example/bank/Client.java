package org.example.bank;

public record Client(
        String firstName,
        String lastName,
        String customerNumber
) {
}

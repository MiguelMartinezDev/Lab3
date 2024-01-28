package org.example.cards;

import org.example.accounts.Account;
import org.example.accounts.CuentaTemporal;

public interface Card {
    void asociarCuenta(Account account);
    void retirar(double monto);
    double saldo();
}

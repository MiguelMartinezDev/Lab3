package org.example;

import org.example.accounts.Account;
import org.example.accounts.CuentaCorriente;
import org.example.accounts.CuentaTemporal;
import org.example.cards.Card;
import org.example.cards.TarjetaCredito;
import org.example.cards.TarjetaPrepago;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Account c3 = new CuentaTemporal(100);
        Card t3 = new TarjetaPrepago(100);
        t3.asociarCuenta(c3);
        t3.retirar(100);
        t3.saldo();
    }
}
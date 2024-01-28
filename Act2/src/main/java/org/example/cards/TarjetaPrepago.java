package org.example.cards;

import org.example.accounts.Account;
import org.example.accounts.CuentaTemporal;

public class TarjetaPrepago implements Card{
    private double balance = 0;
    private Account accountAsociate;

    public TarjetaPrepago(double balance) {
        this.balance = balance;
    }

    @Override
    public void asociarCuenta(Account account) {
        this.accountAsociate = account;
        if (account.saldo() <= 0){
            System.out.println("Deshabilitado");
            return;
        }
        this.balance = account.saldo();
    }

    public double saldo() {
        return balance;
    }

    @Override
    public void retirar(double monto) {
        if (accountAsociate == null){
            System.out.println("Para poder hacer un retiro debes tener una cuenta asociada");
            return;
        }
        if (monto <= balance) {
            balance -= monto;
            accountAsociate.setBalance(monto);
            System.out.println(balance);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}

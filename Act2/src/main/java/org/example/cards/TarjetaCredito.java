package org.example.cards;

import org.example.accounts.Account;

public class TarjetaCredito implements Card{

    private Account accountAsociate;

    public TarjetaCredito(double balance) {
        this.balance = balance;
    }

    public TarjetaCredito() {
    }

    public Account getAccountAsociate() {
        return accountAsociate;
    }

    public void setAccountAsociate(Account accountAsociate) {
        this.accountAsociate = accountAsociate;
    }

    public double saldo() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    private double balance;
    @Override
    public void asociarCuenta(Account account) {
        accountAsociate = account;
    }

    @Override
    public void retirar(double monto) {
        if (accountAsociate == null){
            System.out.println("Para poder hacer un retiro debes tener una cuenta asociada");
            return;
        }
        if (monto <= balance) {
            balance -= monto;
            System.out.println(balance);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}

package org.example.cards;

import org.example.accounts.Account;

public class TarjetaDebito implements Card{
    private double balance= 0;
    private Account accountAsociate;


    public double saldo() {
        return balance;
    }

    public Account getAccountAsociate() {
        return accountAsociate;
    }

    public void setAccountAsociate(Account accountAsociate) {
        this.accountAsociate = accountAsociate;
    }

    @Override
    public void asociarCuenta(Account account) {
        accountAsociate = account;
        balance = account.saldo();
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

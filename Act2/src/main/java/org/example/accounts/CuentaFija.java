package org.example.accounts;

public class CuentaFija implements Account{
    private double balance;

    public CuentaFija(double balance) {
        this.balance = balance;
    }


    @Override
    public boolean withdraw(int value) {
        if (value <= balance) {
            balance -= value;
            return true;
        }
        return false;
    }


    public double saldo(){
        return balance;
    }

    public double setBalance(double monto){
        return balance-= monto;
    }
}

package org.example.accounts;

public class CuentaCorriente implements Account{
    private double balance;

    public CuentaCorriente(double balance) {
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

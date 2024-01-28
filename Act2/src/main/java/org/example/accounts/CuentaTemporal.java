package org.example.accounts;

public class CuentaTemporal implements Account {
    private double balance;

    public CuentaTemporal(double balance) {
        this.balance = balance;
    }

    public double saldo(){
        return balance;
    }

    @Override
    public boolean withdraw(int value) {
            if (value <= balance) {
                balance -= value;
                return true;
            }
            return false;
    }

    public double setBalance(double monto){
        return balance-= monto;
    }

}

package poo2810.Exercicio2;

public class Account {
    private int number;
    private String holder;
    private double balance;
    private double withdrawLimit;

    public Account(int number, String holder, double initialBalance, double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = initialBalance;
        this.withdrawLimit = withdrawLimit;
    }

    public int getNumber() { return number; }
    public String getHolder() { return holder; }
    public double getBalance() { return balance; }
    public double getWithdrawLimit() { return withdrawLimit; }

    public void deposit(double amount) { balance += amount; }
    public void withdraw(double amount) { balance -= amount; }
}
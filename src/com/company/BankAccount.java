package com.company;

public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    public void depozit(double sum) throws LimitException{
        amount += sum;
        System.out.println("вы пополнили карту на" + getAmount());
    }
    public void withDraw(int sum) throws LimitException{
        if (sum > amount) throw new LimitException("Деньги с карты не снимаются,так как у вас мньше 6000", amount);
        else {
            amount -=sum;
            System.out.println("вы сняли с карты сумму на:" + sum);
        }
    }
}

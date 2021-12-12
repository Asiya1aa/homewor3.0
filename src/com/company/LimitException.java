package com.company;

public class LimitException extends Exception {
   public double remainingAmount;

    public double getRemainingAmount() {
        return remainingAmount;
    }

    public void setRemainingAmount(double remainingAmount) {
        this.remainingAmount = remainingAmount;
    }

    public LimitException(String s, double remainingAmount) {
        this.remainingAmount = remainingAmount;

    }
}

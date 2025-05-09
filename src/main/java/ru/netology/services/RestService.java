package ru.netology.services;

public class RestService {

    public int calculate(int income, int expense, int threshold) {
        int balance = 0;
        int rests = 0;
        for (int i = 0; i < 12; i++) {
            if (balance >= threshold) {
                balance = (balance - expense) / 3;
                rests++;
            } else {
                balance = balance + income - expense;
            }
        }
        return rests;
    }
}

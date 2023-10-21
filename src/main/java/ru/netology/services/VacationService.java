package ru.netology.services;

public class VacationService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0;
        int money = 0;

        for (int month = 0; month < 12; month++) {
            if (money > threshold) {
                count++;
                money -= expenses + (expenses * 3);
            } else {
                money += income - expenses;
            }
        }

        return count;
    }
}





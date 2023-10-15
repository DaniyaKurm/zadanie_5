package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VacationServiceTest {
    VacationService service = new VacationService();

    @Test
    public void shouldCalculateVacationMonths1() {
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;

        int expectedVacationMonths = 3;
        int actualVacationMonths = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expectedVacationMonths, actualVacationMonths);
    }

    @Test
    public void shouldCalculateVacationMonths2() {
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;

        int expectedVacationMonths = 2;
        int actualVacationMonths = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expectedVacationMonths, actualVacationMonths);
    }

}
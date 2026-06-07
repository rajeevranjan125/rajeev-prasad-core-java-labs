package com.rajeev.lab3.exe9;

import java.time.LocalDate;
import java.time.Period;

public class DateDurationCalculator {

    public void calculateDuration(LocalDate inputDate) {

        LocalDate currentDate = LocalDate.now();

        Period period = Period.between(inputDate, currentDate);

        System.out.println("Years  : " + period.getYears());
        System.out.println("Months : " + period.getMonths());
        System.out.println("Days   : " + period.getDays());
    }

    public static void main(String[] args) {

        DateDurationCalculator calculator = new DateDurationCalculator();

        calculator.calculateDuration(LocalDate.of(2020, 5, 15));
    }
}
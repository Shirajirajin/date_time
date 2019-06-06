package com.javagda25.datetime.zadanie1.zadanie2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        LocalDate dateTime = LocalDate.now();
        //LocalTime czas = LocalTime.now();
        LocalDate dataICzasPoczatekDnia = LocalDate.from(dateTime.plusDays(10));
        System.out.println(dataICzasPoczatekDnia);
        LocalDate dataMinus10 = LocalDate.from(dateTime.minusDays(10));
        System.out.println(dataMinus10);


    }
}

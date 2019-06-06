package com.javagda25.datetime.zadanie1.zadanie2.zadanie3_4.zadanie6;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {

        LocalDate dataNarodzin = LocalDate.of(1985, 11, 12);
        LocalDate aktualnaData = LocalDate.now();
        DateTimeFormatter dataFormater = DateTimeFormatter.ofPattern("yyyy, MM, dd");

        Period okres = Period.between(dataNarodzin, aktualnaData);
        System.out.println(okres);


       // LocalDate czas = LocalDate.now(); //
      //  LocalDateTime dataICzas = LocalDateTime.now();
        //LocalDateTime dataICzasPoczatekDnia = czas.atStartOfDay();

    }


}
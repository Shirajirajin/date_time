package com.javagda25.datetime.zadanie1.zadanie2.zadanie3_4;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz date 1:");
        String data1 = scanner.nextLine();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Wpisz date 2:");
        String data2 = scanner2.nextLine();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy,MM,dd");

        LocalDate czas = LocalDate.parse(data1, dateTimeFormatter);
        LocalDate czas2 = LocalDate.parse(data2, dateTimeFormatter);

        Period between = Period.between(czas, czas2);

        System.out.println(between);




    }


}

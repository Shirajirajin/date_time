package com.javagda25.datetime.zadanie1;


import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        System.out.println("1. Podaj Date");
        System.out.println("2. Podaj Czas");
        System.out.println("3. Podaj Date i Czas");

        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();

        LocalDateTime dateTime = LocalDateTime.now();
        LocalTime czas = LocalTime.now();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter.ofPattern("HH:mm");


        char menu = scanner.nextLine().charAt(0);

        switch (menu){

            case '1':
                String datatime = dateTimeFormatter.format(dateTime);
                System.out.println(datatime);
                break;

            case '2':
                String datatime2 = dateTimeFormatter2.format(dateTime);
                LocalDateTime dataICzas = LocalDateTime.now();
                System.out.println(dataICzas);
                break;

            case '3':
                String datatime3 = dateTimeFormatter3.format(dateTime);
                LocalDateTime dataICzas2 = LocalDateTime.now();
                System.out.println(dataICzas2);
                break;







        }









    }

}

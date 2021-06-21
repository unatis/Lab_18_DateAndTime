package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {

        LocalDate myObj = LocalDate.now(); // Create a date object
        System.out.println(myObj); // Display the current date

        LocalTime Obj = LocalTime.now();
        System.out.println(Obj);

        LocalDateTime my = LocalDateTime.now();
        System.out.println(my);

        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = my.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate);
        
        LocalTime lTime_1 = LocalTime.now();

        Thread.sleep(5000);

        LocalTime lTime_2 = LocalTime.now();

        Duration diff = Duration.between(lTime_2, lTime_1);

        long dur = diff.toMillis();

        System.out.println(diff);

    }

}

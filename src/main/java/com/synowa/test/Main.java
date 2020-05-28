package com.synowa.test;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Amount of euros I have:");
        String eur = scanner.next(); //as in the task exchangeAmount is input in EUR (by using string Im making sure to not lose accuracy)
        System.out.println("Currency I want:");
        String targetCurrency = scanner.next();
        CurrencyConverter eurConverter = new CurrencyConverter();
        BigDecimal result = null;
        try {
            result = eurConverter.execute(targetCurrency.toUpperCase(), new BigDecimal(eur));
        } catch (Exception e) {
            System.out.println("Invalid number, please type only digits and decimal point.");
            return;
        }
        if (result != null) {
            System.out.println("After exchange I have " + result + " " + targetCurrency.toUpperCase());
        } else {
            System.out.println("Invalid currency: " + targetCurrency);
        }
    }
}

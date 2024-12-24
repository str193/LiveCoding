package org.example;

import static org.example.Season.*;

public class Season1 {
    public static void main(String[] args) {
        Season season = SUMMER;
        switch (season) {
            case SPRING:
                System.out.println("Весна");
                break;
            case SUMMER:
                System.out.println("Лето");
                break;
            case AUTUMN:
                System.out.println("Осень");
                break;
            case WINTER:
                System.out.println("Зима");
                break;

        }
    }
}
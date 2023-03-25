package src;

import java.util.Scanner;

public class MainMenu {
    public static void menu(LoggerCalc logger) {

        String choice;
        boolean exit = false;
        while (!exit) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please, choose type of numbers");
            System.out.println("1. Complex");
            System.out.println("2. Rational fractions");
            System.out.println("3. Rational numbers");
            System.out.println("0. Tap for exit");
            System.out.println();
            choice = scanner.next();
            switch (choice) {
                case "1":
                    MenuCalc.menuCalc("1", logger);
                    break;
                case "2":
                    MenuCalc.menuCalc("2", logger);
                    break;
                case "3":
                    MenuCalc.menuCalc("3", logger);
                    System.out.println("Welcome back to main menu");
                    break;
                case "0":
                    exit = true;
                    logger.LOGGER.info("Calculator has stopped");
                    break;
                default:
                    System.out.println("Incorrect input. Please, try again.");
                    logger.LOGGER.info("Incorrect choice of numbers type");
                    break;
            }
        }

    }
    }


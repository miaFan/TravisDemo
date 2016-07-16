package org.mengtian;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        System.out.println("------Welcome to Guess Number------");
        System.out.println("Please input a four-digit number:");

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String input = scanner.next();

            if (input.length() == 4) {
                NumberComparer numberComparer = new NumberComparer();
                NumberGenerator numberGenerator = new NumberGenerator(new RandomDigitGenerator());

                String generate = numberGenerator.generate();
                String result = numberComparer.compare(generate, input);

                System.out.println(String.format("%s,Your guess is: %s", generate, result));
                break;
            } else {
                System.out.printf("Invalid number. Please Input again:");
            }
        }


    }
}

package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        String[] guests = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi",
                "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" };
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il tuo nome:");
        String name = scanner.nextLine();
        boolean isGuest = false;

        // using for cicle
        /*
         * for (int i = 0; i < guests.length; i++) {
         * if (name.equals(guests[i])) {
         * isGuest = true;
         * break;
         * }
         * }
         */

        // using while cicle
        int i = 0;
        while (i < guests.length && !isGuest) {
            if (name.equals(guests[i])) {
                isGuest = true;
            }
            i++;
        }

        if (isGuest) {
            System.out.println("Benvenuto alla festa " + name + "!");
        } else {
            System.out.println("Mi dispiace, " + name + " non sei in lista.");
        }
        scanner.close();
    }
}

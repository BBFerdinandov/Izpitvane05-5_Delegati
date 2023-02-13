package org.example;

import com.sun.source.doctree.SummaryTree;

import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            System.out.println("Menu");

            System.out.println("1. Izprintirai suma za plashtane za noshtuvka/i");

            System.out.println("2. Izprintirai imeto na nai-rano pristignaliq delegat i dannite za hotela");

            System.out.println("3. Izprintirai spisuk s dannite na delegatite ot dadeno naseleno mqsto");

            System.out.println("4. Izprintirai danni na delegata otsednal v konkrentna staq");

            System.out.println();

            System.out.print("Choose: ");

            int n = scanner.nextInt();

            switch (n) {
                case 1:
                    //return Sum;
                    break;
                case 2:
                    //return earliestDelegate
                    break;
                case 3:
                    //return delegateList;
                    break;
                case 4:
                    //return delegateData;
                    break;

                default:
                    System.out.println("Greshno vavedeni danni");
                    break;
            }
        }
    }
}
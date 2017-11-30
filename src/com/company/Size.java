package com.company;

import java.util.Scanner;

/**
 * Created by Ben on 11/30/17.
 */

class Size {

    void sizemenu() {

        Scanner top = new Scanner(System.in);
        System.out.println("1 = small");
        System.out.println("2 = medium");
        System.out.println("3 = large");
        System.out.println("Please enter the number associated the size:");

        String number = top.next();
        switch (number) {

            case "1":
                System.out.println("You've selected the small size");
                break;
            case "2":
                System.out.println("You've selected the medium size");
                break;
            case "3":
                System.out.println("You've selected the large size");
                break;

            default:
                sizemenu();
                break;

        }
    }
}
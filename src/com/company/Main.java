package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {





        int numberOfPizzasOrdered;
        int numberOfCurrentPizza = 1;


        Scanner numberOfPizzasOrderedScanner = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);



        System.out.println("Pizza Order Manager");
        System.out.println("===================");
        System.out.println("");
        System.out.println("Enter number of Pizza Orders: ");
        numberOfPizzasOrdered = numberOfPizzasOrderedScanner.nextInt();
        System.out.println("");


        int i = 1;

        while (i<=numberOfPizzasOrdered){
            System.out.println("Enter Details of Pizza Order " + numberOfCurrentPizza + ":");
            System.out.println("===================");

            boolean continueInput = false;

            PizzaOrder p1 = new PizzaOrder();

            do {
                try {

            //PizzaOrder p1 = new PizzaOrder();
            System.out.println("ID: ");
            p1.setId(scanner.nextInt());


        if (p1.getId() <= 10) {
            System.out.println("Please enter a number higher than 10: ");
            p1.setId(scanner.nextInt());
            continueInput = false;
        }
    } catch (InputMismatchException ex) {
        System.out.println("Error");
    }
        }while(false);


         scanner.nextLine();
            System.out.println("Name: ");
            p1.setName(scanner.nextLine());
            System.out.println("Phone: ");
            p1.setPhoneNumber(scanner.nextLine());

            Size size = new Size();
            size.sizemenu();

            System.out.println("Order: ");
            p1.setOrder(scanner.nextLine().trim());
            System.out.println("Type (Pick-Up or Delivery): ");
            p1.setType(scanner.next());



            System.out.println("");
            System.out.println("Details of Pizza Order " + numberOfCurrentPizza + ":");
            System.out.println("=======================");
            System.out.println("ID: " + p1.getId());
            System.out.println("Name: "+ p1.getName());


            System.out.println("Phone: "+ p1.getPhoneNumber());


            System.out.println("Order: "+ p1.getOrder());
            System.out.println("Type (Pick-up or Delivery): "+ p1.getType());
            System.out.println("Pizza Cost ($): "+ p1.determinePizzaPrice());

            System.out.println("Calculate total cost ($): " +p1.totalCost());


            numberOfCurrentPizza = numberOfCurrentPizza + 1;
            i++;


        }



    }

}
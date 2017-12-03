import java.util.*;

abstract class PizzaStuff {
    //a mentu that takes in all of the users personal information such as Name, Phone Number, and Delievery type
    static void menu( OrdererInfo o1, Scanner input){
        try {
            //Adding a new order
            System.out.println("Pizza Order Manager");
            System.out.println("===================");

            System.out.print("Please enter a name for the order: ");
            o1.setName(input.nextLine());
            System.out.print("Please enter a phone number for the order: ");
            o1.setPhoneNumber(input.nextLine());
            System.out.println("1. Delivery");
            System.out.println("2. Pick-up");
            System.out.println("3. Delayed Delivery");
            System.out.println("4. Delayed Pick-up");
            System.out.print("Please choose a delivery option: ");
            o1.setDeliveryOption(input.nextInt());
        } catch (InputMismatchException e) {
            System.out.println("ERROR! Try again please enter a correct value.");
            input.nextLine();
        }
    }


    /*a method that puts out a menu of all the types of pizzas that can be ordered, and uses the overloaded pizzaPrice
    method to show the prices of the pizzas next to each type on the menu */
    static void pizzaMenu(PizzaOrder p1){
        Scanner choice = new Scanner(System.in);
        try {
            System.out.println("Which Pizza would you like to order?");
            System.out.println("====================================");
            System.out.println("1. Cheese, price " + p1.pizzaPrice(1));
            System.out.println("2. Pepperoni, price "  + p1.pizzaPrice(2));
            System.out.println("3. Supreme, price " + p1.pizzaPrice(3));
            System.out.println("4. Hawaiian, price " + p1.pizzaPrice(4));
            p1.setTypeOfPizza(choice.nextInt());
            p1.pizzaPrice();
        }catch (InputMismatchException e){
            System.out.println("ERROR! Please select one of the pizza types above.");
            choice.nextInt();
        }
    }

    //sets a random ID number for the order in the range of 1000-9999
    public static int setID(){
        Random rand = new Random();
        int id;

        id = rand.nextInt((9999-1000) +1) + 1000;
        return id;
    }
}

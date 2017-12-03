import java.util.*;

/*
THE THINGS THAT WE STILL NEED
interface
method overriding
method overloading
stacks
generics
super keyword
lists
printf
*/


public class Pizza extends PizzaStuff{
    //creates global, list to hold all the pizza types
    public static List<PizzaOrder> pizzaList = new ArrayList<PizzaOrder>();

    public static void main(String[] args) {
        //variables
        OrdererInfo o1 = new OrdererInfo();
        Scanner input = new Scanner(System.in);

        int pizzasOrderd = 0;
        int id = setID();

        //calls the menu method that lets the user input all thier personal information
        menu(o1,input);
        //calls a recursive method
        pizzasOrderd = recursivePizzaCreator(pizzasOrderd);


        //creates a map, that holds the delivery options
        LinkedHashMap<Integer, String> deliveryOption = new LinkedHashMap<>();
        deliveryOption.put(1, "Delivery");
        deliveryOption.put(2, "Pick-up");
        deliveryOption.put(3, "Delayed Delivery");
        deliveryOption.put(4, "Delayed Pick-up");
        deliveryOption.put(5, "Digiorno");

        //tells customer what they orderd
        try {
            System.out.println("===================");
            System.out.println("Order Info");
            System.out.println("===================");
            System.out.println("Name: " + o1.getName());
            System.out.println("Phone Number: " + o1.getPhoneNumber());
            System.out.println("Delivery type: " + deliveryOption.get(o1.getDeliveryOption()));
            System.out.println("Number of Pizzas Ordered: " + pizzasOrderd);
            System.out.println("Price of Order: " + totalCost(o1, pizzaList.get(0)));
            System.out.println("Order Number: " + id);
        }catch(IndexOutOfBoundsException e){
            System.out.println("You ordered 0 pizzas, Have a nice day!");
        }
    }

    //calculates the total cost of the pizzas ordered depending on what type of delivery option the user selected
    public static double totalCost(OrdererInfo o1, PizzaOrder p1){
        //variables
        double totalCost = 0.00;
        final double DELIVERYCOST = 2.5;
    /*depending on the delivery option that the user decided on, this if statement will go through the pizza list and
    add up the total of all the pizzas, and add delivery charge if nessisary. */
        if (o1.getDeliveryOption() == 2 || o1.getDeliveryOption() == 4 ){
            //Pick-up
            for(int i = 0; i <= pizzaList.size() -1; i++){
                totalCost += pizzaList.get(i).pizzaPrice();
            }
        }else if (o1.getDeliveryOption() == 1 || o1.getDeliveryOption() == 3){
            //Delivery
            for(int i = 0; i <= pizzaList.size() -1; i++){
                totalCost += pizzaList.get(i).pizzaPrice();
            }
            totalCost += DELIVERYCOST;
        }else if (o1.getDeliveryOption() == 5){
            //Digiorno
            totalCost = 0.00;
        }
        return totalCost;
    }

    //recursivly loops and allows the user to add pizzas to the order until they choose not to
    static int recursivePizzaCreator(int i) {
        Scanner s = new Scanner(System.in);
        String choice;
        System.out.print("Do you want to order anything (y/n): ");
        choice = s.nextLine();
        System.out.println();
        if(choice.equals("y")) {
            pizzaList.add(new PizzaOrder());
            pizzaMenu(pizzaList.get(i));
            i++;
            return recursivePizzaCreator(i);
        }else{
            return (i);
        }
    }
}
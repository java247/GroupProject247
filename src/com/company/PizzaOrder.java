public class PizzaOrder {

    private int typeOfPizza;

    //constructor
    public PizzaOrder(){
        setTypeOfPizza(1);
    }

    //Setters
    public void setTypeOfPizza(int typeOfPizza){
        this.typeOfPizza = typeOfPizza;
    }

    double price;

    //pizzaPrice is a switch statement that determines and returns the price of the pizza based on what the user slected
    public double pizzaPrice(){
        switch(this.typeOfPizza){
            case 1:
                price = 10.99;
                break;
            case 2:
                price = 17.99;
                break;
            case 3:
                price = 14.99;
                break;
            case 4:
                price = 17.99;
                break;
            default:
                price = 0;
                break;
        }
        return price;
    }

    //overloaded pizzaPrice method
    public double pizzaPrice(int pizzaType){
        switch(pizzaType){
            case 1:
                price = 10.99;
                break;
            case 2:
                price = 17.99;
                break;
            case 3:
                price = 14.99;
                break;
            case 4:
                price = 17.99;
                break;
            default:
                price = 0;
                break;
        }
        return price;
    }
}

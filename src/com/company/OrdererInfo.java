public class OrdererInfo {

    private String name;
    private String phoneNumber;
    private int deliveryOption;

    public OrdererInfo(){
        setName("testName");
        setPhoneNumber("testNumber");
        setDeliveryOption(1);
    }

    //setters
    public void setName(String name){
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }


    public void setDeliveryOption(int option){
        this.deliveryOption = option;
    }

    //getters
    private String getName(){
        return name;
    }

    private String getPhoneNumber(){
        return phoneNumber;
    }

    public int getDeliveryOption(){
        return deliveryOption;
    }

    //over rides the toString method to output the name and phone Number of the customer
    @Override
    public String toString() {
        return "Name: " + getName() + "\nPhone Number: " + getPhoneNumber();
    }
}

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
    public String getName(){
        return name;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public int getDeliveryOption(){
        return deliveryOption;
    }
}

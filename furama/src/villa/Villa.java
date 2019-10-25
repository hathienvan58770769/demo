package villa;

import accommodation.AccommodationInterface;
import customer.Customer;

public class Villa implements AccommodationInterface {
    private String name;
    private int bed;
    private float size;
    private int price;
    private int date;

    public  Villa(){

    }
    public Villa(String name, Customer customer, int date) {
        this.name = name;
        this.date = date;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBed() {
        return bed;
    }

    public void setBed(int bed) {
        this.bed = bed;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        date = date;
    }

    public String getCustomerInVilla(Customer customer) {
        return customer.toString()+"";
    }

    public String getNameCustomerInVilla(Customer customer) {
        return customer.getName();
    }
    public boolean getCheckCustomerInVilla(Customer customer) {
        if (customer.getName()==null) {
            return false;
        }
        else {
            return true;
        }
    }

    @Override
    public float getCostFinal() {
        return this.PRICE_1DATE*this.getDate();
    }

    @Override
    public int getNumberDate(int money) {
        int date = 0;
        switch (money) {
            case 100:
                date = money/this.PRICE_1DATE;
                break;
            case 50:
                date = money/this.PRICE_1DATE;
                break;
            case 30:
                date = money/this.PRICE_1DATE;
                break;
            default:
                date = 1;
                break;
        }
        return date;
    }

    @Override
    public void paymentMoneyByVisaCard() {
        System.out.println("Hello. You chooses payment by Visa Card.");

    }

    @Override
    public void paymentMoneyByMasterCard() {
        System.out.println("Hello. You chooses payment by Master Card.");
    }
}


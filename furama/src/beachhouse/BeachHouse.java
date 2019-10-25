package beachhouse;

import accommodation.AccommodationInterface;
import customer.Customer;

public class BeachHouse implements AccommodationInterface {
    private String name;
    private int bed;
    private float size;
    private int price;
    private int date;
    public  BeachHouse(){

    }
    public  BeachHouse(String name){
        this.name = name;
    }
    public BeachHouse(String name, Customer customer, int date) {
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

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public float getCostFinal() {
        return this.PRICE_1DATE*this.getDate();
    }

    @Override
    public int getNumberDate(int money) {
        return 0;
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

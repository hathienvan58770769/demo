package mainday02;

import beachhouse.BeachHouse;
import customer.Customer;
import runningApplication.ApplicationRunning;
import villa.Villa;

public class MainTestDay02 implements ApplicationRunning {

    public static void main(String[] args) {
        MainTestDay02 mainTestDay02 = new MainTestDay02();
        mainTestDay02.run();
    }
    public static void beachHouseInDay02(){
        BeachHouse beachHouse1 = new BeachHouse("Beach House Vip1");
        BeachHouse beachHouse2 = new BeachHouse("Beach House Vip2");
        BeachHouse[] arrayBeach = new BeachHouse[2];
        arrayBeach[0] = beachHouse1;
        arrayBeach[1] = beachHouse2;

        System.out.println("----------------------------");
        getAllNameBeachByArray(arrayBeach);
    }

    public static void getAllNameBeachByArray(BeachHouse[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("BeachHouse "+i+" is name: "+array[i].getName());
        }
    }
    public static void getAllNameVillaByArray(Villa[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Villa "+i+" is name: "+array[i].getName());
        }
    }

    public static void villaInDay02() {
        Customer customer1 = new Customer("Nguyen Van A", 20);
        Villa villa1 = new Villa("Villa VIP01",customer1, 4);

        Customer customer2 = new Customer("Nguyen Van B", 20);
        Villa villa2 = new Villa("Villa VIP02",customer2, 2);

        Customer customer3 = new Customer("Nguyen Van C", 20);
        Villa villa3 = new Villa("Villa VIP03",customer3, 1);

        Customer customer4 = new Customer("Nguyen Van D", 20);
        Villa villa4 = new Villa("Villa VIP04",customer4, 5);

        Customer customer5 = new Customer("Nguyen Van E", 20);
        Villa villa5 = new Villa("Villa VIP05",customer5, 5);

        Villa[] arrayListVilla = new Villa[5];
        arrayListVilla[0] = villa1;
        arrayListVilla[1] = villa2;
        arrayListVilla[2] = villa3;
        arrayListVilla[3] = villa4;
        arrayListVilla[4] = villa5;

        System.out.println("----------------------------");
        getAllNameVillaByArray(arrayListVilla);
    }


    @Override
    public void run() {
        beachHouseInDay02();
        villaInDay02();
    }
}

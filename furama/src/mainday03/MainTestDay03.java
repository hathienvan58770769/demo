package mainday03;

import beachhouse.BeachHouse;
import customer.Customer;
import runningApplication.ApplicationRunning;
import villa.Villa;

public class MainTestDay03 implements ApplicationRunning {
    public static void main(String[] args) {
        MainTestDay03 mainDay03 = new MainTestDay03();
        mainDay03.run();
    }

    public static void beachHouseInDay03(){
        BeachHouse beachHouse1 = new BeachHouse("Beach House Vip1");
        BeachHouse beachHouse2 = new BeachHouse("Beach House Vip2");
        BeachHouse beachHouse3 = new BeachHouse("Beach House Vip3");
        BeachHouse[] arrayBeach = new BeachHouse[3];
        arrayBeach[0] = beachHouse1;
        arrayBeach[1] = beachHouse2;
        arrayBeach[2] = beachHouse3;

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

    public static void villaInDay03() {
        Customer customer1 = new Customer("Nguyen Van A", 25);
        Villa villa1 = new Villa("Villa VIP01",customer1, 4);

        Customer customer2 = new Customer("Nguyen Van B", 27);
        Villa villa2 = new Villa("Villa VIP02",customer2, 2);

        Customer customer3 = new Customer("Nguyen Van C", 26);
        Villa villa3 = new Villa("Villa VIP03",customer3, 1);

        Customer customer4 = new Customer("Nguyen Van D", 18);
        Villa villa4 = new Villa("Villa VIP04",customer4, 5);

        Villa[] arrayListVilla = new Villa[4];
        arrayListVilla[0] = villa1;
        arrayListVilla[1] = villa2;
        arrayListVilla[2] = villa3;
        arrayListVilla[3] = villa4;

        System.out.println("----------------------------");
        getAllNameVillaByArray(arrayListVilla);
    }


    @Override
    public void run() {
        beachHouseInDay03();
        villaInDay03();
    }

}

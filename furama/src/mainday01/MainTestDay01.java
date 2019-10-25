package mainday01;

import customer.Customer;
import runningApplication.ApplicationRunning;
import swimming.SwimmingPool;
import villa.Villa;

import java.util.Scanner;
public class MainTestDay01 implements ApplicationRunning {

    public static void checkAndShowTimeOpenSwimmingPool() {
        float timeSwimming;
        SwimmingPool swp = new SwimmingPool();
        swp.getOpenTimeInScreen();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input time Customer request: ");
        timeSwimming = scanner.nextFloat();
        if (timeSwimming < 9) {
            System.out.println("Go back at 9:00 am");
        }
        else {
            System.out.println("Welcome...");
        }
    }
    public static  void  main(String[] args){
        MainTestDay01 mainTestDay01 = new MainTestDay01();
        mainTestDay01.run();
    }
    public static void Task01day01(){
        Customer customer1 = new Customer("Ha Thien Van", 20);
        Villa villa1 = new Villa("VillaV01",customer1,10);
        System.out.println("Name Customer: "+villa1.getCustomerInVilla(customer1));
        System.out.println("Cost         :"+villa1.getCostFinal());
    }

    public static void Task02day01(){
        checkAndShowTimeOpenSwimmingPool();

        Scanner scanner = new Scanner(System.in);
        Customer customer1 = new Customer("Ha Thien Van", 20);
        Villa villa1 = new Villa("Villa VIP01",customer1, 4);
        System.out.println("----------------------------");
        System.out.print("Input money: ");
        int moneyVilla = scanner.nextInt();
        System.out.println(villa1.getNumberDate(moneyVilla));
    }
    @Override
    public void run() {
        Task01day01();
        Task02day01();
    }
}

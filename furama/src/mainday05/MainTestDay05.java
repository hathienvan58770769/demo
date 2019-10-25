package mainday05;

import customer.Customer;
import runningApplication.ApplicationRunning;
import villa.Villa;

import java.util.Scanner;

public class MainTestDay05 implements ApplicationRunning {

    public static void main(String[] args) {
        MainTestDay05 mainDay05 = new MainTestDay05();
        mainDay05.run();
    }

    public static void choosePaymentInDay05(Villa villa1){

        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println(" -----------------------------");
            System.out.println("| Do you choose payment?      |");
            System.out.println("| 1. Visa                     |");
            System.out.println("| 2. Master Card              |");
            System.out.println(" -----------------------------");
            choice = scanner.nextInt();
        } while (choice>2);

        switch (choice) {
            case 1:
                villa1.paymentMoneyByVisaCard();
                break;
            case 2:
                villa1.paymentMoneyByMasterCard();
                break;

            default:

        }
    }



    @Override
    public void run() {
        Customer customer1 = new Customer("Nguyen Van A", 20);
        Villa villa1 = new Villa("Villa VIP01",customer1, 4);
        choosePaymentInDay05(villa1);
    }

}

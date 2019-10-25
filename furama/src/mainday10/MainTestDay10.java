package mainday10;

import customer.Customer;
import runningApplication.ApplicationRunning;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class MainTestDay10 implements ApplicationRunning {

    public static void main(String[] args) {
        MainTestDay10 mainDay10 = new MainTestDay10();
        mainDay10.run();
    }

    public static void runningRequestDay10() {
        Customer customer01 = new Customer("Watcher 01", 19);
        Customer customer02 = new Customer("Watcher 02", 18);
        Customer customer03 = new Customer("Watcher 03", 21);

        Queue<Customer> queueCustomer = new LinkedList<>();
        queueCustomer.add(customer01);
        queueCustomer.add(customer02);
        queueCustomer.add(customer03);
        System.out.println("---------------Day 10-----------------");
        showAllCustomerInQueue(queueCustomer);
    }

    public static void showAllCustomerInQueue(Queue<Customer> customerQueue) {
        Iterator i = customerQueue.iterator();
        while (i.hasNext()) {
            System.out.println(i.next() + " ");
        }
    }

    @Override
    public void run() {
        runningRequestDay10();

    }

}
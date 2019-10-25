package mainday13;

import customer.Customer;
import exception.NotFoundException;
import runningApplication.ApplicationRunning;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MainTestDay13 implements ApplicationRunning {
    public static void main(String[] args) throws NotFoundException {
        MainTestDay13 mainDay13 = new MainTestDay13();
        mainDay13.run();
    }

    public static void runningRequestDay13() throws NotFoundException {
        Customer customer1 = new Customer("Nguyen Van A", 20);
        Customer customer2 = new Customer("Nguyen Van B", 20);
        Customer customer3 = new Customer("Nguyen Van C", 22);
        Customer customer4 = new Customer("Nguyen Van D", 20);
        List<Customer> arrayListCustomer = new ArrayList<>();
        arrayListCustomer.add(customer1);
        arrayListCustomer.add(customer2);
        arrayListCustomer.add(customer3);
        arrayListCustomer.add(customer4);
        findCustomerInResort(arrayListCustomer);
    }

    public static void findCustomerInResort(List<Customer> listCustomer) throws NotFoundException {
        System.out.println("-------------- Day 13 Exception ---------------\nInput name customer: ");
        Scanner scanner = new  Scanner(System.in);
        String nameSearch = scanner.nextLine();
        Iterator<Customer> itr = listCustomer.iterator();
        while (itr.hasNext()) {
            Customer findCustomer = itr.next();
            if (findCustomer.getName().equals(nameSearch)) {
                System.out.println("Finded Customer by name: "+nameSearch+". Age: "+findCustomer.getAge());
                break;
            }
            else if ((itr.hasNext() == false)) {
                throw new NotFoundException("Not found Customer.");
            }
        }
    }

    @Override
    public void run() {
        try {
            runningRequestDay13();
        } catch (NotFoundException e) {
            e.printStackTrace();
        }

    }
}

package mainday14;

import customer.Customer;
import runningApplication.ApplicationRunning;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MainTestDay14 implements ApplicationRunning {
    public static void main(String[] args) {
        MainTestDay14 mainDay14 = new MainTestDay14();
        mainDay14.run();
    }

    public static void runningRequestDay14() {
        Customer customer1 = new Customer("Nguyen Van A", 20);
        Customer customer2 = new Customer("Nguyen Van B", 20);
        Customer customer3 = new Customer("Nguyen Van C", 20);
        Customer customer4 = new Customer("Nguyen Van Van", 26);
        List<Customer> arrayListCustomer = new ArrayList<>();
        arrayListCustomer.add(customer1);
        arrayListCustomer.add(customer2);
        arrayListCustomer.add(customer3);
        arrayListCustomer.add(customer4);
        writeFileContainsCustomer(arrayListCustomer);
        readFileContainsCustomer();
    }

    public static void writeFileContainsCustomer(List<Customer> arrayListCustomer) {
        //You can change link folder content file
        File fileObject = new File("/Users/hathienvan/Downloads/ResortRequirement.txt.docx");
        try {
            FileWriter fileWriter = new FileWriter(fileObject);
            for (Customer element : arrayListCustomer) {
                System.out.print(element);
                fileWriter.write(element.getName().toString()+"\r\n");
            }
            System.out.println("save success.");
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Error File Address...");
            e.printStackTrace();
        }
    }

    public static void readFileContainsCustomer() {
        //You can change link folder content file
        File fileOblject = new File("/Users/hathienvan/Downloads/ResortRequirement.txt.docx");
        try {
            System.out.println("Read  File.");
            FileReader fileReader = new FileReader(fileOblject);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
            fileReader.close();
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        runningRequestDay14();

    }
}

package mainday12;

import employees.Employees;
import runningApplication.ApplicationRunning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainTestDay12 implements ApplicationRunning {
    public static void main(String[] args) {
        MainTestDay12 mainDay12 = new MainTestDay12();
        mainDay12.run();
    }

    public static void runningRequestDay12() {
        Employees employeesJhon = new Employees(001, "John", 14, "12NY, USA");
        Employees employeesJihoon = new Employees(002, "Jihoon", 1, "09NY, Vietnam");
        Employees employeesLux = new Employees(003, "Lux", 2, "09NY, Thailand");
        System.out.println("-----------------Day 12: Sort -----------------\n");
        List<Employees> listSortEmployees = new ArrayList<>();
        listSortEmployees.add(employeesJhon);
        listSortEmployees.add(employeesJihoon);
        listSortEmployees.add(employeesLux);
        sortArrayList(listSortEmployees);
    }

    public static void  sortArrayList(List<Employees> listSortEmployees) {
        Collections.sort(listSortEmployees, new Comparator<Employees>() {
            @Override
            public int compare(Employees employees01, Employees employees02) {
                return employees01.getAge() - employees02.getAge();
            }
        });
        listSortEmployees.forEach(e -> System.out.println(e));
    }

    @Override
    public void run() {
        runningRequestDay12();

    }
}

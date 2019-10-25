package mainday08;

import employees.Employees;
import runningApplication.ApplicationRunning;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MainTestDay08 implements ApplicationRunning {
    public static void main(String[] args) {
        MainTestDay08 mainDay08 = new MainTestDay08();
        mainDay08.run();
    }

    public static void addEmployeesMapInDay08(){
        System.out.println("---------------Day 8-----------------");
        Employees employeesJhon = new Employees(001, "John", 14, "12NY, USA");
        Employees employeesJihoon = new Employees(002, "Jihoon", 1, "09NY, Vietnam");
        Employees employeesLux = new Employees(003, "Lux", 2, "09NY, Thailand");
        //the same: employees 4->10
        Map<Integer, Employees> employeesManagerHashMap = new HashMap<>();
        employeesManagerHashMap.put(employeesJhon.getId(), employeesJhon);
        employeesManagerHashMap.put(employeesJihoon.getId(), employeesJihoon);
        employeesManagerHashMap.put(employeesLux.getId(), employeesLux);
        showElementHashMap(employeesManagerHashMap);
    }

    public static void showElementHashMap(Map<Integer, Employees> employeesManagerHashMap) {
        Set<Integer> keySet = employeesManagerHashMap.keySet();
        for (Integer key : keySet) {
            System.out.println(key + ": \t "+employeesManagerHashMap.get(key));
        }
    }


    @Override
    public void run() {
        addEmployeesMapInDay08();
    }
}

package mainday11;

import employees.EmployeesProfile;
import runningApplication.ApplicationRunning;

import java.util.Scanner;
import java.util.Stack;

public class MainTestDay11 implements ApplicationRunning {
    public static void main(String[] args) {
        MainTestDay11 mainDay11 = new MainTestDay11();
        mainDay11.run();
    }
    public static void runningRequestDay11() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------------Day 11: Stack -----------------");
        System.out.println("Nhap ten nhan vien can tim: (vi du: Quang Tuan 1)");
        Stack<EmployeesProfile> stackEmployeeProfile = new Stack<>();
        EmployeesProfile employeesProfile01 = new EmployeesProfile("Quang Tuan 1");
        EmployeesProfile employeesProfile02 = new EmployeesProfile("Quang Tuan 2");
        EmployeesProfile employeesProfile03 = new EmployeesProfile("Quang Tuan 3");
        showPush(stackEmployeeProfile, employeesProfile01);
        showPush(stackEmployeeProfile, employeesProfile02);
        showPush(stackEmployeeProfile, employeesProfile03);
        String resultSearchStack = scanner.nextLine();
        printStack(stackEmployeeProfile, resultSearchStack);
    }

    public static void printStack(Stack<EmployeesProfile> stackEmployeeProfile, String resultSearchStack) {
        while (!stackEmployeeProfile.empty()) {
            String nameElement = stackEmployeeProfile.pop().toString();
            if (nameElement.equals(resultSearchStack)) {
                System.out.println(resultSearchStack+" exited.");
            }
        }
    }

    public static void  showPush(Stack stackName, EmployeesProfile nameEmployee) {
        stackName.push(nameEmployee);
    }


    @Override
    public void run() {
        runningRequestDay11();

    }
}

package employees;

import java.util.HashMap;

public class Employees {
    private int id;
    private String name;
    private int age;
    private String address;
    HashMap<Integer, Employees> employeesManagerHashMap = null;


    public Employees(int id, String name, int age, String address) {
        this.setId(id);
        this.setName(name);
        this.setAddress(address);
        this.setAge(age);
    }

    public HashMap<Integer, Employees> addEmployeesToMap( Employees value) {
        if (employeesManagerHashMap == null) {
            employeesManagerHashMap = new HashMap<>();
        }
        employeesManagerHashMap.put(value.getId(), value);
        return employeesManagerHashMap;
    }




    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return "Name : "+this.name + "\tAge: " + this.age+ ". Address: "+ this.address+ "\n";
    }
}

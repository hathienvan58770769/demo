package employees;

public class EmployeesProfile {
    private int id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public EmployeesProfile(String name) {
        this.setName(name);
    }

    @Override
    public String toString() {
        return name;
    }
}

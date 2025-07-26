public class Employee {
    protected String name;
    protected int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayInfo() {
        System.out.println("ID: " + id + " | Name: " + name);
    }

    public String getData() {
        return id + "," + name;
    }
}

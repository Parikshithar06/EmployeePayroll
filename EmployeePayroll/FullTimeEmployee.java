public class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String name, int id, double salary) {
        super(name, id);
        this.monthlySalary = salary;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Full-Time | Salary: ₹" + monthlySalary);
    }

    @Override
    public String getData() {
        return super.getData() + ",FullTime," + monthlySalary;
    }
}

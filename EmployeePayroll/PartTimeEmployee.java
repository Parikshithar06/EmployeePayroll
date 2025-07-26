public class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double ratePerHour;

    public PartTimeEmployee(String name, int id, int hours, double rate) {
        super(name, id);
        this.hoursWorked = hours;
        this.ratePerHour = rate;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Part-Time | Hours: " + hoursWorked + " | Rate: ₹" + ratePerHour);
    }

    @Override
    public String getData() {
        return super.getData() + ",PartTime," + hoursWorked + "," + ratePerHour;
    }
}

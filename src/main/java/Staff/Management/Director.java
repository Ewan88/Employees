package Staff.Management;

public class Director extends Manager {

    Director director;
    private double budget;

    public Director(String name, String NInumber, double salary, String department, double budget){
        super(name, NInumber, salary, department);
        this.budget = budget;
    }

    public double getBudget() {
        return this.budget;
    }

    public double payBonus() {
        return (getSalary() * (2.0 / 100.0));
    }
}

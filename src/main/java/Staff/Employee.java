package Staff;

public abstract class Employee {

    Employee employee;
    String name, NInumber;
    double salary;

    public Employee(String name, String NInumber, double salary){
        this.name = name;
        this.NInumber = NInumber;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public String getNInumber() {
        return this.NInumber;
    }

    public double getSalary() {
        return this.salary;
    }

    public void raiseSalary(double amount) {
        if (amount > 0) {
            this.salary += amount;
        }
    }

    public double payBonus() {
        return (this.salary * (1.0 / 100.0));
    }

    public void setName(String name) {
        this.name = name;
    }
}

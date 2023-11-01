package hw;

public class Worker extends Employer implements BackEnd{
    public Worker(String name, double salary) {
        super(name, salary);
    }

    public Worker(String name) {
        super(name);
    }

    @Override
    public double setAverageSalary() {
        return salary;
    }
}

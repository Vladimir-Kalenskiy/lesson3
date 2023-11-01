package hw;

public class Freelancer extends Employer implements BackEnd{
    public Freelancer(String name, double salary) {
        super(name, salary);
    }

    public Freelancer(String name) {
        super(name);
    }

    @Override
    public double setAverageSalary() {
        double result = 20.8 * 8 * salary;
        return result;
    }

    @Override
    public String toString() {
        return "Freelancer{" +
                "name ='" + name + '\'' +
                ", salary =" + salary + " $/h" +
                '}';
    }
}

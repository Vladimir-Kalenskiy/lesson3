package hw;

public class Employer {
    String name;
    double salary;

    public Employer(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employer(String name) {
        this.name = name;
    }

    private static Employer create(String name){
        return create(name);
    }

    public static Employer create(String name, double salary){
        if (name == null || name.length() < 3)
            throw new RuntimeException("Некорректное имя сотрудника.");

        if (salary < 0){
            throw new RuntimeException("Некорректная зарплата сотрудника.");
        }
        return new Employer(name, salary);
    }


    @Override
    public String toString() {
        return String.format("%s - %f", name, salary);
    }
}


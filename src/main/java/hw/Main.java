package hw;

public class Main {
    public static void main(String[] args) {


        Employer[] employers = {
                Freelancer.create("Jonh", 29.99),
                Worker.create("Lili", 500),
                Freelancer.create("Bob", 30.0),
                Worker.create("Julia", 450)
        };

        for (Employer emp: employers) {
            System.out.println(emp);
        }
    }
}

package prob4C;

public class Salaried extends Employee {

    int salary;

    public Salaried(int salary){
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public double calcGrossPay(int month, int year) {
        return getSalary();
    }
}

package prob4C;

public abstract class Employee {

    private int empId;

    public void print() {

    }

    public PayCheck calcCompensation(int month, int year) {

        double grossPay = calcGrossPay(month,year);
        PayCheck payCheck = new PayCheck(grossPay,.23,.05,.01,.03,.075);
        return payCheck;
    }

    public abstract double calcGrossPay(int month, int year);


}

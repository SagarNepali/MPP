package prob4C;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Commissioned extends Employee {

    private int commission;
    private int baseSalary;
    private List<Order> orders;

    public Commissioned(int commission, int baseSalary) {
        this.commission = commission;
        this.baseSalary = baseSalary;
        this.orders  = new ArrayList<>();
    }

    public void addOrders(List<Order> orders){
        this.orders = orders;
    }



    public int getCommission() {
        return commission;
    }

    public void setCommission(int commission) {
        this.commission = commission;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public double calcGrossPay(int month, int year){


        int orderAmountOfGivenDate = getOrders().stream().filter(r->{
           return ((r.getOrderDate().getMonth().getValue()==month) && (r.getOrderDate().getYear()==year));
        }).mapToInt(Order::getOrderAmount).sum();

        System.out.println("ORDER DATE: "+month+"/"+year+" ,Amount :"+orderAmountOfGivenDate);
        return (double)((orderAmountOfGivenDate * (commission/100)) + baseSalary);
    }
}

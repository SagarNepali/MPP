package prob4C;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class PayrollCalculator {

    public static void main(String[] args) {




        List<Order> orderList = Arrays.asList(new Order(1, LocalDate.of(2021,12,01),100),
                new Order(11, LocalDate.of(2021,1,10),100),
                new Order(111, LocalDate.of(2021,1,11),100),
                new Order(1111, LocalDate.of(2021,11,25),100),
                new Order(11111, LocalDate.of(2021,11,9),100),
                new Order(111111, LocalDate.of(2021,12,20),100),
                new Order(1111111, LocalDate.of(2021,11,22),100));

        Commissioned commissioned = new Commissioned(2,5000);
        commissioned.addOrders(orderList);

        Employee[] employees = new Employee[] {
                new Hourly(12,20), new Commissioned(2,2000),commissioned, new Salaried(10000)
        };

        for(Employee e : employees){
            System.out.println(e.getClass().getSimpleName()+ " : ");
            e.calcCompensation(1,2021).print();
        }
    }
}

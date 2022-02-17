package prob4;

import java.time.LocalDate;
import java.util.List;

public class CustomerOrderFactory {

    public static Customer createCustomer(String name ){

        Customer customer = new Customer(name);
        return customer;
    }

    public static Order addOrders(Customer customer, LocalDate date, List<String> items){
        Order order = Order.newOrder(customer,date);
        items.stream().forEach( item -> order.addItem(item));
        return order;
    }

}

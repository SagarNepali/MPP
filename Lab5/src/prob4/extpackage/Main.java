package prob4.extpackage;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import prob4.Customer;
import prob4.CustomerOrderFactory;
import prob4.Order;


public class Main {
	public static void main(String[] args) {
		Customer cust = CustomerOrderFactory.createCustomer("Bob");
		List<String> items = Arrays.asList("Shirt","Laptop","Pants","Knife Set");
		CustomerOrderFactory.addOrders(cust,LocalDate.now(),items);
		System.out.println(cust.getOrders());
	}
}

		

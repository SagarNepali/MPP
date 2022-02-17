package prob3;

import prob5.Customer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Employee {
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	int salary;
	public Employee(String n, int s) {
		this.name = n;
		this.salary = s;
	}
	@Override
	public String toString() {
		return "[" + name + ", " + salary+"]";
	}
	
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>() {
			{
				add(new Employee("Joe", 50000));
				add(new Employee("Jim", 75000));
				add(new Employee("Tom", 80000));
				add(new Employee("Jim", 70000));
				add(new Employee("Steve", 55000));
				add(new Employee("Jim", 100000));
				add(new Employee("Joe", 59000));
				add(new Employee("Rich", 88000));
			}
		};


		Collections.sort(list,(o1,o2) ->{
				int nameCompare = o1.name.compareToIgnoreCase(o2.name);
				if (nameCompare != 0) {
					return nameCompare;
				} else {
					return o1.salary < o2.salary ? 1:-1;
				}
			}
		);
		//expected output:
		//[[Jim, 100000], [Jim, 75000], [Jim, 70000], [Joe, 59000], [Joe, 50000], [Rich, 88000], [Steve, 55000], [Tom, 80000]]
		System.out.println(list);

		System.out.println(list
				.stream()
				.sorted(Comparator.comparing((Employee e)-> e.getName())
						.thenComparing(a-> a.getSalary()==-1))
				.collect(Collectors.toList()));
	}

}


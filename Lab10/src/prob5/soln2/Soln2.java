package prob5.soln2;

import org.junit.Assert;
import org.junit.Test;
import prob5.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Soln2 {

    @Test
    public void testSalaryGreaterThan100000(){

        Assert.assertEquals(salaryGreaterThan100000(new Employee("A","B",120000)),true);
        Assert.assertEquals(salaryGreaterThan100000(new Employee("A","B",1200)),false);
    }

    @Test
    public void testLastNameAfterM(){
        Assert.assertEquals(lastNameAfterM(new Employee("HARI","NAMA",1)),true);
        Assert.assertEquals(lastNameAfterM(new Employee("HARI","AMA",1)),false);
    }

    @Test
    public void testFullNae(){
        Assert.assertEquals(getFullName(new Employee("FIRST","LAST",1)),"FIRST LAST");
        Assert.assertEquals(getFullName(new Employee("LAST","FIRST",1)),"LAST FIRST");
    }

    private static boolean salaryGreaterThan100000(Employee employee) {
        return salaryGreaterThan100000.test(employee);
    }

    private static  boolean lastNameAfterM(Employee e){
        return lastNameAfterM.test(e);
    }

    private static String getFullName(Employee e){
        return fullName.apply(e);
    }

    private static Predicate<Employee> salaryGreaterThan100000 = employee -> employee.getSalary()>100000;
    private static Predicate<Employee> lastNameAfterM = employee -> employee.getLastName().charAt(0) >'M';

    private static Function<Employee,String> fullName = employee -> employee.getFirstName()+" "+employee.getLastName();

    public static String asString(List<Employee> list){
        return list.stream()
                .filter(Soln2::salaryGreaterThan100000)
                .filter(Soln2::lastNameAfterM)
                .map(Soln2::getFullName)
                .sorted()
                .collect(Collectors.joining(", ")).toString();
    }

    public static  void printEmps(List<Employee> list){
        System.out.println(asString(list));
    }


}



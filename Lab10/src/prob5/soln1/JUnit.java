package prob5.soln1;

import org.junit.Assert;
import org.junit.Test;
import prob5.Employee;
import prob5.Main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JUnit {

    @Test
    public void asStringTest(){

        List<Employee> emps =  Arrays.asList(new Employee("Joe", "Davis", 120000),
                new Employee("John", "Sims", 110000)
               ).stream().collect(Collectors.toList());

        Assert.assertEquals(Main.asString(emps),"John Sims");
    }
}

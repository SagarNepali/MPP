package prob11b;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaLibrary {

    public static final TriFunction<List<Employee>,Double,Character,String> EMPLOYEE_WITH_HIGH_SALARY_AND_LAST_NAME_INITIAL_GREATER_THAN_M = (list,salary,ch) -> {
      return list.stream()
              .filter(employee -> employee.getSalary()>salary)
              .filter(employee -> employee.getLastName().charAt(0) > ch)
              .map(emp -> emp.getFirstName()+" "+emp.getLastName())
              .collect(Collectors.joining(","));
    };
}

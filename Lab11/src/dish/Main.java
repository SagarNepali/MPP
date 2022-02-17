package dish;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static final List<Dish> menu =
            Arrays.asList(new Dish("Pork",false,800, Dish.Type.MEAT),
                    new Dish("beef",false,700, Dish.Type.MEAT),
                    new Dish("chicken",false,500, Dish.Type.MEAT),
                    new Dish("french fries",true,530, Dish.Type.OTHER),
                    new Dish("rice",true,350, Dish.Type.OTHER),
                    new Dish("fruit",true,120, Dish.Type.OTHER),
                    new Dish("pizza",true,550, Dish.Type.OTHER),
                    new Dish("prawn",false,400, Dish.Type.FISH),
                    new Dish("salmon",false,450, Dish.Type.FISH)
            );

    public static void main(String[] args) {

        //1
        List<String> list = menu.stream()
                .filter(dish -> !dish.isVeg())
                .filter(dish -> dish.getCalories()>400)
                .map(dish -> dish.getName())
                .collect(Collectors.toList());
        System.out.println(list);

        //2
        menu.stream()
                .filter(dish -> !dish.isVeg())
                .filter(dish -> dish.getType().equals(Dish.Type.MEAT))
                .sorted(Comparator.comparing(Dish::getCalories).reversed())
                .limit(3)
                .collect(Collectors.toList()).forEach(System.out::println);

        //3
        System.out.println(menu.stream()
                .map(dish ->  dish.getName())
                .collect(Collectors.joining(", ")));

        //4
        System.out.println(menu.stream()
                .filter(dish -> dish.getName().equalsIgnoreCase("french fries"))
                .anyMatch(dish -> dish.isVeg()));

        //5
        System.out.println(menu.stream()
                .map(dish -> dish.getCalories())
                .reduce(Math::max)
                .orElse(0));

        interface TriFunction<S,T,U,V>{
            V apply(S s,T t,U u);
        }

        //6
        TriFunction<List<Dish>,String, Integer, List<String>> GET_MEAT_ITEMS_BY_NAME_AND_CALORIE
            = (list1,searchStr,calorie) -> {
            return list1.stream()
                    .filter(dish -> dish.getName().equals(searchStr))
                    .filter(dish -> dish.getCalories()==calorie)
                    .map(dish -> dish.getName())
                    .collect(Collectors.toList());
        };

        System.out.println(GET_MEAT_ITEMS_BY_NAME_AND_CALORIE.apply(menu,"beef",700));


        Predicate<Object> predicate =  new Predicate<Object>() {
            @Override
            public boolean test(Object o) {
                return this.equals(o);
            }
        };


    }
}

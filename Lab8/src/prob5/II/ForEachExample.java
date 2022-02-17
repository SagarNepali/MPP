package prob5.II;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEachExample {

    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("THIS");
        strList.add("MUST");
        strList.add("not");
        strList.add("APE");

        Consumer<String> consumer = new Consumer<String>() {
            String str ;
            @Override
            public void accept(String s) {
                str = s.toUpperCase();
                if(str.equals(s)){
                    System.out.println(s);
                }
            }
        };

        strList.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}

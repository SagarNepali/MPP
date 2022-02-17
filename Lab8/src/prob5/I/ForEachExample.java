package prob5.I;

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


        strList.forEach((s) -> {
            String str = s.toUpperCase();
            if(str.equals(s)) System.out.println(s);
        });
    }
}

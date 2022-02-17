package prob5;

import java.util.*;

public class Main {


    public static <T extends Comparable> T secondSmallest(List<T> nums){
        Collections.sort(nums);
        return (nums.size()>=2)? nums.get(1) : null;
    }

    public static void main(String[] args) {
        System.out.println(Main.secondSmallest(Arrays.asList(1,2,3,4,5,6,7)));

        System.out.println(Main.secondSmallest(Arrays.asList(1,2)));

        System.out.println(Main.secondSmallest(Arrays.asList(1)));
    }
}

package text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Implementor<intArrsStr> implements SubPredicate,Predicate {


    private String a;

    public void setA(String a){
        this.a = a;
    }

    public String getA(){
        return a;
    }

    List<String> list = Arrays.asList("A","B");


    public void sort(List<String>list,final Implementor a, final Object primitive){
        Collections.sort(list,(s1,s2) ->{
//            primitive = 0;
            a.setA("new");
            return s1.compareTo(s2);
        });
    }

    public static void main(String[] args) {


        ArrayList<ArrayList<String>> mainList = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<String>() {
            {
                add("hello");add("there");
            }
        };
        ArrayList<String> list2 = new ArrayList<String>() {
            {
                add("goodbye");add("there");
            }
        };
        mainList.add(list1);
        mainList.add(list2);
        System.out.println(combine(mainList.stream()));


        //Set up inputs
        List<Integer> ints = Arrays.asList(3,5,2,3,8);

        //Create a list of int[]s by mapping ints, as input lengths, to int[]
        //constructor
        List<int[]> intArrs = ints.stream()
                .map(int[]::new)
                .collect(Collectors.toList());

        //Represent each int[] in the list as a string so it can be printed,
        //mapping Arrays.toString to each int[] in the list
        List<String> intArrsStr = intArrs.stream()
                .map(Arrays::toString)
                .collect(Collectors.toList());
        System.out.println(intArrsStr);
    }

    <T> void printArray(T[] arr){
        for(T item: arr){
            System.out.println(item);
        }
    }

    static  <T> ArrayList<T> combine(Stream<ArrayList<T>> arrayListStream){
        return arrayListStream.reduce(new ArrayList<T>(),(x,y) -> {
             x.addAll(y);
             return x;
        });
    }

    @Override
    public boolean apply(Number n) {
        return false;
    }

    @Override
    public boolean apply(Integer n) {
        return false;
    }
}

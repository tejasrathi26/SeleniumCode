package src.main;

import java.util.*;
import java.util.stream.Collectors;

public class Streams{

    public static void main(String[] args) {

        String[] str = {"Tejas","Rathi","India","Country","Dharma","Hindu","Sanskrit"};

        List<String> ls = Arrays.stream(str).sorted().collect(Collectors.toList());
       // ls.forEach(s-> System.out.println(s));


        List<String> lst = Arrays.stream(str).collect(Collectors.toList());
        //lst.sorted().forEach(s-> System.out.println(lst));
        lst.stream().sorted().forEach(s1-> System.out.println(s1));

        double[] arr = {1,9,5,2,7,8,3,3,4.4,9.7,6,7,4,5,1};
        List<Double> i = Arrays.stream(arr).boxed().collect(Collectors.toList());
        //i.stream().distinct().sorted().forEach(s2-> System.out.println(s2));
        Collections.sort(i);
        Iterator itr = i.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

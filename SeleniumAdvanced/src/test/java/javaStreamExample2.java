import org.checkerframework.framework.qual.DefaultQualifier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class javaStreamExample2{

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Tejas","Rathi","Selenium","Java","Alexa","Takshshila","Texas");

        // To find list on names ending with letter a in uppercase and in sorted order
      //  names.stream().filter(s->s.endsWith("a")).sorted().map(s->s.toUpperCase()).forEach(s-> System.out.println(s));

        // To find list of names containing letter i in sorted order and in lowercase
      //  names.stream().filter(s->s.contains("i")).sorted().map(s->s.toLowerCase()).forEach(s-> System.out.println(s));

        // To find the first element in stream using Limit function
     //   names.stream().filter(s->s.startsWith("T")).sorted().limit(1).forEach(s-> System.out.println(s));

        List<String> names1 = new ArrayList<>();
        names1.add("Python");
        names1.add("Roller");
        names1.add("Java");

        // To merge 2 different Streams
        Stream<String> newStream = Stream.concat(names.stream(), names1.stream());
        //newStream.forEach(s-> System.out.println(s));

        // To find list of unique sorted names use below
       // newStream.distinct().sorted().forEach(s-> System.out.println(s));

        //To find any element is matching in the list
      /*  boolean flag = newStream.anyMatch(s->s.equalsIgnoreCase("Java"));
        System.out.println(flag);
        Assert.assertTrue(flag);    */

        // Examples of Collect - Finding the result and converting it back to list
        /*newStream.filter(s->s.contains("a")).sorted().map(s->s.toUpperCase()).collect(Collectors.toList())
                .forEach(s-> System.out.println(s));
*/
        int[] arr = {5,9,7,5,2,4,3,5,2,3,1,8};
        List<Integer> ls = Arrays.stream(arr).boxed().collect(Collectors.toList());
        ls.stream().distinct().sorted().forEach(s-> System.out.println(s));
       /* Integer var = ls.stream().distinct().min(Integer::compare).get();
        System.out.println(var);
*/
       /* String[] s = {"Rahul","Manish","Mahesh","Tejas","Kishan","Archit"};
        //List<String> str = Arrays.asList(s);
        List<String> str1 = Arrays.stream(s).collect(Collectors.toList());
        str1.stream().sorted().forEach(s1-> System.out.println(s1));
        System.out.println(str1);
*/
        String str = "This is Java Selenium Java Selenium Java interview";
        String[] s1 = str.split(" ");
        List<String> ls1 = Arrays.asList(s1);
        ls1.stream().distinct().forEach(s-> System.out.print(s+" "));





    }
}

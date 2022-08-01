import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class javaStreamExample1{

    public static void main(String[] args) {


        List<String> names = new ArrayList<String>();
        names.add("Tejas");
        names.add("Alexale");
        names.add("Takshshila");
        names.add("Aliya");
        names.add("Texas");

        /* Old Method of finding names starting with word T
        for(int i =0;i<names.size();i++){

            String name = names.get(i);
            if(name.startsWith("T")){
                System.out.println(name);
            }
        }*/
        //Sort using Collection Interface and using stream
        /*Collections.sort(names);
        names.stream().forEach(s-> System.out.println(s));*/

        // To find list of names starting with word T
        // names.stream().filter(s->s.startsWith("T")).forEach(s-> System.out.println(s));

        //To find list of names starting with word T in Uppercase
      /*  names.stream().filter(s->s.startsWith("T")).sorted().map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));*/

        //To find list of names which contains letter j and ending with s
     /*   names.stream().filter(s->s.contains("j")).filter(s->s.endsWith("s")).forEach(s-> System.out.println(s)); */

        //To find list of names having length greater than 5
        names.stream().filter(s->s.length()>5).sorted().forEach(s-> System.out.println(s));

        // to find count of words starting with letter T
        long c = names.stream().filter(s->s.startsWith("T")).count();
        System.out.println(c);
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaCollections{

    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Tejas");
        arr.add("Group");
        arr.add("Texas");
        arr.add(1,"Rathi");
        arr.add("France");
        arr.add(4,"Paris");
        System.out.println(arr);

        System.out.println(arr.get(2));
        System.out.println(arr.isEmpty());
        System.out.println(arr.size());
        System.out.println(arr.contains("Texas"));
        System.out.println(arr.remove(5));
        System.out.println(arr);


        ArrayList<Integer> in = new ArrayList<Integer>();
        in.add(3);
        in.add(6);
        in.add(9);
        in.add(10);
        in.add(12);
        in.add(15);
        System.out.println(in);
        List<Integer> ls = in.stream().collect(Collectors.toList());
        System.out.println(ls);

    }
}

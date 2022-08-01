import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SetCollection{

    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<String>();
        hs.add("USA");
        hs.add("India");
        hs.add("Australia");
        hs.add("Canada");
        hs.add("Greenland");
        hs.add("UK");
        System.out.println(hs);
        System.out.println(hs.size());
        System.out.println(hs.isEmpty());
        System.out.println(hs.contains("Canada"));
        System.out.println(hs.remove("UK"));

        Iterator<String> i = hs.iterator();
        System.out.println(i.next());
        while(i.hasNext()){
            System.out.println(i.next());
        }

        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Tejas");
        arr.add("Group");
        arr.add("Texas");
        arr.add(1,"Rathi");
        arr.add("France");
        arr.add(4,"Paris");

        HashSet<String> hs1 = new HashSet(arr);
        hs1.add("USA");
        hs1.add("India");
        hs1.add("Australia");
        hs1.add("Canada");

        System.out.println(hs1);
    }
}

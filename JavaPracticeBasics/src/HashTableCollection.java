import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTableCollection{

    public static void main(String[] args) {

        Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
        ht.put(1,"USA");
        ht.put(2,"India");
        ht.put(3,"Europe");
        ht.put(4,"Canada");
        ht.put(1,"China");
        System.out.println(ht);

        ht.replace(1,"Australia");
        System.out.println(ht);

        System.out.println(ht.size());
        //System.out.println(ht.remove(3));

        Set s = ht.entrySet();
        Iterator it = s.iterator();
        while(it.hasNext()){

            Map.Entry mp = (Map.Entry)it.next();
            System.out.println(mp.getKey());
            System.out.println(mp.getValue());
        }


    }
}

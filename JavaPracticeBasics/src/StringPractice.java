import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

public class StringPractice{

    static int i = 1;
    public static void main(String[] args) {

        /*String s = "Java,selenium,Interview,Roshani";
        String[] str = s.split(",");
        //System.out.println(str);
        for(int i=0;i<=str.length-1;i++){
            System.out.println(str[i]);
        }*/

     /*     String str = "This is Java Selenium Java Selenium Java interview";
      String[] s1 = str.split(" ");
        List<String> ls = Arrays.asList(s1);
        ls.stream().distinct().forEach(s-> System.out.print(" "+s));*/

       /* StringBuffer sb = new StringBuffer();
        str.chars().distinct().forEach(c -> sb.append((char) c));
        String DuplicateString = sb.toString();
        System.out.println("String after duplicates removed :"+DuplicateString);*/


     /* String str = "SSDRRRTTYYTYTR";

        HashMap<Character, Integer> hMap = new HashMap<>();
        for (int i = str.length() - 1; i>= 0; i--) {
            if (hMap.containsKey(str.charAt(i))) {
                int count = hMap.get(str.charAt(i));
                hMap.put(str.charAt(i), ++count);
            } else {
                hMap.put(str.charAt(i),1);
            }
        }
        System.out.println(hMap);*/
       /* String str = "Hello";
        int counter[] = new int[256];
        for (int i = 0; i < str.length(); i++) {
            counter[(int) str.charAt(i)]++;
        }
//print Frequency of characters
        for (int i = 0; i < 256; i++) {
            if (counter[i] != 0) {
//prints frequency of characters
                System.out.println((char) i + " --> " + counter[i]);
            }
        }*/
      /*  if (i <= 100)
            {
                System.out.printf("%d ", i++);
                main(null);
            }*/
      /*  int j=1;
        while(j<=100){
            System.out.println(j);
            j++;
        }*/

       /* String str = "My name is tejas";
        String tr="";
        String[] str1 = str.split(" ");
        for(int i =str1.length-1;i>=0;i--){
            //System.out.print(str1[i]);
            tr = tr  + str1[i] + " ";
        }
        System.out.print(tr);
        System.out.println(tr.length());
        System.out.println(tr.trim());
        System.out.println(tr.trim().length());*/

       /* String[] str1 = str.split(" ");
        for(int i =0;i< str1.length;i++){
            for(int j= str1[i].length()-1;j>=0;j--){
                System.out.print(str1[i].charAt(j));
            }
            System.out.print(" ");
        }*/

        String s1= "hello";
        String s2= "hello";
        if(s1==s2){
            System.out.println("equal");
        }else
            System.out.println("not equal");

        System.out.println(s1.concat("World"));


    }
}


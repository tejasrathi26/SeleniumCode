import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class InterviewPractice2{

    public static void main(String[] args) {

  /*      // 1. Sort Array and find max value
        int[] n = {2,1,9,15,7,4,8,3,6};
        List<Integer> ls = Arrays.stream(n).boxed().collect(Collectors.toList());
        ls.stream().sorted().forEach(s-> System.out.println(s));*/

     /*   // 2. Max Number
        Integer var = ls.stream().sorted().max(Integer::compare).get();
        System.out.println(var);*/

        //7. sort above integer array and print in reverse order
      /*  int[] n = {2,1,9,15,7,4,8,3,6};
        List<Integer> list= Arrays.stream(n).boxed().collect(Collectors.toList());
        list.stream().sorted(Comparator.reverseOrder()).forEach(s-> System.out.println(s));*/

        //3. Sort String Array
     /*   String[] str = {"Tejas","Archit","Madhur","Kishan","Tejas","Mahesh","Sanjay","Rahul","Manish","Mahesh"};
        List<String> list = Arrays.asList(str);
        list.stream().sorted().distinct().forEach(s-> System.out.println(s));*/

        //4. Min number from array
        /*int m[] = {6,4,9,1,1,5,3,7,8,2};
        List<Integer> ls2 = Arrays.stream(m).boxed().collect(Collectors.toList());
        Integer var = ls2.stream().min(Integer::compare).get();
        System.out.println(var);*/

        //5. Print duplicates letter from string
        /*String str = "SSDRRRTTYYTYTR";
        int count;
        char[] string = str.toCharArray();
        for (int i = 0;i<string.length-1;i++){
            count = 1;
            for (int j = i+1;j<string.length;j++){
                if(string[i]==string[j] && string[i]!=' '){
                    count++;
                    string[j]='0';
                }
            }
           if(count > 1 && string[i] != '0')
                System.out.println(string[i]);
        }*/

        //6. print unique letter in string - Not running
       /* String str = "SSDRRRTTYYTYTR";
        char[] ch = str.toCharArray();
        List<char[]> ls3 = Arrays.asList(ch);
        ls3.stream().sorted().distinct().forEach(s-> System.out.println(s));*/

        //8. find string containing i
       /* String[] str = {"Tejas","Archit","Madhur","Kishan","Tejas","Mahesh","Sanjay","Rahul","Manish","Mahesh"};
        List<String> str1 = Arrays.asList(str);
        str1.stream().filter(s->s.contains("i")).sorted().forEach(s-> System.out.println(s));*/

        //9. find string containing i in uppercase and lowercase
        String[] str = {"Tejas","Archit","Madhur","Kishan","Tejas","Mahesh","Sanjay","Rahul","Manish","Mahesh"};
        List<String> str1 = Arrays.asList(str);
        System.out.println(str[0]);
        /*str1.stream().filter(s->s.contains("e")).distinct().map(s->s.toUpperCase()).sorted().forEach(s-> System.out.println(s));
        str1.stream().filter(s->s.contains("e")).distinct().map(s->s.toLowerCase()).sorted().forEach(s-> System.out.println(s));*/

        //10. Occurrence of words in string
        /*String str = "SSDRRRTTYYTYTR";

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

        //11. Remove duplicate
        /*String string = "Big black bug bit a big black dog on his big black nose";
        int count;
        String str = string.toLowerCase();
        String[] str1 = str.split(" ");
        *//*List<String> ls = Arrays.asList(str1);
        ls.stream().distinct().forEach(s-> System.out.println(s));*//*
        for (int i = 0; i < str1.length; i++) {
            count = 1;
            for (int j = i + 1; j < str1.length; j++) {
                if (str1[i].equals(str1[j])) {
                    count++;
                    //Set words[j] to 0 to avoid printing visited word
                    str1[j] = "0";
                }
            }

            //Displays the duplicate word if count is greater than 1
            if (count > 1 && str1[i] != "0")
                System.out.println(str1[i]);
        }*/
        String arr[]={"global", "tcs", "cts" , "compucom"};
       /* for(int i=0;i<arr.length;i++){
            System.out.println(arr[i].startsWith("c"));
        }*/
       /* List<String> ls = Arrays.asList(arr);
        ls.stream().filter(s->s.startsWith("c")).forEach(s->System.out.println(s));
*/
       /* int array[] = {7, 5, 4, 2 , 1, 6};
        List<Integer> ls = Arrays.stream(array).boxed().collect(Collectors.toList());
        Integer i = ls.stream().max(Integer::compare).get();
        System.out.println(i);*/




    }
}


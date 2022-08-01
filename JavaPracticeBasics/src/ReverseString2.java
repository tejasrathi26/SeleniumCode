public class ReverseString2 {

    public static void main(String[] args) {

        //String s = "I love my country";

        //Solution 1

        /* String reverse="";
        for(int i = s.length()-1;i>=0;i--){
            reverse = reverse + s.charAt(i);
           // System.out.println(s.charAt(i));
        }
        System.out.println(reverse);
    }*/

        // Solution 2

        /*StringBuilder sb = new StringBuilder();
        sb.append(s);
        System.out.println(sb.reverse());*/

        // Solution 3
/*
        StringBuffer sb1= new StringBuffer();
        sb1.append(s);
        System.out.println(sb1.reverse());*/

       /* String[] arr = s.split(" ");
        for(int i = 0; i<arr.length;i++){ //I, LOve,my ,Country
            for(int j=arr[i].length()-1;j>=0;j--){ //LOve
                System.out.print(arr[i].charAt(j)); // evol
            }
            System.out.print(" ");
        }*/

      /*  String[] arr = s.split(" ");
        for(int i = arr.length-1;i>=0;i--){
            for(int j = arr[i].length()-1;j>=0;j--) {
                System.out.print(arr[i].charAt(j));
            }
            System.out.print(" ");
        }*/

        /*String str1= "Welcome";
        String str2 = "to";
        String str3 = "India";
        System.out.println(str1+" "+str2+" "+str3);
*/
        String str4 = "MalayalaM";
        String str5 = "";
        for (int i = 0, j = str4.length() - 1; i <= str4.length() && j >= 0; i++, j--) {
            str5 = str5 + str4.charAt(j);
        }
        if (str4.equals(str5)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palidrome");
        }

       /* String s1 = "Ind12ia45";
        String ss = "";
        String in = "";
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) > 64) {
                ss += s1.charAt(i);
            } else {
                in = in + s1.charAt(i);
            }
        }
        System.out.println(ss + "my" + in);
*/

       /* String[] s={"Sachin","Tejas","Sanjiv","sanket"};
        for(int i=0;i<s.length;i++){
            System.out.println(s[i].startsWith("Sa"));//true
          //  System.out.println(s.endsWith("n"));//true*/
    }


}

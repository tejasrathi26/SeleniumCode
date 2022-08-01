public class coreJavaBrushup3{

    public static void main(String[] args) {

        //String Literal
        String s = "Rahul Shetty Academy";
        String s1 = "Rahul Shetty Academy";

        // By New Keyword
        String s2 = new String("Welcome");
        String s3 = new String("Welcome");

        String[] splittedString = s.split("Shetty");
        System.out.println(splittedString[0]);
        System.out.println(splittedString[1]);
        //System.out.println(splittedString[2]);
        System.out.println(splittedString[1].trim());
        //Print String
        /*for(int i =0;i< s.length();i++){

            System.out.println(s.charAt(i));
        } */
        // Reverse a string
        for(int i = s.length()-1; i>=0 ;i--){

            System.out.println(s.charAt(i));
        }


    }
}

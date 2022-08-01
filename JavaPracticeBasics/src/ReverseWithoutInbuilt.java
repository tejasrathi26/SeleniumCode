public class ReverseWithoutInbuilt {

    public static void main(String[] args) {

        String str = "Madam";
        String str2 ="";

        for(int i=str.length()-1,j= 0;i<=0 && j<str.length();i--,j--){
            str2 = str2+ str.charAt(i);
                }
        if(str2 == str){
            System.out.println("Palindrome");}
        else{
            System.out.println("Not Palindrome");}
    }
        }



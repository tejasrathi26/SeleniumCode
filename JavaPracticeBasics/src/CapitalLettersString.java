public class CapitalLettersString{

    public static void main(String[] args) {

        String str = "I LoVe mY IndiA";
        String str1 = "i love my india";

        System.out.println(str.toUpperCase());

        System.out.println(str.toLowerCase());

        String[] str2 = str.split(" ");
        //String[] str2 = str1.split(" ");
        String result = "";

        for(String word : str2){

            String firstLetter = word.substring(0,1);
            String remainingLetter = word.substring(1);
           // result+=firstLetter.toUpperCase()+remainingLetter;
            result+=firstLetter.toUpperCase()+remainingLetter.toLowerCase();

        }
        System.out.println(result);
    }
}

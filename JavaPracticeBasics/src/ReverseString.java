public class ReverseString{


    public static void main(String[] args) {

        String s = "I Love my India";
        String[] arr = s.split(" ");
        //System.out.println(arr[0]);

        /*for(int i = 0;i< arr.length;i++){
            for(int j = arr[i].length()-1;j>=0;j--){
                System.out.print(arr[i].charAt(j));
            }
            System.out.print(" ");
        }*/
        for(int i =arr.length-1;i>=0;i--) {
            for (int j = arr[i].length() - 1; j >= 0; j--) {
                System.out.print(arr[i].charAt(j));
            }
            System.out.print(" ");
        }
       /* StringBuilder str = new StringBuilder();
        str.append(s);

        str.reverse();
        System.out.println(str);
*/
    }
}

public class ReverseNumber{

    public static void main(String[] args) {

        int number = 894567;
        int reverse=0;
        while(number!=0){
            int remainder = number%10;
            reverse = reverse*10 + remainder ;
            number = number/10;
        }
        System.out.println(reverse);

        String str = "I Love my India";
        String[] arr = str.split(" ");
        for(int i = 0;i<arr.length;i++){
            for(int j=arr[i].length()-1;j>=0;j--){
                System.out.print(arr[i].charAt(j));
            }
            System.out.print(" ");
        }
    }
}

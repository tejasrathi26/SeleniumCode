public class Loops{

    public static void main(String[] args) {

        int i = 1;
        while(i<=10){
            if(i==5){
                i++;
                break;
            }
            System.out.println(i);
            i++;
        }

        int j = 1;
        while(j<=10){
            if(j==1){
                j++;
                continue;
            }
            System.out.println(j);
            j++;
        }
    }
}

import java.util.Scanner;

public class OddNumber{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter l");
        int l = sc.nextInt();
        System.out.println("Enter r");
        int r = sc.nextInt();
        Result rt= new Result();
        rt.oddNumbers(l,r);
        String s= sc.nextLine();
    }
}

class Result{

    public void oddNumbers(int l, int r){

        for(int i = l;i<r;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }

    }
}

public class NumberPrograms{

    public static void main(String[] args) {

        //1. Factorial Number
       /* int fact=1,number=5;
        for(int i =1;i<=number;i++){
            fact = fact*i;
        }
        System.out.println(fact);*/

        //2. Palindrome Number
        int num = 98765;
        int remainder,temp,sum=0;
        temp=num;
        while (num!=0){
            remainder=num%10;
            sum = (sum*10) + remainder;
            num=num/10;
        }
        System.out.println(sum);
        if(temp==sum){
            System.out.println("Palindrome Number");
        }else
            System.out.println("Not Palindrome Number");


        // 3. Prime Number from 1 to 100
        /*for(int num =2;num<=100;num++) {
            boolean flag=true;
            for (int i = 2; i <= num / 2; i++) {
                // condition for nonprime number
                if (num % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                System.out.println(num + " is a prime number.");
            else
                System.out.println(num + " is not a prime number.");
        }*/

        //4. Prime number single
        /*int num = 39;
        for(int i=2;i<=num/2;i++){
            boolean flag = true;
            if(num%i == 0){
                flag = false;
                break;
            }
            if(flag)
                System.out.println(num + " is Prime Number");
        }*/

        //5. Fibnocii series
        /*int num = 10;
        int n1=0,n2=1,n3;
        System.out.println(n1+" "+n2);
        for(int i = 2;i<=num;i++){
            n3=n1+n2;
            System.out.println(n3);
            n1=n2;
            n2=n3;
        }*/

        //6. Armstrong Number
       /* int number = 371, originalNumber, remainder, result = 0;
        originalNumber = number;
        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");*/



    }
}

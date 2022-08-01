import OopsConcept.Student;

public class StarPyramidProgram{

    static int n =1;
    public static void main(String[] args) {

        Student s4 = new Student(7,"Shreyas");
        s4.display();
        //Print Steps pyramid 1
/*
        for (int i=0;i<=5;i++){
            for (int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

   // print Steps pyramid 2
        int num = 5;
        int stars =1;
        for(int i =0;i<num;i++){
            for (int j=num-1;j>i;j--){
                System.out.print(" ");
            }
            for (int k=0;k<stars;k++){
                System.out.print("*");
            }
            stars += 2;
            System.out.println();
        }
        // Print Steps pyramid 3
        /*for(int i=5;i>0;i--){
            for(int j = 0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

// Print numerical steps pyramid 4
       /* for(int i =1;i<6;i++){
            for(int j=1;j<i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }*/

     //   Print Reverse numerical steps pyramid 4
     /*   for(int i=5;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print(j);
            }
            System.out.println();
        }*/

       // Print numerical steps of same number in single line e.g 1 22 333 4444 55555
      /* for(int i =1;i<=5;i++){
           for(int j =0; j<i; j++){
               System.out.print(i);
           }
           System.out.println();
       }*/

        // Print numerical steps of same number in single line e.g 55555 4444 333 22 1
      /*  for(int i =5;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print(i);
            }
            System.out.println();
        }*/

        // TO print character steps pyramid e.g. A AA AAA AAAA AAAAA
     /*   for(int i=1;i<6;i++){
            for(int j=0;j<i;j++){
                System.out.print("A");
            }
            System.out.println();
        }*/
        // To print characters in steps pyramid
      /*  char i,j;
        for(i='A';i<='E';i++){
            for(j='A';j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }*/

        //To Print above pyramid from bottom to up reverse character steps e.g. ABCDE ABCD ABC AB A
    /* for(int i=5;i>0;i--){
         for(int j=0;j<i;j++){
             System.out.print((char)(j+65));
         }
         System.out.println();
     }*/
        // To Print reverse character pyramid
        /*for(int i=1;i<6;i++){
            for(int j=5;j>=i;j--){
                System.out.print((char)(j+64));
            }
            System.out.println();
        }*/

        //To Print charater pyramid ascending to descending
/*        for(int i=1;i<=5;i++){
            for(int j=0;j<i;j++){
                System.out.print((char)(65+j));
            }
            System.out.println();
        }*/

        /* To Print characters ABCDE 5 times
        int i=5;
        int k=1;
        while (k<=5) {
            for (int j = 0; j < i; j++) {
                System.out.print((char) (65 + j));
            }
            System.out.println();
            k++;
        }  */

         /* To Print characters EDCBA 5 times
        int i=5;
        int k=1;
        while (k<=5) {
            for (int j = 5; j >=1; j--) {
                System.out.print((char) (64 + j));
            }
            System.out.println();
            k++;
        } */

        /* To print numbers pyramid steps 5 54 543 5432 54321
        for(int i=5;i>=1;i--){
            for(int j=5;j>=i;j--){
                System.out.print(j);
            }
            System.out.println();
        } */

        //To print 5 45 345 2345 12345
     /*   for(int i=6;i>1;i--){
            for (int j=i-1;j<=5;j++){
                System.out.print(j);
            }
            System.out.println();
        }*/
        /*int n = 2;
        for(int i=0;i<5;i++){
            for(int j=2;j<=n;j++){
                if(j%2==0){
                    System.out.print(j);
                }
            }
            n=n+2;
            System.out.println();
        } */

       /* for(int i = 0;i<4;i++){
            for(int j=0;j<=i;j++) {
                System.out.print(n);
                n++;
            }
            System.out.println();
        }*/
    }
}

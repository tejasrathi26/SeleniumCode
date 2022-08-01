public class JavaPracticeBasics2{

    public static void main(String[] args) {
      /* To print 1 to 10 numbers
        int i =0;
        do {
            // Executes block of code at least once
            System.out.println(i);
            i++;
        }while(i>10);*/

        //To Print even numbers using do while
      /*  for(int j=0;j<20;j++){
            do{
                System.out.println(j);
                j++;
            }while (j%2==0);
        }*/

        /* To Print 1234 567 89 10
        int n = 1;
        for(int i =4;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print(n);
                System.out.print("\t");
                n++;
            }
            System.out.println();
        }*/

        int n=1;
        for(int i=1;i<4;i++){
            for(int j=0;j<i;j++){
                System.out.print(n*3);
                System.out.print("\t");
                n++;
            }
            System.out.println();
        }
    }
}

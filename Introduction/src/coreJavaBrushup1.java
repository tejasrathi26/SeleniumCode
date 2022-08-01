public class coreJavaBrushup1 {

    public static void main(String[] args) {

        int n = 5;
        String str = "Tejas Rathi";
        double f = 3.57;
        boolean mycard = true;
        char letter = 't';

        System.out.println(n);
        System.out.println(str + " is a Java Learner");

        // 1st way to initialize array in java
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 6;
        arr[2] = 4;
        arr[3] = 3;
        arr[4] = 2;

        System.out.println(arr[4]);

        // 2nd way to initialize array in java
        int[] arr2 = {1,6,4,5,3};
        System.out.println(arr2[3]);

        int arr3[] ={1,9,8,6,4};
        System.out.println(arr3[2]);

        for(int i:arr3){
            System.out.println(i);
        }
        System.out.println("Different Array Below");
        for(int j=0; j<arr2.length; j++){

            System.out.println(arr2[j]);
        }

        String[] name = {"Tejas", "Rathi", "Selenium", "Java", "Python"};
        for (int i=0; i< name.length; i++) {
            System.out.println(name[i]);
        }

        for (String s: name){
            System.out.println(s);
        }
    }
}

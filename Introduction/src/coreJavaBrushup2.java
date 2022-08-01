import java.util.ArrayList;

public class coreJavaBrushup2 {

    public static void main(String[] args) {

        int[] arr2 ={2,4,1,3,8,4,7,55,58,61,23,11,22};

        //To find multiples of 2
        for(int i= 0;i<arr2.length;i++) {
            if (arr2[i] % 2 != 0) {
                System.out.println(arr2[i]);
            }
        }
        ArrayList<String> a = new ArrayList<String>();
        a.add("Tejas");
        a.add("Rathi");
        a.add("Learning");
        a.add("Java");
        a.add("Selenium");
        System.out.println(a.get(4));
    }
}

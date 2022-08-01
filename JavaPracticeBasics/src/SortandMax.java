import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortandMax{

    public static void main(String[] args) {
        /*int array[] = {0, 0, 1, 1 , 0, 0,1,1};
        int temp;
        for(int i=0; i<array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for(int a:array)
        {
            System.out.println(a+" ");
        }
        System.out.println("----------------");
        System.out.println(array[array.length-1]);*/


       /* int a[] = {5,0,6,1,0,2,0,0,7,3,11,0,8};
        List<Integer> ls = Arrays.stream(a).boxed().collect(Collectors.toList());
        ls.stream().sorted(Comparator.reverseOrder()).forEach(s-> System.out.println(s));*/
      /* Arrays.sort(a);
       for(int n:a){
            System.out.println(n+" ");
        }*/

        //Find max number
       /* int a[] = {5,0,6,1,0,2,-2,0,0,7,3,11,0,8};
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println(max);*/

        // Descending Order
        int array[] = {0, 0, 1, 1 ,5, 0, 0,1,1};
        int temp;
        for(int i=0; i<array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[i]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for(int a:array)
        {
            System.out.println(a+" ");
        }
        System.out.println("----------------");
        System.out.println(array[array.length-1]);

        // Min Number
       /* int a[] = {5,0,6,1,0,2,-2,0,0,7,3,11,0,8};
        int min=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println(min);*/
    }
}

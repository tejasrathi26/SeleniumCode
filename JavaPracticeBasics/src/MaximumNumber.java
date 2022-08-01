public class MaximumNumber{

    public static void main(String[] args) {

        int a[] = {20, 160, 70, 100, 123, 10};
        int max = a[0];
        for (int i = 0; i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println("max num is " +max);
    }
}

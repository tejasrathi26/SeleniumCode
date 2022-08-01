public class FibnociiSeries {
    //0,1,1,2,3,5,8,13,21,34,55
    public static void main(String[] args) {

        int n1 = 0;
        int n2 = 1;
        int n3, i;
        int count = 12;
        System.out.println(n1+"\n"+n2);
        for(i=0;i<count;i++){
            n3 = n1 +n2;
            System.out.println(""+n3);
            n1=n2; //5
            n2=n3; //8

        }
    }
}

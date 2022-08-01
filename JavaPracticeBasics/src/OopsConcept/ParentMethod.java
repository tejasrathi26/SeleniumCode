package OopsConcept;

public class ParentMethod{

    private int areaRectangle(int l,int b){
        return l*b;
    }

    public static void main(String[] args) {

        ChildMethod c1=new ChildMethod();
        int sq = c1.square(5);
        System.out.println(sq);
        System.out.println(c1.cube(4));

        System.out.println(c1.areaRectangle(7,5));
        ParentMethod p1= new ParentMethod();
        int area = p1.areaRectangle(8,5);
        System.out.println(area);
    }
}

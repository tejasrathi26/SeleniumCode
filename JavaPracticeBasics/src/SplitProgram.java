import java.awt.*;
import java.util.Arrays;
import java.util.List;

public class SplitProgram{

    static String s1 = "qwerty";
    public static void main(String[] args) {

        String str = "Tejas Kiran Rathi";
        String[] s = str.split(" ");
        List l = Arrays.asList(s);
        System.out.println(l);
        System.out.println(s1.length());
        for(int i =0;i<s.length;i++){
            System.out.println(s[i]);
        }
    }


}

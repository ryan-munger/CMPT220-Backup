import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String args[]) {
        ArrayList<String> al = new ArrayList<>();
        al.add("String 1");
        al.add("String 2");
        al.add("String 3");
        al.remove("String 3");
        al.add("String 3");
        al.add(2, "New String");

        System.out.println(al);

        // Now with arrays
        String[] sa = new String[4];
        sa[0] = "String 1";
        sa[1] = "String 2";
        sa[2] = "String 3";
        sa[2] = null;
        sa[2] = "String 3";
        sa[3] = sa[2];
        sa[2] = "New String";

        System.out.print("[");
        for (int i = 0; i < 4; i++) {
            System.out.print(sa[i] + ", ");
        }
        System.out.println("]");

        // ArrayList for numbers
        ArrayList<Integer> ali = new ArrayList<>();
        ali.add(3);
        ali.add(150);
        ali.add(4);
        System.out.println(ali);
    }
}

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(100000);
        list.add(3);
        list.add(10);
        list.add(115);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++)
            list.add(i);
        long end = System.currentTimeMillis();
        System.out.println("Elapsed time: " + (end - start));
        // System.out.println(list);

        List<Integer> list2 = new LinkedList<>();
        list2.add(3);
        list2.add(10);
        list2.add(1, 15);
        start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++)
            list2.add(i);
        end = System.currentTimeMillis();
        System.out.println("Elapsed time: " + (end - start));
    }
}
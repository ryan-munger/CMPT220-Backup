import java.util.LinkedHashSet;

public class Problem1 {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        // Build the sets
        LinkedHashSet<String> set1 = new LinkedHashSet<>();
        set1.add("George");
        set1.add("Jackie");
        set1.add("John");
        set1.add("Lisa");
        set1.add("Tim");
        set1.add("Michelle");

        LinkedHashSet<String> set2 = new LinkedHashSet<>();
        set2.add("George");
        set2.add("Katie");
        set2.add("Kevin");
        set2.add("Michelle");
        set2.add("Ryan");

        // display the sets
        System.out.print("Set 1 is: ");
        for (String s1 : set1)
            System.out.print(s1 + ", ");
        System.out.print("\nSet 2 is: ");
        for (String s2 : set2)
            System.out.print(s2 + ", ");

        
        // display the union (unique elements when combined)
        LinkedHashSet<String> union = new LinkedHashSet<>();
        union = (LinkedHashSet<String>) set1.clone();
        union.addAll(set2);
        System.out.print("\nThe union of the sets is: ");
        for (String u : union)
            System.out.print(u + ", ");

        // find the set difference (elements in set1 that are not in set2)
        LinkedHashSet<String> difference = new LinkedHashSet<>();
        difference = (LinkedHashSet<String>) set1.clone();
        difference.removeAll(set2);
        System.out.print("\nThe difference of the sets is: ");
        for (String d : difference)
            System.out.print(d + ", ");

        // find the elements the sets have in common and display the intersection
        LinkedHashSet<String> intersect = new LinkedHashSet<>();
        intersect = (LinkedHashSet<String>) set1.clone();
        intersect.retainAll(set2);
        System.out.print("\nThe intersection of the sets is: ");
        for (String i : intersect)
            System.out.print(i + ", ");
    }
}

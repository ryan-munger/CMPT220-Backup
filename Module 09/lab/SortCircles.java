import java.util.ArrayList;
import java.util.Collections;

public class SortCircles {
    public static void main(String[] args) {
        ArrayList<Circle> circles = new ArrayList<>();
        circles.add(new Circle(5));
        circles.add(new Circle(20));
        circles.add(new Circle(6));
        circles.add(new Circle(100));
        circles.add(new Circle(55));

        System.out.println(circles);
        Collections.sort(circles);
        System.out.println(circles);
    }
}

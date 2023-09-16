import java.util.ArrayList;
import java.util.List;

public class Main5 {
    public static void main(String[] args) {
        // arrays: collection similar data type
//        int[] marks = new int[]{50, 60, 80, 76, 65, 60};
//        // print all the elements
//        for (int i = marks.length - 1; i >= 0; i--) {
//            System.out.println(marks[i]);
//        }
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(10);
        list.add(30);
        list.add(10);
        list.add(10);
        list.add(10);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
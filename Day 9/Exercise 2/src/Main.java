import java.util.*;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(3, 4);
        Point p2 = new Point(3, 4);
//        System.out.println("p1.equals(p2): expected true; actual " + p1.equals(p2));


        List<Point> list = new ArrayList<>();
        list.add(p1);
//        System.out.println("list.contains(p2): expected true; actual " + list.contains(p2));

        HashSet<Point> hashPoint = new HashSet<>();
        hashPoint.add(new Point(5,6));
        hashPoint.add(new Point(7,8));

        LinkedHashSet <Point> linkedPoint = new LinkedHashSet<>();
        linkedPoint.add(new Point(9, 12));
        linkedPoint.add(new Point(1, 2));

//        System.out.println(hashPoint);
//        System.out.println(linkedPoint);

        Set<Point> set1 = new LinkedHashSet<>();
        set1.add(p1);
//        System.out.println("set1.contains(p2): expected true; actual " + set1.contains(p2));

        TreeSet<Point> treeSet1 = new TreeSet<>();
        treeSet1.add(p1);
        treeSet1.add(new Point(5,5));
        treeSet1.add(new Point(10,8));
//        System.out.println(treeSet1);

        Set<Point> set2 = new TreeSet<>();
        set2.add(p1);
        System.out.println("set2.contains(p2): expected true, actual " + set2.contains(p2));

        set2.add(new Point(7, 8));
        set2.add(new Point(8, 9));
        Point p3 = new Point(11, 12);
        p1.moveTo(p3);

//        System.out.println("After p1.moveTo(p3): list.contains(p1) is " + list.contains(p1)); // true
//        System.out.println("After p1.moveTo(p3): list.contains(p2) is " + list.contains(p2)); // false
//        System.out.println("After p1.moveTo(p3): list.contains(p3) is " + list.contains(p3)); // true
//
        System.out.println("After p1.moveTo(p3): set1.contains(p1) is " + set1.contains(p1)); // false
        System.out.println("After p1.moveTo(p3): set1.contains(p2) is " + set1.contains(p2)); // false
        System.out.println("After p1.moveTo(p3): set1.contains(p3) is " + set1.contains(p3)); // false
//
        System.out.println("After p1.moveTo(p3): set2.contains(p1) is " + set2.contains(p1)); // false
        System.out.println("After p1.moveTo(p3): set2.contains(p2) is " + set2.contains(p2)); // false
        System.out.println("After p1.moveTo(p3): set2.contains(p3) is " + set2.contains(p3)); // false


    }
}

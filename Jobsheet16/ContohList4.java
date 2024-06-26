package Jobsheet16;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class ContohList4 {
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add("Cireng");
        System.out.printf("Element at index 0: %d, total elements: %d last element: %s\n",
                l.get(0), l.size(), l.get(l.size() - 1));
        l.add(4);
        l.remove(0);

        System.out.printf("Element at index 0: %d, total elements: %d, last element: %s\n",
                l.get(0), l.size(), l.get(l.size() - 1));

        List<String> names = new LinkedList<>();
        names.add("Noureen");
        names.add("Akhleema");
        names.add("Shannum");
        names.add("Uwais");
        names.add("Al-Qarni");

        System.out.printf("Element at index 0: %s, total elements: %s, last element: %s\n",
                names.get(0), names.size(), names.get(names.size() - 1));

        names.set(0, "My kid");
        System.out.printf("Element at index 0: %s, total elements: %s, last element: %s\n",
                names.get(0), names.size(), names.get(names.size() - 1));

        System.out.println("Names: " + names.toString());
    }
}
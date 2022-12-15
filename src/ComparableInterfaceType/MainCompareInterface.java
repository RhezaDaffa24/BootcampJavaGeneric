package ComparableInterfaceType;



import java.util.Arrays;
import java.util.Comparator;

public class MainCompareInterface {
    public static void main(String[] args) {
        person1[] people = {
                new person1("eko","Indonesia"),
                new person1("Siti","Indonesia"),
                new person1("Jindu","Indonesia")
        };
        System.out.println("Comparable :");
        Arrays.sort(people);
        System.out.println(Arrays.toString(people));

        Comparator<person1> comparator = new Comparator<person1>() {
            @Override
            public int compare(person1 o1, person1 o2) {
                return o1.getAddress().compareTo(o2.getAddress());
            }
        };
        System.out.println("Comparator : ");
        Arrays.sort(people,comparator);
        System.out.println(Arrays.toString(people));
    }

}

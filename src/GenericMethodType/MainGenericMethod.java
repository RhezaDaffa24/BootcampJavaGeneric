package GenericMethodType;

public class MainGenericMethod {
    public static void main(String[] args) {
        String[] name = {"eko","joko","siti","John","federick","Kennedy"};
        Integer[] values = {1,2,3,4,4,5,5,6,7,8,9,10};

        System.out.println(GenericMethodtes.<String>count(name));
        System.out.println(GenericMethodtes.count(values));
    }
}

package WildCardType;

public class MainWildcard {
    public static void main(String[] args) {
        printLength(new WildCardtes<>(100));
        printLength(new WildCardtes<>("eko"));
        printLength(new WildCardtes<>(true));
        printLength(new WildCardtes<>(100.456));
    }

    private static void printLength(WildCardtes<?> data) {
        System.out.println(data.getData());
    }
}

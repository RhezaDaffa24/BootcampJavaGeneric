package InvariantType;

public class MainInvariant {
    public static void main(String[] args) {
        InvariantClass<String> dataString = new InvariantClass<>("Eko");
//        InvariantClass<Object> dataObject = dataString; //error

        InvariantClass<Object> data = new InvariantClass<>(100);
//        InvariantClass<Integer> dataInteger = data; //error

        //error terjadi karena invariant type tidak bisa mensubtitusi parent dengan parameter child
    }
}

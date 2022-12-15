package MultipleParamsType;

public class MainMultipleParams {
    public static void main(String[] args) {
        MultipleParamsTes<String,Integer> pair = new MultipleParamsTes<String,Integer>("Eko",134);

        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}

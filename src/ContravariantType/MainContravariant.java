package ContravariantType;

public class MainContravariant {
    public static void main(String[] args) {
        ContravariantTes<Object> objectContravariantTes = new ContravariantTes<>("eko");
        ContravariantTes<? super Integer> myData = objectContravariantTes;
        process(myData);
        System.out.println(myData);
    }
// Untuke melihat perubahan bisa melalui debugging
    public static void process(ContravariantTes<? super Integer> myData){
        myData.setData(1345135);
    }
}

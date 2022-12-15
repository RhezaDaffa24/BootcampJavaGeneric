package CovariantType;

public class MainCovariant {
    public static void main(String[] args) {
        CovariantTes<String> data = new CovariantTes<>("eko");
        process(data);
    }
    public static void process(CovariantTes<? extends Object> data){
        Object object = data.getData();
//        data.setData("Testing");// error
        // Hanya read-only sehingga tidak bisa menggunakan setData()
    }
}

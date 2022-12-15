package Boundedtype;

public class MainBoundedType {
    public static void main(String[] args) {



        NumeberData<Integer> integerNumeberData = new NumeberData<>(100);


        //error
        // Karena data t hanya bounded atau terikat dengan number
        // untuk membenarkannya bisa dengan meng extend String <T extends String>
//        NumeberData<String> stringNumeberData = new NumeberData<String>("eko");

    }
    public static class NumeberData<T extends Number>{
        private T data;

        public NumeberData(T data) {
            this.data = data;
        }
    }
}

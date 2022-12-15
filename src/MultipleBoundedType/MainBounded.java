package MultipleBoundedType;

public class MainBounded {
    public static void main(String[] args) {


    }


    public static interface CanSayHello {
        void sayHello(String name);
    }

    public static abstract class Employee {

    }

    public static class Manager extends Employee implements CanSayHello {

        @Override
        public void sayHello(String name) {

        }
    }

    public static class Vicepresident extends Employee implements CanSayHello {
//        var manager = new Data<Manager>(new Manager());
//        var vp = new Data<Vicepresident>(new Vicepresident());

        @Override
        public void sayHello(String name) {

        }
    }

    public static class Data<T extends Employee & CanSayHello> {
        private T data;

        public Data(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }
}

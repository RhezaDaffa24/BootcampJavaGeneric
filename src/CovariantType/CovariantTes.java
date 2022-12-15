package CovariantType;

public class CovariantTes <T>{
    private T data;

    public CovariantTes() {
    }

    public CovariantTes(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data =  data;
    }
}

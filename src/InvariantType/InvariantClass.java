package InvariantType;

public class InvariantClass <T>{
    private T data;

    public InvariantClass() {
    }

    public InvariantClass(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

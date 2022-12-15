package ContravariantType;

public class ContravariantTes<T> {
    private T data;

    public ContravariantTes() {
    }

    public ContravariantTes(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

package WildCardType;

public class WildCardtes <T>{
    private T data;

    public WildCardtes() {
    }

    public WildCardtes(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

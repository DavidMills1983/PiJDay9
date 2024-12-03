public class Box<T>{
    private T data;

    public Box(T data){
        this.data = data;
    }

    public T getData(){
        return this.data;
    }

    public T setData(T data){
        this.data = data;
        return this.data;
    }

}

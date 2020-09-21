package Ex1;

public class Revers<T> {
    private T[] arr;

    public Revers (T[] given){
        this.arr = given;
    }

    public T[] reverse (){

        T[] result = null;

        if(arr != null && arr.length > 1){
            result = arr.clone();
            for(int i = 0; i<arr.length; i++){
                result[i] = arr[arr.length-(i+1)];
            }
        } else {
            result = arr;
        }

        return result;
    }
}

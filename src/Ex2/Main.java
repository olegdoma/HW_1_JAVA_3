package Ex2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Integer[] inputArray = {1, 2, 3};

        Converter<?> converter = new Converter<>(inputArray);
        ArrayList<?> converted = converter.convert();

        if(converted instanceof ArrayList<?>){
            System.out.println(converted);
           }
    }
}

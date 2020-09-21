package Ex1;

public class Main {
    public static void main(String[] args){
        Integer[] integerArray = {1, 2, 3};
        String[] stringArray = {"Кошка", "Собака", "Черепаха"};

        Revers<Integer> revers = new Revers<Integer>(integerArray);
        Integer[] reversed = revers.reverse();

        System.out.println(reversed[0]);
        System.out.println(reversed[1]);
        System.out.println(reversed[2]);

        Revers<String> reverserString = new Revers<String>(stringArray);
        String[] reversedStr = reverserString.reverse();

        System.out.println(reversedStr[0]);
        System.out.println(reversedStr[1]);
        System.out.println(reversedStr[2]);


    }


}

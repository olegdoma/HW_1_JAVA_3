package Ex3;

public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Orange orange = new Orange();
        Box<Apple> appleBox1 = new Box<>();
        Box<Apple> appleBox2 = new Box<>();
        Box<Orange> orangeBox1 = new Box<>();
        Box<Orange> orangeBox2 = new Box<>();

        System.out.println(appleBox1.getWeight());
        appleBox1.addFruit(apple);
        System.out.println(appleBox1.getWeight());
        System.out.println(orangeBox1.getWeight());
        orangeBox1.addFruit(orange);
        System.out.println(orangeBox1.getWeight());
        System.out.println(appleBox1.compare(appleBox2));
        System.out.println(appleBox1.compare(orangeBox1));
        appleBox1.pourOver(appleBox2);
        System.out.println(appleBox2.getWeight());
    }
}

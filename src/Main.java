import Model.Toy;

public class Main {
    public static void main(String[] args) {
        Toy car = new Toy(1, "car", 10, 70);
        Toy doll = new Toy(2, "doll", 10, 10);
        Toy robot = new Toy(3, "robot", 10, 5);
        Toy teddy = new Toy(4, "teddy", 10, 15);
        System.out.println(car.toString());
    }
}
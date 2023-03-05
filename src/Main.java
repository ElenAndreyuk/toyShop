import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        String fileName = "prizes.txt";

        Toy car = new Toy(1, "car", 10, 70);
        Toy doll = new Toy(2, "doll", 10, 10);
        Toy robot = new Toy(3, "robot", 10, 5);
        Toy teddy = new Toy(4, "teddy", 10, 15);

        List<Toy> allToys = new ArrayList<>();
        allToys.add(car);
        allToys.add(doll);
        allToys.add(robot);
        allToys.add(teddy);

        int countPrizes = 6;
        List<String> prizeToys = new ArrayList<>();
        Giveaway giveaway = new Giveaway();
        for (int i = 1; i<=countPrizes; i++){
            Toy prize = giveaway.giveaway((ArrayList<Toy>) allToys);
            prizeToys.add(prize.toString());
        }

        System.out.println("Prize toys:");
        System.out.println(prizeToys);
        giveaway.getPrize((ArrayList<String>) prizeToys, fileName);

    }
}
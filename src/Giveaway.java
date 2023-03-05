import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Giveaway {
    public Giveaway() {
    }

    public static Toy giveaway(ArrayList<Toy> allToys) {
        int random = new Random().nextInt(100);
        System.out.println(random);
        int number = 0;
        for (Toy i : allToys) {
            if (number < random && number + i.getFrequency() >= random) {
                i.setCount(i.getCount() - 1);
                return i;
            }
            number = number + i.getFrequency();
        }
        return null;
    }

    public static void getPrize(ArrayList<Toy> prizeToys, String fileName) {
        List<String> lines = new ArrayList<>();
        for (Toy i : prizeToys) {
            String temp = i.toString();
            lines.add(temp);
        }
        try (FileWriter writer = new FileWriter(fileName, false)) {
            for (String line : lines) {
                // запись всей строки
                writer.write(line);
                // запись по символам
                writer.append("\n");
            }
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

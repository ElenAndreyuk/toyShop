import java.util.ArrayList;
import java.util.List;

//Необходимо написать программу – розыгрыша игрушек в магазине
//        детских товаров.
//        ● В программе должен быть минимум один класс со
//        следующими свойствами:
//        ○ id игрушки,
//        ○ текстовое название,
//        ○ количество
//        ○ частота выпадения игрушки (вес в % от 100)
//        ● Метод добавление новых игрушек и возможность изменения
//        веса (частоты выпадения игрушки)
//        ● Возможность организовать розыгрыш игрушек.
//        Например, следующим образом:
//        С помощью метода выбора призовой игрушки – мы получаем
//        эту призовую игрушку и записываем в список\массив.
//        Это список призовых игрушек, которые ожидают выдачи.
//        Еще у нас должен быть метод – получения призовой игрушки.
//        После его вызова – мы удаляем из списка\массива первую
//        игрушку и сдвигаем массив. А эту игрушку записываем в
//        текстовый файл.
//        Не забываем уменьшить количество игрушек
//        К написанию программы можно подойти более творчески и
//        делать так, как Вы поняли задание. Немного менять и отходить
//        от примера выше
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
        List<Toy> prizeToys = new ArrayList<>();
        Giveaway giveaway = new Giveaway();
        for (int i = 1; i<=countPrizes; i++){
            Toy prize = giveaway.giveaway((ArrayList<Toy>) allToys);
            prizeToys.add(prize);
        }

        System.out.println(prizeToys);
        giveaway.getPrize((ArrayList<Toy>) prizeToys, fileName);



        for (Toy i : allToys) {
            System.out.println(i.toString());
        }


//        System.out.println(giveaway(all_toys));


    }


}
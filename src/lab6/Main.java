package lab6;


import java.util.Arrays;
import java.util.Comparator;

public class Main
{
    public static void main(String[] args) throws CloneNotSupportedException {

        Human human1 = new Human();
        human1.setPhone(new Iphone());
        human1.getPhone().call();

        Human human2 = new Human(new FIO("Петров", "Пётр", "Петрович"), 20, BodyType.MESOMORPH,
                new Address("Россия", "Тольятти", "Тополиная", 26, 34), new Nokia());
        Human human3 = new Human(new FIO("Василиев", "Василий", "Василиевич"), 34, BodyType.ENDOMORF,
                new Address("Россия", "Самара", "Ушакова", 4, 322), new Iphone());
        Human human5 = new Human(new FIO("Петров", "Василий", "Василиевич"), 10, BodyType.ECTOMORPH,
                new Address("Россия", "Тольятти", "Собакова", 19, 243), new Iphone());
        Human human6 = new Human(new FIO("Петров", "Василий", "Василиевич"), 10, BodyType.ECTOMORPH,
                new Address("Россия", "Тольятти", "Собакова", 15, 243), new Iphone());

        Human human4 = (Human) human3.clone();

        Human[] humans = {human1, human2, human3, human4, human5, human6};

        System.out.println("Начальный массив: ");
        for (Human human : humans) {
            System.out.println(human);
        }

        sortByFIO(humans);
        sortByAge(humans);
        sortByAdress(humans);

    }

    private static void sortByFIO(Human[] humans) {

        Arrays.sort(humans, new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                return o1.toString().compareTo(o2.toString());
            }
        });
        System.out.println("Массив, сортированный по ФИО: ");
        for (Human human : humans) {
            System.out.println(human);
        }
    }

    private static void sortByAge(Human[] humans){

        Arrays.sort(humans, new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                if (o1.getAge() >  o2.getAge()) return 1;
                else if (o1.getAge() < o2.getAge()) return -1;
                return 0;
            }
        });

        System.out.println("Массив, сортированный по возрасту: ");
        for (Human human : humans) {
            System.out.println(human);
        }
    }

    private static void sortByAdress(Human[] humans){

        Arrays.sort(humans, new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                return o1.toString().compareTo(o2.toString());
            }
        });
        System.out.println("Массив, сортированный по адресу: ");
        for (Human human : humans) {
            System.out.println(human);
        }
    }

}


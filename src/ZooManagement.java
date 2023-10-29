import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {

        Animal lion = new Animal("F", "Lion", 5, true);
        Animal singe = new Animal("F", "singe", 5, true);
        Animal elephant = new Animal("F", "elephant", 5, true);
        Animal giraffe = new Animal("F", "giraffe", 5, true);


    System.out.println(lion.toString());
    Zoo zoo = new Zoo("zoo","tunis");
        zoo.addAnimal(lion);
        zoo.addAnimal(elephant);

        System.out.println(zoo.animals.length);
        System.out.println();


        Animal a = new Animal();
        Animal a1 = new Aquatic();
        Animal a2 = new Terrestrial();


        System.out.println("getclass");
        System.out.println(a1.getClass());
        System.out.println(a1 instanceof Aquatic);
        System.out.println(a2 instanceof Aquatic);
        System.out.println(zoo.equals());

    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String...s){

        Animal a = new Bat();

        Dog d = new Dog("Tisson");
        Cat c = new Cat("billi");

        AnimalUtils util = new AnimalUtils();
        util.addAnimal(d);
        util.addAnimal(c);
    }
}
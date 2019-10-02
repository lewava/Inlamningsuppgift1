import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Sixten", 5000);
        Dog dog2 = new Dog("Dogge", 10000);
        Cat cat1 = new Cat("Venus", 5000);
        Cat cat2 = new Cat("Ove", 3000);
        Snake snake1 = new Snake("Hypno", 1000);

        while (true) {
            String input = JOptionPane.showInputDialog("Vilket djur ska få mat?");
            if (input == null)
                break;

                //Här förekommer polymorfism.
            else if (input.equals(dog1.getName()))
                dog1.eat();
            else if (input.equals(dog2.getName()))
                dog2.eat();
            else if (input.equals(cat1.getName()))
                cat1.eat();
            else if (input.equals(cat2.getName()))
                cat2.eat();
            else if (input.equals(snake1.getName()))
                snake1.eat();
            else
                JOptionPane.showMessageDialog(null, "Djuret du sökte efter finns inte på hotellet.");
        }
    }
}

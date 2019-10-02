import javax.swing.*;

public class Dog extends Animal implements Ieat {

    //Här förekommer enum Food.DOGFOOD.foodPortion.
    public final int foodWeightDog = weight / Food.DOGFOOD.foodPortion;

    //Här förekommer inkapsling (protected).
    protected Dog(String name, int weight) {
        super(name, weight);
    }

    //Här förekommer polymorfism samt inkapsling (protected)
    @Override
    protected String getName() {
        return this.name;
    }

    //Här förekommer polymorfism samt enum Food.DOGFOOD.foodType.
    @Override
    public void eat() {
        JOptionPane.showMessageDialog(null, foodWeightDog + "gram " + Food.DOGFOOD.foodType);
    }
}

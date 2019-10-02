import javax.swing.*;

public class Cat extends Animal implements Ieat{

    //Här förekommer enum Food.CATFOOD.foodPortion.
    public final int foodWeightCat = weight / Food.CATFOOD.foodPortion;

    //Här förekommer inkapsling (protected).
    protected Cat(String name, int weight) {
        super(name, weight);
    }

    //Här förekommer polymorfism samt inkapsling (protected).
    @Override
    protected String getName() {
        return this.name;
    }

    //Här förekommer polymorfism samt enum Food.CATFOOD.foodType.
    @Override
    public void eat() {
        JOptionPane.showMessageDialog(null, foodWeightCat + "gram " + Food.CATFOOD.foodType);
    }
}

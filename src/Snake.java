import javax.swing.*;

public class Snake extends Animal implements Ieat {

    //Här förekommer inkapsling (protected).
    protected Snake(String name, int weight) {
        super(name, weight);
    }

    //Här förekommer polymorfism samt inkapsling (protected).
    @Override
    protected String getName() {
        return this.name;
    }

    //Här förekommer polymorfism samt enum Food.SNAKEFOOD.foodportion.
    @Override
    public void eat() {
        JOptionPane.showMessageDialog(null, Food.SNAKEFOOD.foodPortion + "gram ");
    }
}

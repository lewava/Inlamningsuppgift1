public abstract class Animal {

    //Här förekommer inkapsling (protected).
    protected String name;
    protected int weight;


    //Här förekommer inkapsling (protected).
    protected Animal(String name, int weight) {
        this.weight = weight;
        this.name = name;
    }

    //Här förekommer inkapsling (protected).
    protected abstract String getName();
}

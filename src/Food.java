
//Här förekommer enums.
public enum Food {
    DOGFOOD(100, "hundmat"), SNAKEFOOD(20, "orm mat"),
    CATFOOD(150, "kattmat");

    public final Integer foodPortion;
    public final String foodType;

    Food(Integer foodWeight, String foodType) {
        this.foodPortion = foodWeight;
        this.foodType = foodType;
    }
}


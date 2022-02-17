package dish;

public class Dish {

    private String name;
    private boolean veg;
    private int calories;
    private Type type;

    public Dish(String dish, boolean veg, int calories, Type type) {
        this.name = dish;
        this.veg = veg;
        this.calories = calories;
        this.type = type;
    }

    public enum Type{
        MEAT, FISH, OTHER
    }

    public Dish(){}

    public Dish(String name, int calories){
        this.name = name ;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVeg() {
        return veg;
    }

    public void setVeg(boolean veg) {
        this.veg = veg;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", veg=" + veg +
                ", calories=" + calories +
                ", type=" + type +
                '}';
    }
}

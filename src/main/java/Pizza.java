import java.util.ArrayList;

public abstract class Pizza implements Food {

    String name;
    ArrayList<Ingredient>ingredients;

    public Pizza(String name) {
    this.name=name;

    ingredients = new ArrayList<>();
    }


    public void addIngredient (Ingredient ingredient ){
        this.ingredients.add(ingredient);
    }

    @Override
    public float getPrice(){
        float price=0;
        for (Ingredient ingredient : ingredients){
            price += ingredient.getPrice();
        }
        return price;
    }
    @Override
    public String getName() {
        return name;}

    @Override
    public String toString(){
        return "Pizza(" +"name"+name+ '\''+ "; price" + getPrice()+ ')' ;}


}

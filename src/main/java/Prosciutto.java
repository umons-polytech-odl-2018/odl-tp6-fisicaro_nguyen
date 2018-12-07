public class Prosciutto extends Pizza  {
    public Prosciutto() {
        super("Prosciutto");
        super.addIngredient(new pate());
        super.addIngredient(new saucetomate());
        super.addIngredient(new fromage());
        super.addIngredient(new jambon());
        super.getPrice();

    }
}

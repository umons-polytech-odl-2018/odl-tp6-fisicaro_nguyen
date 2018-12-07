public class Carbonara extends Pizza  {
    public Carbonara() {
        super("Carbonare");
        super.addIngredient(new pate());
        super.addIngredient(new cremeblanche());
        super.addIngredient(new fromage());
        super.addIngredient(new jambon());
        super.getPrice();

    }
}

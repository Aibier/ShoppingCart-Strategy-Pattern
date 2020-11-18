import java.util.Vector;

public class ShoppingCart {
    Vector<Product> listOfItems = new Vector<Product>();
    private PricingStrategy strategy = null;

    public ShoppingCart() {
        strategy = new RegularDayStrategy();
    }

    public void setStrategy(int occ) {
        switch (occ) {
            case PricingStrategy.VALENTINE:
                strategy = new ValentinesDayStrategy();
                break;
            case PricingStrategy.MOTHER:
                strategy = new MothersDayStrategy();
                break;
            default:
                strategy = new RegularDayStrategy();
        }
    }

    public float checkout() {
        return strategy.calculateTotal(listOfItems);
    }

    public void add(Product item) {
        if (item != null)
            listOfItems.add(item);
    }

}

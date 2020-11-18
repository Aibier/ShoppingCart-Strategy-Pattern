import java.util.Collection;
import java.util.Iterator;


public class RegularDayStrategy implements PricingStrategy {

    public float calculateTotal(Collection<Product> items) {
        float total = 0.0f;
        Iterator<Product> iter = items.iterator();

        while (iter.hasNext()) {
            Product item = iter.next();
            float price = item.getPrice();
            System.out.println("RegularDayStrategy.calculateTotal: price for " + item.getType() + " = " + price);
            total += price;
        }
        return total;
    }

}

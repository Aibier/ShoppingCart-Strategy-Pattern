public class FlowersAreForever {

    public static void main(String[] args) {
        runStrategy();
    }

    public static void runStrategy() {
        System.out.println("\n\nrunStrategy: BEGIN");

        ShoppingCart cart = new ShoppingCart();

        Product daisy = new Flower(Flower.DAISY);
        Product lily = new Flower(Flower.LILY);
        Product jasmine = new Flower(Flower.JASMINE);
        Product fern = new Leaves(Leaves.FERN);

        Product rose = new Flower(Flower.ROSE);
        Product softtoy = new Toy(Toy.SOFTTOY);

        daisy.setPrice(0.3f);
        lily.setPrice(0.9f);
        jasmine.setPrice(0.7f);
        rose.setPrice(1.0f);
        fern.setPrice(0.2f);
        softtoy.setPrice(1.5f);

        cart.add(daisy);
        cart.add(lily);
        cart.add(jasmine);
        cart.add(rose);
        cart.add(fern);
        cart.add(softtoy);

        cart.setStrategy(PricingStrategy.REGULAR);
        System.out.println("Total price = " + cart.checkout());
        System.out.println("\nExpected quantity = 4.6\n");

        cart.setStrategy(PricingStrategy.VALENTINE);
        System.out.println("Total price = " + cart.checkout());
        System.out.println("\nExpected quantity = 4.975\n");

        cart.setStrategy(PricingStrategy.MOTHER);
        System.out.println("Total price = " + cart.checkout());
        System.out.println("\nExpected quantity = 5.035\n");

        System.out.println("The flower type is " + softtoy.getType());

        System.out.println("runStrategy: END\n");
    }
}



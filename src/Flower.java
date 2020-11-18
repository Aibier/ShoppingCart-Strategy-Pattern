public class Flower extends Product {
    public static final int ROSE = 1;
    public static final int DAISY = 2;
    public static final int LILY = 3;
    public static final int JASMINE = 4;

    public Flower(int type) {
        setType(type);
        setPrice(0.30f);
    }

    public String getPrintableType() {
        switch (getType()) {
            case ROSE:
                return "Flower: Rose";
            case DAISY:
                return "Flower: Daisy";
            case LILY:
                return "Flower: Lily";
            case JASMINE:
                return "Flower: Jasmine";
        }

        return null;
    }
}

public interface CarInterface {
    int getPrice();
    String getDescription();
}

public class Car implements CarInterface {
    private int price;
    private String description;

    public Car() {
        price = 10000;
        description = "Basic car";
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return description;
    }
}

public class SportsPackage implements CarInterface {
    private int price;
    private String description;

    public SportsPackage() {
        price = 2000;
        description = "Sports package";
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return description;
    }
}

public class LuxuryPackage implements CarInterface {
    private int price;
    private String description;

    public LuxuryPackage() {
        price = 5000;
        description = "Luxury package";
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return description;
    }
}

public class CarShop {
    public static void main(String[] args) {
        Car basicCar = new Car();
        Car sportsCar = new SportsPackage();
        Car luxuryCar = new LuxuryPackage();

        System.out.println("Basic car:");
        System.out.println(basicCar.getDescription() + " - Price: $" + basicCar.getPrice());

        System.out.println("\nSports car:");
        System.out.println(basicCar.getDescription() + " + " + sportsCar.getDescription() + " - Price: $" + (basicCar.getPrice() + sportsCar.getPrice()));

        System.out.println("\nLuxury car:");
        System.out.println(basicCar.getDescription() + " + " + luxuryCar.getDescription() + " - Price: $" + (basicCar.getPrice() + luxuryCar.getPrice()));
    }
}

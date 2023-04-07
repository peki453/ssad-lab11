public interface Coffee {
    String getDescription();
    double getCost();
}

public class SimpleCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Simple Coffee";
    }

    @Override
    public double getCost() {
        return 1.0;
    }
}

public class CoffeeWithMilk implements Coffee {
    @Override
    public String getDescription() {
        return "Coffee with Milk";
    }

    @Override
    public double getCost() {
        return 1.5;
    }
}

public class CoffeeWithSugar implements Coffee {
    @Override
    public String getDescription() {
        return "Coffee with Sugar";
    }

    @Override
    public double getCost() {
        return 1.25;
    }
}

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println("Description: " + coffee.getDescription() + ", Cost: $" + coffee.getCost());

        coffee = new CoffeeWithMilk();
        System.out.println("Description: " + coffee.getDescription() + ", Cost: $" + coffee.getCost());

        coffee = new CoffeeWithSugar();
        System.out.println("Description: " + coffee.getDescription() + ", Cost: $" + coffee.getCost());
    }
}

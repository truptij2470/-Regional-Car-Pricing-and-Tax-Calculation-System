


package assignment1;
class Car {
    private final String country;
    private final double basePrice;
    private final Region region;

    public Car(String country, double basePrice) {
        this.country = country;
        this.basePrice = basePrice;
        this.region = RegionMapper.getRegion(country);
    }

    public double calculateTax() {
        return basePrice * region.getTaxRate();
    }

    public double calculateFinalPrice() {
        return basePrice + calculateTax();
    }

    @Override
    public String toString() {
        return "Country: " + country + ", Base Price: " + basePrice + ", Tax: " + calculateTax() + ", Final Price: " + calculateFinalPrice();
    }

    public static Car createCar(String country, double basePrice) {
        return new Car(country, basePrice);
    }
}



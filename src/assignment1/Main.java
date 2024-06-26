package assignment1;

public class Main {
 public static void main(String[] args) {
     String country = "India";
     double basePrice = 20000;
     Car car = Car.createCar(country, basePrice);
     System.out.println(car.toString());
 }
}
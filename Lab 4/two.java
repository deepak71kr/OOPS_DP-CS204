package four;

public class two {
    public static class Car {
        private String brand;
        
        public Car() {
            this.brand = "Ford";
        }
        public String getBrand() {
            return this.brand;
        }
    }

    public static void main(String[] args) {
        Car car = new Car();
        String brand = car.getBrand();
               System.out.println("Brand: " + brand);
    }
}

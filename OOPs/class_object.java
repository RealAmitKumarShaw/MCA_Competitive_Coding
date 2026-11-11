class car{
    // Properties
    String brand;
    String color;

    // Method
    void start() {
        System.out.println("Car is Started");
    }
}

public class class_object{
    public static void main(String[] args) {
        // create object
        car car1 = new car();

        car1.brand = "BMW";
        car1.color = "White";

        System.out.println(car1.brand);
        System.out.println(car1.color);
    }
}
public class Car {

    private int wheels;

    private int windows;
    private String model;
    private String manufacturer;
    private String driving;

    public Car(int wheels, int windows, String model, String manufacturer, String driving) {
        this.wheels = wheels;
        this.windows = windows;
        this.model = model;
        this.manufacturer = manufacturer;
        this.driving = driving;
    }

    public int numWheels() {
        return this.wheels;
    }

    public String model() {
        return this.model;
    }

    public String driving() {
        return this.driving;
    }

    public static void allWindows() {
         int windows = 4;
    }

    public void hasDriver(String nameOfDriver) {
         this.driving = nameOfDriver;
        System.out.println(nameOfDriver + " is driving the car");
    }

    public static void main(String[] args) {



        Car c = new Car(4, 4, "Tundra", "Toyota", "Bob");

        System.out.println(c.driving);

        c.hasDriver("Joe");


    }
}

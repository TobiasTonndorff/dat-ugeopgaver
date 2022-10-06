public class Car {
    private String make;
    private String model;
    private int year;
    private String bodytype;
    private Driver driver;

    public Car(String make, String model, int year, String bodytype){
        this.make = make;
        this.model = model;
        this.year = year;
        this.bodytype = bodytype;

    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Make: " +make+". Model: " +model+ " (" +year + "), BodyStyle: " +bodytype;
    }
}

public class Main {





    public static void main(String[] args) {
         Driver d1 = new Driver("Tobias", 22 );
         Car c1 = new Car("Skoda", "Fabia", 2004, "StationCar");
         Car c2 = new Car("BMW", "m392", 2008, "cabriolet");
         c1.setDriver(d1);
        System.out.println(c1.toString());
        System.out.println(d1.toString());
        c2.setDriver(d1);
        System.out.println(c2.toString());
        System.out.println(d1.toString());





    }
}
public class Test {

    public static void main(String[] args) {
        Car car = new Car("VW ", "Polo ", "dyt dyt");
        Driver driver = new Driver("name");
        car.setDriver(driver);
        System.out.println(car.turnEngineOn());
        System.out.println(car.drive()+car.sound());
        System.out.println(car.park());
    }
}

import org.testng.annotations.Test;

// Exercise-4
public class FactoryTest {

    @Test(priority = 1)
    public static void createFiat(){
        Drivable car = CarFactory.getCar("Fiat");
        car.drive();
    }

    @Test(priority = 2)
    public static void createBMW(){
        Drivable car = CarFactory.getCar("BMW");
        car.drive();
    }

    @Test(priority = 3)
    public static void createPorsche(){
        Drivable car = CarFactory.getCar("Porsche");
        car.drive();
    }

    @Test(priority = 4)
    public static void createNonExistCar(){
        Drivable car = CarFactory.getCar("Honda");
        car.drive();
    }

}

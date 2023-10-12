import org.junit.jupiter.api.Test;
import seminars.second.hw.Car;
import seminars.second.hw.Motorcycle;
import seminars.second.hw.Vehicle;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    public  void testCarIsInstanceOfVehincle() {
        Car car = new Car("Dodge", "Ram", 2010);
        assertTrue(car instanceof Vehicle);
    }

    @Test
    public  void testCarWheels() {
        Car car = new Car("Dodge", "Ram", 2010);
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    @Test
    public  void testMotorcycleWheels() {
        Motorcycle honda = new Motorcycle("Honda", "g500", 2012);
        assertThat(honda.getNumWheels()).isEqualTo(2);
    }

    @Test
    public  void testTestDriveSpeedCar() {
        Car car = new Car("Dodge", "Ram", 2010);

        car.testDrive();

        assertThat(car.getSpeed()).isEqualTo(60);
    }
    @Test
    public  void testTestDriveSpeedMotorcycle() {
        Motorcycle honda = new Motorcycle("Honda", "g500", 2012);

        honda.testDrive();

        assertThat(honda.getSpeed()).isEqualTo(75);
    }
    @Test
    public  void testParkingCar() {
        Car car = new Car("Dodge", "Ram", 2010);

        car.testDrive();
        car.park();

        assertThat(car.getSpeed()).isEqualTo(0);
    }
    @Test
    public  void testParkingMotorcycle() {
        Motorcycle honda = new Motorcycle("Honda", "g500", 2012);

        honda.testDrive();
        honda.park();

        assertThat(honda.getSpeed()).isEqualTo(0);
    }

}
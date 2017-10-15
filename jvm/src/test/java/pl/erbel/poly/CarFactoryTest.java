package pl.erbel.poly;

import org.junit.Assert;
import org.junit.Test;

import static pl.erbel.poly.CarType.Toyota;
import static pl.erbel.poly.CarType.Volvo;

public class CarFactoryTest {

    CarFactory carFactory = new CarFactory();

    @Test
    public void createCar() throws Exception {
        //given
        CarFactory carFactory = new CarFactory();

        //when
        Car car = carFactory.createCar(Volvo, 4);
        car.drive();

        //then
        String me = car.isMe();
        Assert.assertEquals(me, Volvo.name());
        Assert.assertFalse(me.equals(Toyota.name()));

    }

    @Test
    public void createCarI() throws Exception {
        Driveable carI = carFactory.createCarI(Toyota, 4);
        carI.drive();
    }

}
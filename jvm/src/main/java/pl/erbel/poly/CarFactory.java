package pl.erbel.poly;

import static pl.erbel.poly.CarType.Toyota;
import static pl.erbel.poly.CarType.Volvo;

public class CarFactory {

    public Car createCar(CarType carType, int iloscDrzwi) {
        if (Volvo == carType) {
            return new Volvo(iloscDrzwi);
        } else if (Toyota == carType) {
            return new Toyota(iloscDrzwi);
        } else {
            throw new RuntimeException("OMG I CANNOT CREATE IT");
        }
    }

    public Driveable createCarI(CarType carType, int iloscDrzwi) {
        return createCar(carType, iloscDrzwi);
    }

    public Volvo createVolvo() {
        return null;
    }

    public Toyota createToytota() {
        return null;
    }
}

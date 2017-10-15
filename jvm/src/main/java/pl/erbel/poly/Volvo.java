package pl.erbel.poly;

public class Volvo extends Car {

    public Volvo(int iloscDrzwi) {
        super(iloscDrzwi);
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("Niby samochod a jednak Volvo");
    }
}

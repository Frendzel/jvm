package pl.erbel.poly;

public abstract class Car implements Driveable {

    private int iloscDrzwi;

    @Override
    public void drive() {
        System.out.println("Jedziemy w: " + this.getClass());
    }

    @Override
    public String isMe() {
        return this.getClass().getSimpleName();
    }

    Car(int iloscDrzwi) {
        this.iloscDrzwi = iloscDrzwi;
    }

    private Car() {
    }

    public int getIloscDrzwi() {
        return iloscDrzwi;
    }

    public void setIloscDrzwi(int iloscDrzwi) {
        this.iloscDrzwi = iloscDrzwi;
    }


}

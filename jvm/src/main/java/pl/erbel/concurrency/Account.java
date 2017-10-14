package pl.erbel.concurrency;

public class Account {

    private float balance;
    // Maybe ThreadLocal ???
    // thread-safe APIs
    // ClassLoader
    // Refleksja
    // Monitoring threada
    public void modify(float difference) {
        float value = this.balance;
        this.balance = value + difference;
    }

    public void showBalance() {
        System.out.println(balance);
    }
}

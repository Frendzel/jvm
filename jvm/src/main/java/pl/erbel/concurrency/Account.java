package pl.erbel.concurrency;

public class Account {

    private ThreadLocal<Float> balance =
            ThreadLocal.withInitial(() -> 0f);

    // Maybe ThreadLocal ???
    // thread-safe APIs
    // ClassLoader
    // Refleksja
    // Monitoring threada
    public void modify(float difference) {
        float value = this.balance.get();
        this.balance.set(value + difference);
    }

    public void showBalance() {
        System.out.println(
                Thread.currentThread().getId() + ": " +
                        balance.get());
    }

    public Account() {
    }

    public Account(ThreadLocal<Float> balance) {
        this.balance = balance;
    }
}

package pl.erbel.memory.memoryleak;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

//-XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=/logs/heapdump
public class UserBook {

    private Map<Integer, User> leakingMap = new HashMap<Integer, User>();

    public void addUsers() {
        for (int i = 0; ; i++) {
            leakingMap.put(i, new User("", "", new Date()));
        }
    }

    public static void main(String args[]) {
        new UserBook().addUsers();
    }
}

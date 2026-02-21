package repository;
import model.User;
import java.util.HashMap;
import java.util.Map;

public class UserRepository {
    private static UserRepository instance;

    private Map<String, User> users = new HashMap<>();

    private UserRepository() {
        users.put("admin", new User("admin", "admin123"));
    }

    public static UserRepository getInstance() {
        if (instance == null) {
            instance = new UserRepository();
        }
        return instance;
    }

    public User findByUsername(String username) {
        return users.get(username);
    }

}

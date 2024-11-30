package Task_3;

import java.util.HashMap;
import java.util.Map;

public class UserAuthentication {

    private Map<String, String> users;  // Store username and password

    public UserAuthentication() {
        users = new HashMap<>();
        // Predefined users (username, password)
        users.put("admin", "admin123");
        users.put("user", "user123");
    }

    // Authenticate user by username and password
    public boolean authenticate(String username, String password) {
        return users.containsKey(username) && users.get(username).equals(password);
    }
}

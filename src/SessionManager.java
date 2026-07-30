import java.util.Optional;

/**
 * Singleton Session Manager.
 */
public class SessionManager {

    private static SessionManager instance;

    private User loggedInUser;

    private SessionManager() {

    }

    public static SessionManager getInstance() {

        if (instance == null) {
            instance = new SessionManager();
        }

        return instance;
    }

    public void login(User user) {
        loggedInUser = user;
    }

    public Optional<User> getLoggedInUser() {
        return Optional.ofNullable(loggedInUser);
    }

    public void logout() {
        loggedInUser = null;
    }
}
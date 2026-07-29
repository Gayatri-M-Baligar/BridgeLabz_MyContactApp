import java.util.Optional;

/**
 * Basic email/password authentication.
 * Implements Strategy Pattern.
 */
public class BasicAuth implements Authentication {

    private User registeredUser;

    public BasicAuth(User registeredUser) {
        this.registeredUser = registeredUser;
    }

    @Override
    public Optional<User> login(String email, String password) {

        String hashedPassword = PasswordUtil.hashPassword(password);

        if (registeredUser.getEmail().equals(email)
                && registeredUser.getPassword().equals(hashedPassword)) {

            return Optional.of(registeredUser);
        }

        return Optional.empty();
    }
}
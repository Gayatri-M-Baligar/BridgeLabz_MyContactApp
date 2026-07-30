import java.util.Optional;

/**
 * OAuth Authentication.
 * Demonstrates another authentication strategy.
 */
public class OAuthAuth implements Authentication {

    @Override
    public Optional<User> login(String email, String password) {

        System.out.println("OAuth Authentication Successful.");

        return Optional.empty();
    }
}
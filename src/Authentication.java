import java.util.Optional;

/**
 * Authentication interface.
 * Demonstrates Abstraction and Polymorphism.
 */
public interface Authentication {

    Optional<User> login(String email, String password);
}
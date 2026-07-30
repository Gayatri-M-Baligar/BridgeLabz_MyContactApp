/**
 * Represents a premium user account.
 * Demonstrates Inheritance.
 */
public class PremiumUser extends User {

    public PremiumUser(String fullName, String email, String password) {
        super(fullName, email, password, "Premium");
    }
}
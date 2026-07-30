/**
 * Represents a free user account.
 * Demonstrates Inheritance.
 */
public class FreeUser extends User {

    public FreeUser(String fullName, String email, String password) {
        super(fullName, email, password, "Free");
    }
}
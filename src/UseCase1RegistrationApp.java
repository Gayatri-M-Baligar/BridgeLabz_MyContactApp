import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * ==========================================================
 * MyContacts App
 * Use Case 1 - User Registration
 *
 * Concepts Demonstrated:
 * - Encapsulation
 * - Inheritance
 * - Builder Pattern
 * - Factory Pattern
 * - Password Hashing
 * - Regular Expressions
 * - Exception Handling
 * ==========================================================
 */
public class UseCase1RegistrationApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("==================================");
            System.out.println(" MyContacts - User Registration");
            System.out.println("==================================");

            System.out.print("Enter Full Name : ");
            String name = scanner.nextLine();

            System.out.print("Enter Email : ");
            String email = scanner.nextLine();

            if (!Pattern.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$", email)) {
                throw new IllegalArgumentException("Invalid email format.");
            }

            System.out.print("Enter Password : ");
            String password = scanner.nextLine();

            if (password.length() < 6) {
                throw new IllegalArgumentException("Password must contain at least 6 characters.");
            }

            System.out.print("User Type (Free/Premium) : ");
            String type = scanner.nextLine();

            String hashedPassword = PasswordUtil.hashPassword(password);

            UserBuilder builder = new UserBuilder()
                    .setFullName(name)
                    .setEmail(email)
                    .setPassword(hashedPassword)
                    .setUserType(type);

            User user = UserFactory.createUser(builder);

            System.out.println("\nRegistration Successful!\n");
            System.out.println(user);

            System.out.println("\nPassword stored securely (hashed).");

        } catch (Exception e) {

            System.out.println("\nRegistration Failed!");
            System.out.println(e.getMessage());

        } finally {

            scanner.close();
        }
    }
}
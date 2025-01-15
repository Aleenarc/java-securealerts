import java.util.Scanner;

public class SecurityAlertSystem {
    
    // Method to simulate login attempt
    public static void loginAttempt(String username, String password) {
        String correctUsername = "admin";
        String correctPassword = "password123";
        
        if (!username.equals(correctUsername) || !password.equals(correctPassword)) {
            generateSecurityAlert(username);
        } else {
            System.out.println("Login successful!");
        }
    }
    
    // Method to generate a security alert
    public static void generateSecurityAlert(String username) {
        System.out.println("Security Alert! Suspicious login attempt detected for username: " + username);
        // Additional security measures could be added here, e.g., locking the account, notifying the admin, etc.
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Security System - Login Attempt");
        
        // Get the username and password from the user
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        
        // Simulate a login attempt
        loginAttempt(username, password);
        
        scanner.close();
    }
}

package web.service;

/**
 * Business logic to handle login functions.
 * 
 * @author Ahsan.
 */
public class LoginService {

    /**
     * Static method returns true for successful login, false otherwise.
     * 
     * @param username
     * @param password
     * @param dob
     * @return true if login is successful, false otherwise
     */
    public static boolean login(String username, String password, String dob) {
        // Check if any input fields are null or empty
        if (username == null || password == null || dob == null ||
            username.isEmpty() || password.isEmpty() || dob.isEmpty()) {
            return false;
        }
        
        // Trim whitespace from username and password
        username = username.trim();
        password = password.trim();
        
        // Check if the username and password match
        if (!"deepak".equals(username) || !"deepak_pass".equals(password)) {
            return false;
        }
        
        // Validate the date of birth format (yyyy-mm-dd)
        if (!dob.matches("\\d{4}-\\d{2}-\\d{2}")) {
            return false;
        }
        
        // Extract year, month, and day from date of birth
        String[] dobParts = dob.split("-");
        int year = Integer.parseInt(dobParts[0]);
        int month = Integer.parseInt(dobParts[1]);
        int day = Integer.parseInt(dobParts[2]);
        
        // Perform additional checks on the date of birth (e.g., age restrictions)
        if (year < 1900 || year > 2024 || month < 1 || month > 12 || day < 1 || day > 31) {
            return false;
        }
        
        
        
        // If all checks pass, return true for successful login
        return true;
    }
}

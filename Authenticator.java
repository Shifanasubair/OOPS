class AuthenticationException extends Exception 
{
    public AuthenticationException(String message)
    {
        super(message);
    }
}
public class Authenticator 
{
    public static void authenticate(String username, String password) throws AuthenticationException 
    {
        String correctUsername = "shifana";
        String correctPassword = "pass123";
        if (!username.equals(correctUsername) || !password.equals(correctPassword))
        {
            throw new AuthenticationException("Authentication failed: Invalid username or password.");
        } 
        else 
        {
            System.out.println("Login successful!");
        }
    }
    public static void main(String[] args) 
    {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter username:");
        String inputUsername = scanner.nextLine();
        System.out.print("Enter password:");
        String inputPassword = scanner.nextLine();
        try 
        {
            authenticate(inputUsername, inputPassword);
        } 
        catch (AuthenticationException e) 
        {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }
}


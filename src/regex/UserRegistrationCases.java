package regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistrationCases {
    Scanner scanner = new Scanner(System.in);

    public void enterFirstName() {
        System.out.println("Enter the First name starts with Cap and has minimum 3 characters");
        String firstName = scanner.next();
        String regex = "^[A-Z][a-z]{2,}$";
        System.out.println(firstName + " = " + firstName.matches(regex));
    }

    public void enterLastName() {
        System.out.println("Enter the Last name starts with Cap and has minimum 3 characters");
        String lastName = scanner.next();
        System.out.println(Pattern.matches("^[A-Z]{1}[a-z]{2,}$", lastName));
    }
}
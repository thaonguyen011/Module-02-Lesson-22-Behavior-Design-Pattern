import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidate {
    private Pattern pattern;
    private final String EMAIL_PATTERN = "[A-Za-z0-9]+@[A-Za-z0-9]+\\.[A-Za-z0-9]+$";


    public EmailValidate() {
        pattern = Pattern.compile(EMAIL_PATTERN);
    }

    public EmailValidate(Pattern pattern) {
        this.pattern = pattern;
    }

    public void setPattern(Pattern pattern) {
        this.pattern = pattern;
    }

    public boolean validate(String email) {
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] validEmail = new String[] { "a@gmail.com", "ab@yahoo.com", "abc@hotmail.com" };
        String[] invalidEmail = new String[] { "@gmail.com", "ab@gmail.", "@#abc@gmail.com" };

        EmailValidate emailExample = new EmailValidate();

        for (String email : validEmail) {
            boolean isValid = emailExample.validate(email);
            System.out.println("Email is " + email +" is valid: "+ isValid);
        }

        for (String email : invalidEmail) {
            boolean isValid = emailExample.validate(email);
            System.out.println("Email is " + email +" is valid: "+ isValid);
        }

    }
}

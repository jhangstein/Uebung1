import at.ac.fhcampuswien.PasswordCheck;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordCheckTest {

    // Testing password length
    @Test
    @DisplayName("Check valid pw length")
    public void testPasswordLength(){
        PasswordCheck pw = new PasswordCheck();
        assertTrue(pw.pwLength("Password"));
    }

    @Test
    @DisplayName("Check invalid pw length")
    public void testPasswordLength2(){
        PasswordCheck pw = new PasswordCheck();
        assertFalse(pw.pwLength("pass"));
    }

    @Test
    @DisplayName("Check invalid pw length")
    public void testPasswordLength3(){
        PasswordCheck pw = new PasswordCheck();
        assertFalse(pw.pwLength("supermegaultrasecurepassword"));
    }


    // Testing Upper/Lower Case requirements
    @Test
    @DisplayName("Check valid Aa")
    public void testPasswordUpperLower(){
        PasswordCheck pw = new PasswordCheck();
        assertTrue(pw.pwContainsUpperLowerCase("VerySecure"));
    }

    @Test
    @DisplayName("Check invalid Aa")
    public void testPasswordUpperLower2(){
        PasswordCheck pw = new PasswordCheck();
        assertFalse(pw.pwContainsUpperLowerCase("verysecure"));
    }

    @Test
    @DisplayName("Check invalid Aa")
    public void testPasswordUpperLower3(){
        PasswordCheck pw = new PasswordCheck();
        assertFalse(pw.pwContainsUpperLowerCase("123456789"));
    }



}

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
        assertTrue(pw.checkPassword("Password"));
    }

    @Test
    @DisplayName("Check invalid pw length")
    public void testPasswordLength2(){
        PasswordCheck pw = new PasswordCheck();
        assertFalse(pw.checkPassword("pass"));
    }

    @Test
    @DisplayName("Check invalid pw length")
    public void testPasswordLength3(){
        PasswordCheck pw = new PasswordCheck();
        assertFalse(pw.checkPassword("supermegaultrasecurepassword"));
    }


    // Testing Upper/Lower Case requirements
    @Test
    @DisplayName("Check valid Aa")
    public void testPasswordUpperLower(){
        PasswordCheck pw = new PasswordCheck();
        assertTrue(pw.checkPassword("VerySecure"));
    }

    @Test
    @DisplayName("Check invalid Aa")
    public void testPasswordUpperLower2(){
        PasswordCheck pw = new PasswordCheck();
        assertFalse(pw.checkPassword("verysecure"));
    }

    @Test
    @DisplayName("Check invalid Aa")
    public void testPasswordUpperLower3(){
        PasswordCheck pw = new PasswordCheck();
        assertFalse(pw.checkPassword("123456789"));
    }



}

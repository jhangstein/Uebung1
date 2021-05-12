import at.ac.fhcampuswien.PasswordCheck;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordCheckTest {

    @Test
    @DisplayName("Check valid pw length")
    public void testPasswordLength(){
        PasswordCheck pw = new PasswordCheck();
        assertTrue(pw.isValid("password"));
    }

    @Test
    @DisplayName("Check invalid pw length")
    public void testPasswordLength2(){
        PasswordCheck pw = new PasswordCheck();
        assertFalse(pw.isValid("pass"));
    }

    @Test
    @DisplayName("Check invalid pw length")
    public void testPasswordLength3(){
        PasswordCheck pw = new PasswordCheck();
        assertFalse(pw.isValid("supermegaultrasecurepassword"));
    }
}

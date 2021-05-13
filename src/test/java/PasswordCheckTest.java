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
        assertTrue(pw.checkPassword("Password1%"));
    }

    @Test
    @DisplayName("Check invalid pw length")
    public void testPasswordLength2(){
        PasswordCheck pw = new PasswordCheck();
        assertFalse(pw.checkPassword("pass1%"));
    }

    @Test
    @DisplayName("Check invalid pw length")
    public void testPasswordLength3(){
        PasswordCheck pw = new PasswordCheck();
        assertFalse(pw.checkPassword("supermegaultrasecurepassword123))"));
    }


    // Testing Upper/Lower Case requirements
    @Test
    @DisplayName("Check valid Aa")
    public void testPasswordUpperLower(){
        PasswordCheck pw = new PasswordCheck();
        assertTrue(pw.checkPassword("VerySecure1!!1!"));
    }

    @Test
    @DisplayName("Check invalid Aa")
    public void testPasswordUpperLower2(){
        PasswordCheck pw = new PasswordCheck();
        assertFalse(pw.checkPassword("verysecure1!!!1!"));
    }

    @Test
    @DisplayName("Check invalid Aa")
    public void testPasswordUpperLower3(){
        PasswordCheck pw = new PasswordCheck();
        assertFalse(pw.checkPassword("123456789!!!"));
    }


    // Testing numeral requirements
    @Test
    @DisplayName("Check valid number req")
    public void testPasswordNumber(){
        PasswordCheck pw = new PasswordCheck();
        assertTrue(pw.checkPassword("PassWord123!"));
    }

    @Test
    @DisplayName("Check invalid number req")
    public void testPasswordNumber2(){
        PasswordCheck pw = new PasswordCheck();
        assertFalse(pw.checkPassword("WhoNeedsNumbersAnyways?"));
    }


    // Testing symbol requirements
    @Test
    @DisplayName("Check PW with valid symbols")
    public void testPasswordSymbol(){
        PasswordCheck pw = new PasswordCheck();
        assertTrue(pw.checkPassword("INeedNumbers(123)"));
    }

    @Test
    @DisplayName("Check PW without symbols")
    public void testPasswordSymbol2(){
        PasswordCheck pw = new PasswordCheck();
        assertFalse(pw.checkPassword("IDontNeedSymbols1"));
    }

    @Test
    @DisplayName("Check PW with invalid symbols")
    public void testPasswordSymbol3(){
        PasswordCheck pw = new PasswordCheck();
        assertFalse(pw.checkPassword("INeedSymbols&MuchMore1"));
    }
}

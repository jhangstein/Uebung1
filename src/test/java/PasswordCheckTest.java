import at.ac.fhcampuswien.PasswordCheck;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordCheckTest {

    // Testing password length
    @Test
    @DisplayName("Check PW with valid length")
    public void testPasswordLength(){
        PasswordCheck pw = new PasswordCheck();
        assertTrue(pw.checkPassword("Password1%"));
    }

    @Test
    @DisplayName("Check PW length - too short")
    public void testPasswordLength2(){
        PasswordCheck pw = new PasswordCheck();
        assertFalse(pw.checkPassword("pass1%"));
    }

    @Test
    @DisplayName("Check PW length - too long")
    public void testPasswordLength3(){
        PasswordCheck pw = new PasswordCheck();
        assertFalse(pw.checkPassword("supermegaultrasecurepassword122112))"));
    }


    // Testing Upper/Lower Case requirements
    @Test
    @DisplayName("Check PW with valid Aa")
    public void testPasswordUpperLower(){
        PasswordCheck pw = new PasswordCheck();
        assertTrue(pw.checkPassword("VerySecure1!!1!"));
    }

    @Test
    @DisplayName("Check PW Aa - no upper")
    public void testPasswordUpperLower2(){
        PasswordCheck pw = new PasswordCheck();
        assertFalse(pw.checkPassword("verysecure1!!!1!"));
    }

    @Test
    @DisplayName("Check PW Aa - no letters")
    public void testPasswordUpperLower3(){
        PasswordCheck pw = new PasswordCheck();
        assertFalse(pw.checkPassword("1212121212!!!"));
    }


    // Testing numeral requirements
    @Test
    @DisplayName("Check PW with numbers")
    public void testPasswordNumber(){
        PasswordCheck pw = new PasswordCheck();
        assertTrue(pw.checkPassword("PassWord12!"));
    }

    @Test
    @DisplayName("Check PW numbers - no numbers")
    public void testPasswordNumber2(){
        PasswordCheck pw = new PasswordCheck();
        assertFalse(pw.checkPassword("WhoNeedsNumbersAnyways?"));
    }

    @Test
    @DisplayName("Check PW numbers - repeated numbers")
    public void testPasswordNumber3(){
        PasswordCheck pw = new PasswordCheck();
        assertFalse(pw.checkPassword("PassWord11111!"));
    }

    @Test
    @DisplayName("Check PW numbers - ascending numbers")
    public void testPasswordNumber4(){
        PasswordCheck pw = new PasswordCheck();
        assertFalse(pw.checkPassword("PassWord12345!"));
    }


    // Testing symbol requirements
    @Test
    @DisplayName("Check PW with valid symbols")
    public void testPasswordSymbol(){
        PasswordCheck pw = new PasswordCheck();
        assertTrue(pw.checkPassword("INeedNumbers(12)"));
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

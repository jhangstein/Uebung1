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
        assertTrue(pw.pwLength("Password1%"));
    }

    @Test
    @DisplayName("Check PW length - too short")
    public void testPasswordLength2(){
        PasswordCheck pw = new PasswordCheck();
        assertFalse(pw.pwLength("pass1%"));
    }

    @Test
    @DisplayName("Check PW length - too long")
    public void testPasswordLength3(){
        PasswordCheck pw = new PasswordCheck();
        assertFalse(pw.pwLength("supermegaultrasecurepassword122112))"));
    }


    // Testing Upper/Lower Case requirements
    @Test
    @DisplayName("Check PW with valid Aa")
    public void testPasswordUpperLower(){
        PasswordCheck pw = new PasswordCheck();
        assertTrue(pw.pwContainsUpperLowerCase("VerySecure1!!1!"));
    }

    @Test
    @DisplayName("Check PW Aa - no upper")
    public void testPasswordUpperLower2(){
        PasswordCheck pw = new PasswordCheck();
        assertFalse(pw.pwContainsUpperLowerCase("verysecure1!!!1!"));
    }

    @Test
    @DisplayName("Check PW Aa - no letters")
    public void testPasswordUpperLower3(){
        PasswordCheck pw = new PasswordCheck();
        assertFalse(pw.pwContainsUpperLowerCase("1212121212!!!"));
    }


    // Testing numeral requirements
    @Test
    @DisplayName("Check PW with numbers")
    public void testPasswordNumber(){
        PasswordCheck pw = new PasswordCheck();
        assertTrue(pw.pwContainsNumber("PassWord12!"));
    }

    @Test
    @DisplayName("Check PW numbers - no numbers")
    public void testPasswordNumber2(){
        PasswordCheck pw = new PasswordCheck();
        assertFalse(pw.pwContainsNumber("WhoNeedsNumbersAnyways?"));
    }

    @Test
    @DisplayName("Check PW numbers - repeated numbers")
    public void testPasswordNumber3(){
        PasswordCheck pw = new PasswordCheck();
        assertFalse(pw.pwContainsNumber("PassWord11111!"));
    }

    @Test
    @DisplayName("Check PW numbers - ascending numbers")
    public void testPasswordNumber4(){
        PasswordCheck pw = new PasswordCheck();
        assertFalse(pw.pwContainsNumber("PassWord12345!"));
    }


    // Testing symbol requirements
    @Test
    @DisplayName("Check PW with valid symbols")
    public void testPasswordSymbol(){
        PasswordCheck pw = new PasswordCheck();
        assertTrue(pw.pwContainsAllowedSymbol("INeedNumbers(12)"));
    }

    @Test
    @DisplayName("Check PW without symbols")
    public void testPasswordSymbol2(){
        PasswordCheck pw = new PasswordCheck();
        assertFalse(pw.pwContainsAllowedSymbol("IDontNeedSymbols1"));
    }

    @Test
    @DisplayName("Check PW with invalid symbols")
    public void testPasswordSymbol3(){
        PasswordCheck pw = new PasswordCheck();
        assertFalse(pw.pwContainsAllowedSymbol("INeedSymbols&MuchMore1"));
    }
}

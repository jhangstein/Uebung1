package at.ac.fhcampuswien;

public class PasswordCheck {
    public boolean isValid(String pw) {
        if (pw.length()<= 7 || pw.length() >= 24) {
            return false;
        }
        return true;
    }
}

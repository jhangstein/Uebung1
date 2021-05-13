package at.ac.fhcampuswien;

public class PasswordCheck {
    public boolean checkPassword(String pw) {
        if (pwLength(pw)){
            if (pwContainsUpperLowerCase(pw)){
                return true;
            }
        }
        return false;
    }

    public boolean pwLength(String pw){
        return pw.length() > 7 && pw.length() < 24;
    }

    public boolean pwContainsUpperLowerCase(String pw){
        boolean containsLower = false, containsUpper = false;
        for(int i = 0; i < pw.length(); i++){
            if (pw.charAt(i) >= 65 && pw.charAt(i) <= 90){
                containsUpper = true;
            }
            else if (pw.charAt(i) >= 97 && pw.charAt(i) <= 122){
                containsLower = true;
            }
        }
        if (containsLower && containsUpper) return true;
        else return false;
    }
}

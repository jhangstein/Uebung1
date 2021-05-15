package at.ac.fhcampuswien;

public class PasswordCheck {
    public boolean checkPassword(String pw) {
        return pwLength(pw) && pwContainsUpperLowerCase(pw) && pwContainsNumber(pw) && pwContainsAllowedSymbol(pw);
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

    public boolean pwContainsNumber(String pw){
        for (int i = 0; i < pw.length(); i++){
            if (pw.charAt(i) >= 48 && pw.charAt(i) <= 57){
                if (i <= pw.length()-2 && pw.charAt(i+1) == pw.charAt(i) && pw.charAt(i+2) == pw.charAt(i)){
                    return false;
                }
                else if (i <= pw.length()-2 && pw.charAt(i+1) == pw.charAt(i)+1 && pw.charAt(i+2) == pw.charAt(i)+2){
                    return false;
                }
                else return true;
            }
        }
        return false;
    }

    public boolean pwContainsAllowedSymbol(String pw){
        for (int i = 0; i < pw.length(); i++){
            if (pw.charAt(i) == 33 || pw.charAt(i) == 35 || pw.charAt(i) == 36 || pw.charAt(i) == 37 ||
                pw.charAt(i) == 40 || pw.charAt(i) == 41 || pw.charAt(i) == 47 || pw.charAt(i) == 63 ||
                pw.charAt(i) == 64) {
                return true;
            }
        }
        return false;
    }
}

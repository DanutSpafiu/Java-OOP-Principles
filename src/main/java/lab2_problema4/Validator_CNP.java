package lab2_problema4;

public class Validator_CNP {
    public static boolean isValid(String cnp) {
        //Caz 1: nu are 13 cifre
        if(cnp.length() != 13) return false;

        //Caz 2: are altceva in afara de cifre
        for(int i = 0; i < cnp.length(); i++) {
            if(!Character.isDigit(cnp.charAt(i))) return false;
        }

        //Caz 3: prima cifra nu e 1, 2, 5 sau 6
        int firstDigit = Integer.parseInt(cnp.substring(0, 1));
        if(firstDigit != 1 && firstDigit != 2 && firstDigit != 5 && firstDigit != 6) return false;

        return true;
    }
}

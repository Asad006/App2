package oop.example.ex25.base;

public class PasswordValidator {

    public String passwordState(String password) {

        String flag="";

        int digitsCount = 0;
        int lettersCount = 0;
        int specialCharacterCount = 0;

        char charInPass;

        for (int i = 0; i < password.length(); i++) {
            charInPass = password.charAt(i);

            if (Character.isDigit(charInPass)) {
                digitsCount++;

            } else if (Character.isLetter(charInPass)) {
                lettersCount++;
            } else
            {
                specialCharacterCount++;


            }
        }

        if (digitsCount == password.length() && password.length() < 8) {
            flag= "1";

        } else if (password.length() == lettersCount && password.length() < 8) {
            flag= "2";

        } else if (specialCharacterCount ==0 && lettersCount != 0 && digitsCount != 0 && password.length() >= 8 ) {
            flag= "3";
        } else  if (lettersCount !=0 && digitsCount !=0 && specialCharacterCount !=0 && password.length()>= 8){
            flag= "4";
        }

        return flag;

    }

}

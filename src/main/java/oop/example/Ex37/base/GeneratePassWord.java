package oop.example.Ex37.base;

import java.util.ArrayList;
import java.util.Random;

public class GeneratePassWord {
    public String generate(int minimumLength, int numberNumbers, int numberSpecialCaracters) {
        ArrayList<Character> chars = new ArrayList<Character>();
        ArrayList<String> randomPass = new ArrayList<String>();
        Random random = new Random();
        chars.add('@');
        chars.add('#');
        chars.add('$');
        chars.add('*');
        chars.add('%');
        chars.add('!');
        String passWord="";
        String finalPassWord="";

        ///l=n+s len =2n+2s
        if (minimumLength-2*numberNumbers-2*numberSpecialCaracters<0){
            minimumLength +=Math.abs(minimumLength-2*numberNumbers-2*numberSpecialCaracters);

        }
        for (int i = 0; i < minimumLength; i++) {
            randomPass.add("0");

        }

        for (int i = 0; i < numberSpecialCaracters; i++) {
            randomPass.set(random.nextInt(minimumLength),passWord+chars.get(random.nextInt(5)));
            randomPass.set(random.nextInt(minimumLength),""+(char)(random.nextInt(26)+97));

        }
        for (int i = 0; i < numberNumbers; i++) {
            randomPass.set(random.nextInt(minimumLength),passWord+chars.get(random.nextInt(5)));
            randomPass.set(random.nextInt(minimumLength),""+(random.nextInt(9)));

        }

        for (int i = 0; i < minimumLength; i++) {

            if (randomPass.get(i).equals("0")){
                randomPass.set(random.nextInt(minimumLength),""+(char)(random.nextInt(26)+97));
            }

        }
        for (int i = 0; i <randomPass.size(); i++) {

            finalPassWord =finalPassWord+randomPass.get(i);

        }

        return finalPassWord;
    }

}

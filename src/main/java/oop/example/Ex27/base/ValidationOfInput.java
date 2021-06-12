package oop.example.Ex27.base;

public class ValidationOfInput {
    String message = "";
    Boolean isValid = true;

    public String validateInput(String lastname, String firstname, String zipCode, String employeeID) {

        String msg = getLastNameValidation(lastname) + "\n" + getFirstNameValidation(firstname) + "\n" + getZipCodeValidation(zipCode) + "\n" + getEmployeeValidation(employeeID);
                /*
        String.format(message + getLasnNameValidation(lastname)+"\n"+getFirstNameValidation(firstname)+"\n"+getZipCodeValidation(zipCode));*/
        if (getZipCodeValidation(zipCode) == "" && getFirstNameValidation(firstname) == "" && getLastNameValidation(lastname) == "" && getEmployeeValidation(employeeID) == "") {
            msg = "There were no errors found.";
        }
        return msg;
    }

    private String getEmployeeValidation(String empId) {
        String msg = "";
        for (int i = 0; i < empId.length(); i++) {
            if (i == 0 && Character.isDigit(empId.charAt(i))) {

                msg = "The employee ID must be in the format of AA-1234.";
            } else if (i == 2 && Character.isDigit(empId.charAt(i))) {
                msg = "The employee ID must be in the format of AA-1234.";

            } else if (i == 3 && empId.charAt(i) != '-') {
                msg = "The employee ID must be in the format of AA-1234.";

            } else if (Character.isLetter(empId.charAt(i))) {
                msg = "The employee ID must be in the format of AA-1234.";
            } else {
                msg = "";
            }

        }
        System.out.println(msg);
        return msg;

    }

    private String getZipCodeValidation(String zipCod) {
        int zipCode;
        try {
            zipCode = Integer.parseInt(zipCod);
            int count = 0;
            while (zipCode != 0) {
                // num = num/10
                zipCode /= 10;
                ++count;
            }

            if (count < 5) {
                return "The zipcode must be a 5 digit number.";
            } else {
                return "";
            }
        } catch (Exception e) {
            return "The zipcode must be a 5 digit number.";
        }

    }

    private String getFirstNameValidation(String firstname) {

        if (firstname.equals("")) {
            return "The first name must be filled in.\n" + "The first name must be at least 2 characters long.";
        } else if (firstname.length() < 2) {
            return "The first name must be at least 2 characters long.";

        } else {
            return "";
        }
    }

    private String getLastNameValidation(String lastname) {
        if (lastname.equals("")) {
            return "The last name must be filled in.\n" + "The first name must be at least 2 characters long.";
        } else if (lastname.length() < 2) {
            System.out.println(lastname.length());
            return "The last name must be at least 2 characters long.";

        } else {
            return "";
        }
    }


}

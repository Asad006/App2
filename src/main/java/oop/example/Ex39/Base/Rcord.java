package oop.example.Ex39.Base;

public class Rcord {
    private String lastName;
    private String  firstname;;
    private String prosition;
    private String separationDate;

    public Rcord(String lastName, String firstname, String prosition, String separationDate) {
        this.lastName = lastName;
        this.firstname = firstname;
        this.prosition = prosition;
        this.separationDate = separationDate;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getProsition() {
        return prosition;
    }

    public String getSeparationDate() {
        return separationDate;
    }
}

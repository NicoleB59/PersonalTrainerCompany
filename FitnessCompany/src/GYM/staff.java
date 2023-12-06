package GYM;

//Importing another packages class to identify it in this class
import PEOPLE.trainees;
public class staff{

    //Declaring the variables
    public String name;
    public String hireDate;
    public String phoneNum;

    //Referencing another class
    public trainees trainees;

    public appointments appointments;


    //Getting and Setting methods for the variables above
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public PEOPLE.trainees getTrainees() {
        return trainees;
    }

    public void setTrainees(PEOPLE.trainees trainees) {
        this.trainees = trainees;
    }

    public GYM.appointments getAppointments() {
        return appointments;
    }

    public void setAppointments(GYM.appointments appointments) {
        this.appointments = appointments;
    }

    //Generating a toString method for format to be displayed
    @Override
    public String toString() {
        return "staff{" +
                "name = " + name + " " +
                ", this trainer has " + hireDate + " of experience " +
                ", phoneNum = " + phoneNum + " " + "\n\t" +
                " trainees = " + trainees + ", " + "\n\t" +
                " appointments = " + appointments + " " +
                '}';
    }
}

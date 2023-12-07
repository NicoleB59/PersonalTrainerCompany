package GYM;

//Importing another packages class to identify it in this class
import PEOPLE.trainees;
import COST.payments;

public final class staff{

    //Declaring the variables
    public String name;
    public String hireDate;
    public String phoneNum;

    //Referencing another package
    public trainees trainees;
    public payments payments;

    //Referencing from the same package
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

    public COST.payments getPayments() {
        return payments;
    }

    public void setPayments(COST.payments payments) {
        this.payments = payments;
    }

    //Generating a toString method for format to be displayed
    @Override
    public String toString() {
        return "staff{" +
                "name = " + name + " " +
                ", this trainer has " + hireDate + " of experience " +
                ", phoneNum = " + phoneNum + " " + "\n\t" +
                " trainees = " + trainees + ", " + "\n\t" +
                " appointments = " + appointments + "\n\t" +
                " payments = " + payments + " " +
                '}';
    }
}

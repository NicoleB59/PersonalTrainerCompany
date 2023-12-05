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

    //Generating a

    @Override
    public String toString() {
        return "staff{" +
                "name='" + name + " " +
                ", hireDate='" + hireDate + " " +
                ", phoneNum='" + phoneNum + " " +
                ", trainees=" + trainees +
                ", appointments=" + appointments +
                '}';
    }
}

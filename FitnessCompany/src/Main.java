//Importing all files from GYM package to main class
import GYM.*;
import COST.*;
import PEOPLE.*;

public class Main {
    public static void main(String[] args) {

        //Setting a new appointment for output
        appointments appointments1 = new appointments();
        //Adding a try and catch method for code to throw an exception
        //When appointments are less than one
        try {
            appointments1.setNumOfApp(0);
            appointments1.setType(excercise.ARMS);
            appointments1.setDate("5th of Feb");
            appointments1.setTime("15:30pm");
        } catch (Exception e) {
            System.out.println("***AN EXCEPTION HAS OCCURRED*** " + e.getMessage());
        }

        //Creating a new appointment for output
        appointments appointments2 = new appointments();

        try{
            appointments2.setNumOfApp(1);
            appointments2.setType(excercise.CARDIO);
            appointments2.setDate("12th of October");
            appointments2.setLocation(location.OUTDOOR);
            appointments2.setTime("16:00pm");
        } catch (Exception e) {
            System.out.println("***AN EXCEPTION HAS OCCURRED*** " + e.getMessage());
        }


        //Creating a new appointment for output
        appointments appointments3 = new appointments();

        try{
            appointments3.setNumOfApp(1);
            appointments3.setType(excercise.ABS);
            appointments3.setDate("14th of March");
            appointments3.setLocation(location.INDOOR);
            appointments3.setTime("14:00pm");
        } catch (Exception e) {
            System.out.println("***AN EXCEPTION HAS OCCURRED*** " + e.getMessage());
        }


        //setting a new payment for output
        payments payment1 = new payments();

        //adding a try and catch method for code to throw an exception
        try{
            payment1.setMembership(membership.BASICMEMBERSHIP.name());
            payment1.setCost(30);
        } catch (Exception e){
            System.out.println("***AN EXCEPTION HAS OCCURRED*** " + e.getMessage());
        }


        //setting a new payment for output
        payments payment2 = new payments();

        //adding a try and catch method for code to throw an exception
        try{
            payment1.setMembership(membership.PROMEMBERSHIP.name());
            payment1.setCost(60);
        } catch (Exception e){
            System.out.println("***AN EXCEPTION HAS OCCURRED*** " + e.getMessage());
        }

        //Print new line
        System.out.println();

        //setting a new trainee for output - had to make trainees not abstract
        trainees trainees1 = new trainees();

        try{
            trainees1.setName("Louise Mere");
            trainees1.setAge(18);
            trainees1.setPhone("083-625-1384");
            trainees1.setAddress("134 NashField");
            trainees1.setNumOfMembership(0);
        } catch (Exception e) {
            System.out.println("***AN EXCEPTION HAS OCCURRED*** " + e.getMessage());
        }

        //Print new line
        System.out.println();

        //Setting a new staff member for output
        staff staff1 = new staff();

        //Adding a try and catch method for code to throw an exception
        try {
            staff1.setName("Jared Andoerson");
            staff1.setHireDate("3 years");
            staff1.setPhoneNum("083-456-8806");
            staff1.setTrainees(trainees1);
            staff1.setAppointments(appointments2);
        } catch (Exception e) {
            System.out.println("***AN EXCEPTION HAS OCCURRED*** " + e.getMessage());
        }

        //Printing the staff components
        System.out.println(staff1);

        //Print new line
        System.out.println();

        //setting a new trainee for output - had to make trainees not abstract
        trainees trainees2 = new trainees();

        try{
            trainees2.setName("Taylor Cahill");
            trainees2.setAge(23);
            trainees2.setPhone("086-322-9824");
            trainees2.setAddress("72 OaklowField");
            trainees2.setNumOfMembership(1);
        } catch (Exception e) {
            System.out.println("***AN EXCEPTION HAS OCCURRED*** " + e.getMessage());
        }

        //Setting a new staff member for output
        staff staff2 = new staff();

        //Adding a try and catch method for code to throw an exception
        try {
            staff2.setName("Emily Vonga");
            staff2.setHireDate("5 years");
            staff2.setPhoneNum("083-465-2819");
            staff2.setTrainees(trainees2);
            staff2.setAppointments(appointments3);
        } catch (Exception e) {
            System.out.println("***AN EXCEPTION HAS OCCURRED*** " + e.getMessage());
        }

        //Printing the staff components
        System.out.println(staff2);


    }
}

package GYM;
//Importing a packages class in order for class to identify it
import PEOPLE.location;

public class appointments{
    //Declaring the variables
    public excercise type;
    public String time;
    public String date;
    public static int numOfApp;

    //Referencing another class(From another package)
    public location location;

    //Getting and setting methods for each variable above

    public excercise getType() {
        return type;
    }

    public void setType(excercise type) {
        this.type = type;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getNumOfApp() {
        return numOfApp;
    }

    //  If number of appointments are less than 1
    //  therefore it throws in a new exception
    public void setNumOfApp(int numOfApp) throws Exception{
        if(numOfApp < 1){
            throw new Exception("There are no appointments");
        }
        this.numOfApp = numOfApp;
    }

    public appointments() {
        numOfApp++;
    }

    public PEOPLE.location getLocation() {
        return location;
    }

    public void setLocation(PEOPLE.location location) {
        this.location = location;
    }


    @Override
    public String toString() {
        return "appointments{" +
                "Excercise = " + type +
                ", time = " + time + " " +
                ", date = " + date + " " +
                ", location = " + location +
                '}';
    }
}

package PEOPLE;

public class trainees {
    public String name;
    public int age;
    public String address;
    public String phone;

    public static int numOfMembership;

    //Get and set for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //get and set for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //get and set for address
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //get and set phone
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public static int getNumOfMembership() {
        return numOfMembership;
    }

    //constructor - not sure if we should add a constructor to the abstract class T-T
    public static void setNumOfMembership(int numOfMembership) throws Exception{
        if(numOfMembership < 1) {
            throw new Exception("Cancelled their appointment.");
        }
        trainees.numOfMembership = numOfMembership;
    }

    //string
    @Override
    public String toString() {
        return "trainees{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}


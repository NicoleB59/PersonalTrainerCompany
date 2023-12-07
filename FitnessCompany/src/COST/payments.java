package COST;

public class  payments {
    public String membership;
    public int cost;

    //get and set for membership
    public String getMembership() {
        return membership;
    }

    public void setMembership(String membership) {
        this.membership = membership;
    }

    //get and set for Cost
    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    //constructor - didn't discuss anything about this

    //String
    @Override
    public String toString() {
        return "payments{" +
                "membership='" + membership + '\'' +
                ", cost=" + cost +
                '}';
    }
}


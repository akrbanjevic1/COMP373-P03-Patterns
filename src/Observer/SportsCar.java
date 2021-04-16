package Observer;

public class SportsCar implements Observer {
    private String name;
    private int ID;

    public void setUpdate(String message) {
        System.out.println(this.getName() + " with ID of: "+this.getID() + " " + message);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return this.ID;
    }

    public String getName() {
        return this.name;
    }
}

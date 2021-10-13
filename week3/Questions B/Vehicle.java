public class Vehicle {
    private String manufacName;
    private int numOfCylinders;
    private Person owner;

    public Vehicle(String mName, int nCyl, Person owner){
        this.manufacName = mName;
        this.numOfCylinders = nCyl;
        this.owner = owner;
    }
    public String getManufacturer(){
        return this.manufacName;
    }
    public void setManufacturer(String mName){
        this.manufacName = mName;
    }
    public int getCylinders(){
        return this.numOfCylinders;
    }
    public void setCylinders(int nCyl){
        this.numOfCylinders = nCyl;
    }
    public String getOwner(){
        return owner.getName();
    }
    public void setOwner(Person owner){
        this.owner = owner;
    }
}

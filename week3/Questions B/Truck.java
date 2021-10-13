public class Truck extends Vehicle{
    private double loadCapacity;
    private int towCapacity;

    public Truck(String mName, int nCyl, Person owner, double load, int tow){
        super(mName, nCyl, owner);
        this.loadCapacity = load;
        this.towCapacity = tow;
    }
    public double getLoadCapacity(){
        return this.loadCapacity;
    }
    public void setLoadCapacity(double load){
        this.loadCapacity = load;
    }
    public int getTowCapacity(){
        return this.towCapacity;
    }
    public void setTowCapacity(int tow){
        this.towCapacity = tow;
    }
    public String toString(){
        return("Owner: " + getOwner() + "\nManufacturer: " + getManufacturer() + "\nCylinders: " + getCylinders() + "\nLoad Capacity: " + getLoadCapacity());
    }

}

public class RoomCarpet {
    private RoomDimension size;
    private double carpetCost;

    public RoomCarpet(RoomDimension dim, double cost){
        this.size = dim;
        this.carpetCost = cost;
    }

    public double getTotalCost(){
        return this.size.area() * this.carpetCost;
    }

    public String toString(){
        return (this.size + "Cost: " + this.carpetCost);
    }
}

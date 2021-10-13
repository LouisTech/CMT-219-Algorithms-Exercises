public class RoomDimension {
    private  double length;
    private double width;

    public RoomDimension(double len, double w){
        this.length = len;
        this.width = w;
    }

    public double area(){
        return this.width * this.length;
    }
    public String toString(){
        return("Length " + this.length + "\tWidth: " + this.width);
    }
}

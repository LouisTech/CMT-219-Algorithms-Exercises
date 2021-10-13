public class Employee {
    private String name;
    private int idNumber;
    private String department;
    private String position;

    public Employee(String name, int idNumber, String department, String position){
        this.name = name;
        this.idNumber = idNumber;
        this.department = department;
        this.position = position;
    }
    public Employee(String name, int idNumber){
        this.name = name;
        this.idNumber = idNumber;
        this.department = "";
        this.position = "";
    }
    public Employee(){
        this.name = "";
        this.idNumber = 0;
        this.department = "";
        this.position = "";
    }

    public String getName(){
        return this.name;
    }
    public int getIDNum(){
        return this.idNumber;
    }
    public String getDep(){
        return this.department;
    }
    public String getPos(){
        return this.position;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setIDNum(int idNumber){
        this.idNumber = idNumber;
    }
    public void setDep(String department){
        this.department = department;
    }
    public void setPos(String position){
        this.position = position;
    }
    public String toString(){
        return (getName() + "\t" + getIDNum() + "\t" + getDep() + "\t" + getPos());
    }
}

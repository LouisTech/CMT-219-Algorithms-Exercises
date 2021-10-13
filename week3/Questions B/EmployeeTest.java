public class EmployeeTest {
    public static void main(String[] args) {
        System.out.println("Name\t" + "   ID Number " + "Department " + "Position");

        Employee Matt = new Employee("Matt Morgan", 67485, "COMSC", "Lecturer");
        Employee Tim = new Employee("Tim Marshall", 78495, "BIOSO", "Professor");
        Employee Richard = new Employee("Richard Wright", 43637, "PHYSX", "Reader");

        System.out.println(Matt);
        System.out.println(Tim);
        System.out.println(Richard);

    }
}

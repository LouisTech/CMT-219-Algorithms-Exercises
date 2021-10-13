public class StudentTest {
    public static void main(String[] args) {
        Student louis = new Student("Louis", "Taylor");
        System.out.println( louis.getForename() );
        System.out.println( louis.getSurname() );
        System.out.println( louis.getAverageMark() );
        System.out.println( louis );
        
        Student sammy = new Student("Sammy", "Loony", 62);
        System.out.println( sammy.getForename() );
        System.out.println( sammy.getSurname() );
        System.out.println( sammy.getAverageMark() );
        System.out.println( sammy );

    }
}
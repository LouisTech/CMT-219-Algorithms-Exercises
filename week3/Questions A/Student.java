public class Student {

   private static int nextAvailableNumber = 0;

   // Data members.
   private String forename;
   private String surname;
   private int number;
   private float averageMark;

   public Student(String inForename, String inSurname) {
	   this.init(inForename, inSurname);
   }
   public Student(String inForename, String inSurname, int inAvgMark) {
      this.averageMark = inAvgMark;
      this.init(inForename, inSurname);
   }
   private void init(String inForename, String inSurname){
      this.number = nextAvailableNumber++;
	   this.forename = inForename;
	   this.surname = inSurname;
   }


   public String getForename() {
      return forename;
   }

   public String getSurname() {
      return surname;
   }

   public int getNumber() {
      return number;
   }

   public float getAverageMark() {
      return averageMark;
   }
 
   public void setAverageMark(float inMark) {
      if (inMark >= 0 && inMark <= 100) {
          this.averageMark = inMark;
      } else {
          System.out.println("Error: average mark must be >=0 and <= 100.");
          System.out.println("average mark not modified.");
      }
   }

   public String toString() {
      String s = surname + ", " + forename + " (" + number + ")";
      s += ": mean = " + averageMark;
      return s;
   }
}
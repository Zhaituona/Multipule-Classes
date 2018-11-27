package useOfMultipuleClasses;

public class Student {

    String studentName;
   static int studentAge;
   static int studentID;

   public Student(String studentName){
       this.studentName = studentName;
   }



    public void getStudentName(){
        System.out.println(studentName);
    }
    public static int getStudentAge(int studentAge){
        return studentAge;
    }
    public static int getStudentID(){
        return studentID;
    }
}

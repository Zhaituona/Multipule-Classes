package useOfMultipuleClasses;

public class TestPnt {
    public static void main(String[] args) {
        Student st1 = new Student("zaytuna");
        Student.studentID = 3747;
        Student.getStudentAge(31);
        System.out.println("I am a student" +  "my name is  : " + st1.studentName);



        Teacher mahi = new Teacher(35);
        mahi.teacherDOB = 11/23/1980;
        System.out.println("Teacher is mahi and the age might be  " + mahi.teacherAge);

        Classroom clas1 = new Classroom(50,"Selenium");
        clas1.displayClassroomName();
        System.out.println("We are " + " " + clas1.displayClassroomName()+ " we might have " + " " + clas1.tableNumber);

        PNT nyCampus = new PNT();
        PNT.displayLocationName("Astoria");
        PNT.getAdminNumber();
        System.out.println("we are study in the  " + PNT.displayLocationName("Astoria"));
    }// do some test git
} // one more line added

//1728304

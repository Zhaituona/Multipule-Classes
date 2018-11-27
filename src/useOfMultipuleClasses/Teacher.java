package useOfMultipuleClasses;

public class Teacher {

    int teacherAge;
    String teacherName ;
    int teacherDOB ;

    public Teacher(int teacherAge){
        this.teacherAge =teacherAge;
    }

    public void getTeacherAge(){
        System.out.println(teacherAge);
    }
    public void getTeacherName(){
        System.out.println(teacherName);
    }
    public int displayTeacherDOB(){
        return teacherDOB;
    }
}

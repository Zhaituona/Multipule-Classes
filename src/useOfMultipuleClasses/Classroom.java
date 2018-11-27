package useOfMultipuleClasses;

public class Classroom {

    int tableNumber;
    String classroomName;

    public Classroom(int tableNumber, String classroomName){
        this.classroomName = classroomName;
        this.tableNumber= tableNumber;
    }

    public void getTableNumber(){
        System.out.println(tableNumber);
    }

    public String displayClassroomName(){
        return classroomName;
    }

}

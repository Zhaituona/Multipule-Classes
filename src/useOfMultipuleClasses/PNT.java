package useOfMultipuleClasses;

public class PNT {

    int classroomNumber;
   static  int adminNumber;
    static String locationName;


    public void getClassroomNumber(){
        System.out.println(classroomNumber);
    }
    public static int getAdminNumber() {
        return adminNumber;

    }
    public static String displayLocationName(String locationName){
        System.out.println(locationName);
        return locationName;
    }
}

public class Student {

    private static int Sid;
    static String FN;
    static String LN;
    Integer SID;

    // How many parameters? () - 0
    Student() {
        FN = "No First Name";
        LN = "No Last Name";
        this.SID = 0;

    }
//        Student(String FN, String LN) {
//        Student.FN = FN;
//        Student.LN = LN;
//        }

    Student(String FN, String LN) {
        Student.FN = FN;
        Student.LN = LN;
    }


    //How many parameters? () - 3
    Student(String FN, String LN, Integer SID) {
        Student.FN = FN;
        Student.LN = LN;
        this.SID = SID;
    }

    Student(String FN, int SID, String LN) {
        Student.FN = FN;
        Student.LN = LN;
        this.SID = SID;
    }

    // You can create overloaded constuctors by varying 1) The parameter number, 2 order
    public static void main(String[] args) {

        Student s4 = new Student( "Joe", "Dirt");
        System.out.println(s4.FN);
        System.out.println(s4.LN);
        System.out.println(s4.SID);
        System.out.println("------------------------");


        //Variable s1 is of student type
        Student s1;
        s1 = new Student("FN", "LN", 1);
        System.out.println(s1);
        System.out.println(s1.FN);

    Student s2;
    s2 = new Student("Tobiloba", "Ayodeji", 14141);
    System.out.println(s2.FN);
    System.out.println(s2.LN);

    Student s3;
    s3 = new Student("Miguel", "Gascaortaga", 31415);
    System.out.println(s3.FN);
    System.out.println(s3.LN);

    Student s5;
    s5 = new Student(FN, Sid, LN);

        //Student success center 180? tue thur 3-5pm
// Argument is the value
    }
}
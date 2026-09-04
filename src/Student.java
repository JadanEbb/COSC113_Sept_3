//https://github.com/JadanEbb/COSC113_Sept_3.git

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
//        Student.FN = FN;
//        Student.LN = LN;
        this(FN,LN);
        this.SID = SID;
    }

    Student(String FN, int SID, String LN) {
        Student.FN = FN;
        Student.LN = LN;
        this.SID = SID;

    }

    //Methods = Getters and Setters


    public static String getFN() {
        return FN;
    }

    public static void setFN(String FN) {
        Student.FN = FN;
    }

    public static String getLN() {
        return LN;
    }

    public static void setLN(String LN) {
        Student.LN = LN;
    }

    public static void setSid(int sid) {
        Sid = sid;
    }

    public Integer getSID() {
        return SID;
    }

    public void setSID(Integer SID) {
        this.SID = SID;
    }

    // You can create overloaded constuctors by varying 1) The parameter number, 2 order
    static void main(String[] args) {

        Student s6 = new Student();
        //Setting names
        s6.FN = "Joe";
        s6.setLN("MAMA!");
        s6.LN = "";
        Student s4 = new Student( "Joe", "Dirt");
        System.out.println(s4.FN);
        System.out.println(s4.LN);
        System.out.println(s4.SID);
        System.out.println("------------------------");


        //Variable s1 is of student type
        Student s1;
        s1 = new Student("FN", "LN", 1);
        System.out.println(s1);
        System.out.println(FN);

    Student s2;
    s2 = new Student("Tobiloba", "Ayodeji", 14141);
    System.out.println(FN);
    System.out.println(LN);

    Student s3;
    s3 = new Student("Miguel", "Gascaortaga", 31415);
    System.out.println(FN);
    System.out.println(LN);

    Student s5;
    s5 = new Student(FN, Sid, LN);
    System.out.println(FN);
    System.out.println(LN);



        //Student success center 180? tue thur 3-5pm
// Argument is the value
    }
}
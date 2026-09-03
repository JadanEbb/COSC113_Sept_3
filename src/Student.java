public class Student {

    String FN;
    String LN;
    Integer SID;

    // How many parameters? () - 0
    Student() {
        this.FN = "No First Name";
        this.LN = "No Last Name";
        this.SID = 0;

    }

    //How many parameters? () - 3
    Student(String FN, String LN, Integer SID) {
        this.FN = FN;
        this.LN = LN;
        this.SID = SID;
    }

    public static void main(String[] args) {
    //Variable s1 is of student type
        Student s1;
        s1 = new Student("FN", "LN", 1);
        System.out.println(s1);
        System.out.println(s1.FN);





// Argument is the value
    }




}
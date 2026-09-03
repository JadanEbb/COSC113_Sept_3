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

    Student s2;
    s2 = new Student("Tobiloba", "Ayodeji", 14141);
    System.out.println(s2.FN);
    System.out.println(s2.LN);

    Student s3;
    s3 = new Student("Miguel", "Gascaortaga", 31415);
    System.out.println(s3.FN);
    System.out.println(s3.LN);





    //Student success center 180? tue thur 3-5pm
// Argument is the value
    }




}
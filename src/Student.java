//https://github.com/JadanEbb/COSC113_Sept_3.git

public class Student {

    // 1. Three attributes
    private String firstName;
    private String lastName;
    private int studentId;

    // 2. Constructor 1: Default constructor
    public Student() {
        this("No First Name", "No Last Name", 0);
    }

    // 2. Constructor 2: Overloaded
    public Student(String firstName) {
        this(firstName, "No Last Name", 0);
    }

    // 2. Constructor 3: Overloaded
    public Student(String firstName, String lastName) {
        this(firstName, lastName, 0);
    }

    // 2. primary constructor
    public Student(String firstName, String lastName, int studentId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
    }

    // 3. Getter and Setter Methods
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public static void main(String[] args) {
        // Create objects using different constructors
        Student s1 = new Student();
        Student s2 = new Student("James", "Henry", 12);
        Student s3 = new Student("Joe", "Dirt", 67);
        Student s4 = new Student("Tobiloba", "Ayodeji", 14141);

        // Using setters
        s1.setFirstName("Miguel");
        s1.setLastName("Gascaortaga");
        s1.setStudentId(31415);

        // Using getters
        System.out.println("Student 1: " + s1.getFirstName() + " " + s1.getLastName() + " (ID: " + s1.getStudentId() + ")");
        System.out.println("Student 2: " + s2.getFirstName() + " " + s2.getLastName() + " (ID: " + s2.getStudentId() + ")");
        System.out.println("Student 3: " + s3.getFirstName() + " " + s3.getLastName() + " (ID: " + s3.getStudentId() + ")");
        System.out.println("Student 4: " + s4.getFirstName() + " " + s4.getLastName() + " (ID: " + s4.getStudentId() + ")");
    }
}
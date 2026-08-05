package Student;

class Student {
    // TODO: Declare a final field for studentId (String)
    private final String studentId;

    // TODO: Declare a final field for enrollmentYear (int)
    private final int enrollmentYear;

    // TODO: Declare a private field for name (String) - this one is NOT final
    private String name;

    // TODO: Create a constructor that takes studentId, name, and enrollmentYear
    // and initializes all fields
    public Student(String studentId,String name, int enrollmentYear){
        this.studentId = studentId;
        this.name = name;
        this.enrollmentYear = enrollmentYear;
    }

       // TODO: Create getter getStudentId()

    public String getStudentId() {
        return studentId;
    }

    // TODO: Create getter getEnrollmentYear()


    public int getEnrollmentYear() {
        return enrollmentYear;
    }

    // TODO: Create getter getName()
    public String getName() {
        return name;
    }

    // TODO: Create setter setName(String name)
    public void setName(String name) {
        this.name = name;
    }


    // TODO: Create method getInfo() that returns:
    // "ID: [studentId] | Name: [name] | Enrolled: [enrollmentYear]"
    public String getInfo(){
        return "ID: " + this.studentId + " | Name: " + this.name
                + " | Enrolled: " + enrollmentYear;
    }
}

public class Student {
    private String studentName;
    private int studentAge;
    private Classroom classroom;
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }


    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }


    public Student(String studentName, int studentAge, Classroom classroomObj) {
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.classroom = classroomObj;
    }
}

public class Classroom {
    //fields
    //an integer to represent class name
    private String class_name;

    //number of student that can be empty string
    private int numberOfStudents;

    //constructors

    //1st Parameterized constructor
    public Classroom(String name, int numberOfStudents){
        this.class_name = name;
        this.numberOfStudents = numberOfStudents;
    }
    //default constructor with an empty body
    public Classroom(){
        this.class_name = "None";
        this.numberOfStudents = 0;
    }
    //methods
    //getter and setter for each of the variable
    public String getClass_name(){
        return class_name;
    }
    public void setClass_name(String name){
        this.class_name = name;
    }

    public int getClassNumberOfStudents() {
        return numberOfStudents;
    }

    public void setClassNumberOfStudents(int numberofstudents) {
        this.numberOfStudents = numberofstudents;
    }
    //tostring method to better print the object
    public String toString() {
        return "Name: "+class_name + "\tNumber of students: "+ numberOfStudents;
    }
}

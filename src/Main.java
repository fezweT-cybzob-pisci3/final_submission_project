public class Main {
    public static void main(String[] args) {

        System.out.println("Application to Create school Clubs");
        // create a classroom object for a new class
        Classroom reception = new Classroom("Reception", 1);
        //create few students
        Student student1 = new Student("xyz", 5, reception);
        Student student2 = new Student("abc", 5, reception);
        // increment the number of students in class
        reception.setClassNumberOfStudents(2);
        //creat a school club
        SchoolClub footBallClub = new SchoolClub("Foot Ball Club");
        //test the attributes are set correct by constructor
        System.out.println("Club Name:" + footBallClub.getSchoolClubName());
        System.out.println("Club Members:" + footBallClub.getClubMembers());
        //add two students previously created in club
        footBallClub.setClubMembers(student1);
        footBallClub.setClubMembers(student2);
        // test all the students in the club
        for (Student member : footBallClub.getClubMembers()) {
            System.out.println("Club Members:" + member.getStudentName());

        }


    }
}
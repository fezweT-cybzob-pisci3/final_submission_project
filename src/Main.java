public class Main {
    public static void main(String[] args) {

        System.out.println("Application to Create school Clubs");
        // create a class
        Classroom reception = new Classroom("Reception", 1);
        Student student1 = new Student("xyz", 5, reception);
        Student student2 = new Student("abc", 5, reception);
        reception.setClassNumberOfStudents(2);
        SchoolClub footBallClub = new SchoolClub("Foot Ball Club");
        System.out.println("Club Name:" + footBallClub.getSchoolClubName());
        System.out.println("Club Members:" + footBallClub.getClubMembers());
        footBallClub.setClubMembers(student1);
        footBallClub.setClubMembers(student2);
        System.out.println("Club Members:" + footBallClub.getClubMembers());

    }
}
import java.util.ArrayList;

public class SchoolClub {
    private String schoolClubName;
    private ArrayList<Student> clubMembers;
    public String getSchoolClubName() {
        return schoolClubName;
    }

    public void setSchoolClubName(String schoolClubName) {
        this.schoolClubName = schoolClubName;
    }

    public ArrayList<Student> getClubMembers() {
        return clubMembers;
    }

    public void setClubMembers(Student clubMember) {
        clubMembers.add(clubMember);
    }

    public SchoolClub(String schoolClubName) {
        this.schoolClubName = schoolClubName;
        this.clubMembers = new ArrayList<>();
    }

}

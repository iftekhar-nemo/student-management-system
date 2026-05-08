public class UndergraduateStudent extends Student{
    private String semester;

    public UndergraduateStudent(String stdName, int stdId, Subject[] subjects, String semester){
        super(stdName, stdId, subjects);
        this.semester = semester;
    }
    public String getSemester(){
        return semester;
    }
}

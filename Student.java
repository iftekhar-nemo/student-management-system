
public class Student {
    private String stdName;
    private int stdId;
    private Subject[] subjects;

    Student(String stdName, int stdId, Subject[] subjects){
        this.stdName = stdName;
        this.stdId = stdId;
        this.subjects = subjects;
    }

    public String getStdName(){
        return stdName;
    }
    
    public int getStdId(){
        return stdId;
    }

    public Subject[] getSubjects(){
        return subjects;
    }
}
public class GraduateStudent extends Student{
    private String researchTopic;

    public GraduateStudent(String stdName, int stdId, Subject[] subjects, String researchTopic){
        super(stdName, stdId, subjects);
        this.researchTopic = researchTopic;
    }

    public String getResearchTopic(){
        return researchTopic;
    }
    
}
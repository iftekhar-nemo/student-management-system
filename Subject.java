public class Subject {
    private String subName;
    private String subCode;

    private StudentResult result;

    public Subject(String subName, String subCode, StudentResult result){
        this.subName = subName;
        this.subCode = subCode;
        this.result = result;
    }

    public String getSubName(){
        return subName;
    }

    public String getSubCode(){
        return subCode;
    }

    public StudentResult getResult(){
        return result;
    }
}

public class StudentResult {
    private double marks;
    private String grade;

    public StudentResult(double marks, String grade){
        this.marks = marks;
        this.grade = grade;
    }

    public double getMarks(){
        return marks;
    }
    public String getGrade(){
        return grade;
    }
}

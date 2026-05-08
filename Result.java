public class Result {
    public static double calculateGPA(double marks) {

        if (marks >= 80) {
            return 4.00;
        } else if (marks >= 70) {
            return 3.50;
        } else if (marks >= 60) {
            return 3.00;
        } else if (marks >= 50) {
            return 2.50;
        } else if (marks >= 40) {
            return 2.00;
        } else {
            return 0.00;
        }
    }

    public static String calculateGrade(double marks) {
        if (marks >= 80) {
            return "A+";
        } else if (marks >= 70) {
            return "A";
        } else if (marks >= 60) {
            return "A-";
        } else if (marks >= 50) {
            return "B";
        } else if (marks >= 40) {
            return "C";
        } else {
            return "F";
        }
    }

    public static Student searchStudent(Student[] students, int searchId) {
        for (Student student : students) {
            if (student.getStdId() == searchId) {
                return student;
            }
        }
        return null;
    }

}

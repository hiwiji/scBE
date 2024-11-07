package exercise.chapter_55;

public class Student {

    // 속성(1) 학교 정보

    private int schoolYear;
    private int classroomNumber;
    private int studentNumber;

    // 속성(2) 학생 개인정보
    private String name;
    private String gender;
    private int score;

    // 행위

    public String getName() { return this.name;  }

    public void setName(String name) {this.name = name;
    }

    public int getScore() { return score; }


    // 생성자

    Student(String name, String gender, int score) {
        this.name = name;
        this.gender = gender;
        this.score = score;
    }

    Student(String name, String gender, int schoolYear, int classroomNumber,
                    int studentNumber, int score) {
        this.name = name;
        this.gender = gender;
        this.schoolYear = schoolYear;
        this.classroomNumber = classroomNumber;
        this.studentNumber = studentNumber;
        this.score = score;
    }
}

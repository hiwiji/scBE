package exercise.chapter_28;

public class Teacher {
    // 선생님의 속성

    // 학교 정보
    String schoolName;

    // 담당 과목
    private Subject subject;

    // 기본 정보
    private String name;
    private String gender;


    //선생님의 행위
    void teach(Student student, String subjectName) {
        String studentName = student.getName();
        System.out.printf("선생: %s 학생에게 %s 과목을 가르치고 있습니다.\n", studentName, subjectName);
    }

    // 선생님 생성자
    Teacher() {}
    Teacher(String name, String gender, String subjectName, String subjectCode) {
        name = this.name;
        gender = this.gender;

        Subject subject = new Subject();
        subject.setSubjectName(subjectName);
        subject.setSubjectCode(subjectCode);

        this.subject = subject;
    }

    //getter
    public String getName(){
        return name;
    }
}

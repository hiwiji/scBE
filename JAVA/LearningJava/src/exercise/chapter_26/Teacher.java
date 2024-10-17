package exercise.chapter_26;

public class Teacher {
    // 선생님의 속성

    // 학교 정보
    String schoolName;

    // 담당 과목
    Subject subject;

    // 기본 정보
    String name;
    String gender;


    //선생님의 행위
    void teach(Student student, String subjectName) {
        String studentName = student.name;
        System.out.printf("선생: %s 학생에게 %s 과목을 가르치고 있습니다.\n", studentName, subjectName);
    }

    // 선생님 생성자
    Teacher() {}
    Teacher(String pName, String pGender, String pSubjectName, String pSubjectCode) {
        name = pName;
        gender = pGender;

        Subject newSubject = new Subject();
        newSubject.subjectName = pSubjectName;
        newSubject.subjectCode = pSubjectCode;

        subject = newSubject;
    }
}

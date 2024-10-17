package exercise.chapter_28;

public class Student {

    // 학생 속성
    private String schoolName;
    private int classYear; // 몇 학년
    private int classroomNumber; // 몇 반
    private int studentNumber; // 몇 번

    // 기본 정보
    private String name;
    private String gender;

    // 학생 행위
    void study(Teacher teacher, String subjectName) {
        String teacherName = teacher.getName();
        System.out.printf("학생: 저는 %s 선생님에게 %s 과목을 배웁니다.\n", teacherName, subjectName);
    }

    // 생성자
    Student(){
    }

    Student(String Name, String Gender){
        this.name = Name;
        this.gender = Gender;
    }

    Student(String schoolName, int classYear, int classroomNum, int studentNum, String name, String pGender) {
        this.schoolName = schoolName;
        this.classYear = classYear;
        this.classroomNumber = classroomNum;
        this.studentNumber = studentNum;
        this.name = name;
        this.gender = gender;
    }

    // getter
    public String getName() {
        return name;
    }


}

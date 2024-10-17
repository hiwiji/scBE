package exercise.chapter_26;

public class InstanceTest {

    public static void main(String[] args) {
        // 생성자를 만들고 나면 구분이 안가기 때문에, 밑에 상세정보(?)를 적어준다
        Student student1 = new Student("School", 1, 3, 20, "Bob", "Male");
        System.out.println(student1.name);
        System.out.println(student1.gender);
        System.out.println(student1.studentNumber);

        Student student2 = new Student("School", 1, 3, 15, "Alice", "Female");
        System.out.println(student2.name);
        System.out.println(student2.gender);
        System.out.println(student2.studentNumber);


        Student student3 = new Student();
        System.out.println(student3.name);
        Student student4 = new Student();

        // 선생님
        Teacher teacher = new Teacher("Tom", "Female", "Korean", "AB001");


        // subject 선행해서 만들어줌 ( subject를 클래스로 따로 빼서 했으니까?)
        // Teacher 클래스에서 생성자 오버로딩 으로 만들어줌
//        Subject koreanSubject = new Subject();
//        koreanSubject.subjectName = "korean";
//        koreanSubject.subjectCode = "AB001";
//
//        teacher.subject = koreanSubject;


        System.out.println(teacher.name);
        System.out.println(teacher.gender);
        System.out.println(teacher.subject.subjectName);
        System.out.println(teacher.subject.subjectCode);
    }
}

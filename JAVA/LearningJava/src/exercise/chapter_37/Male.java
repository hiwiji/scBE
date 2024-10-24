package exercise.chapter_37;

import java.sql.SQLOutput;

public class Male extends FamilyMan implements FamilyRole, EmployeeRole {
    // 속성
    private int age;
    private String job;


//    @Override
//    public void sayLoveEveryDay() {
//        System.out.println("우리 가족 사랑합니다.");
//    }

    @Override
    public void workTogether(EmployeeRole employeeRole) {
        String name = employeeRole.getName();
        System.out.println("이름이 " + name + "인 직장동료와 업무를 하고 있습니다.");
    }



    @Override
    public String getName() {
        return this.name;
    }

    public Male(String name) {
        this.name = name;


    }
}

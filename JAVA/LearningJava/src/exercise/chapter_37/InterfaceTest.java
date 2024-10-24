package exercise.chapter_37;

public class InterfaceTest {

    public static void main(String[] args) {
        // Male 3개 남편, 아빠, 회사원

        // 1. 남편
        HusbandRole male = new Male("철수");
        Wife wife = new Female("아이유");

        male.sayLoveEveryDay();
        male.takeCareWife(wife);


        // 2. 아빠
        DaddyRole maleDaddy = (DaddyRole) male;
        Baby baby = new Baby("유기현");

        maleDaddy.educateBaby(baby);
        male.sayLoveEveryDay();

        // 3. 회사원
        EmployeeRole maleEmployee = (EmployeeRole) maleDaddy;
        //EmployeeRole femaleEmployee = new Female("김채원");
        EmployeeRole maleEmployeeTwo = new MaleTwo("민철");

        //maleEmployee.workTogether(femaleEmployee);
        maleEmployee.workTogether(maleEmployeeTwo);
    }
}

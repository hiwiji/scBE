package exercise.chapter_31;

public class SeaSituation {


    public static void main(String[] args) {
        // 부모 인스턴스화
        Fish fish1 = new Fish();
        fish1.setSex("Male");
        fish1.setLeavingSea("동해");
        fish1.setHavingPoison(false);

        // 자식 인스턴스화
         FishChild fish2 = new FishChild();
         fish2.setSex("Female");
         fish2.setLeavingSea("서해");
         fish2.setHavingPoison(false);

         fish2.becomeDanger();
         System.out.println("독성여부: " + fish2.isHavingPoison());

         //Override
         fish1.eat("새우");
         fish2.eat("새우");

//         fish1.printfMyInfo();
//         fish2.printfMyInfo();
//
//         fish2.digging();
//         fish2.setEatable(true);
         // fish1.digging();
         // 자식에만 추가된거라 부모에 적용하면 오류남

        //System.out.println(fish2.isEatable());
    }
}

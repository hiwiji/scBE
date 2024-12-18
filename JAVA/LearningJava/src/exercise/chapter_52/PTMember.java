package exercise.chapter_52;

import exercise.chapter_51.exceptions.IDFormatException;
import exercise.chapter_51.exceptions.PositiveNumberException;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class PTMember {

    // 필드
    private String ID;
    private String name;
    private Integer height;
    private Integer weight;
    private Gender gender;

    private LocalDateTime enrollTime;


    // 생성자

    public PTMember(String name, Integer height, Integer weight, String gender) {
        if (height <= 0 )  throw new PositiveNumberException("키는 0이하 일 수 없습니다.");
        if (weight <= 0 ) throw new PositiveNumberException("몸무게는 0이하 일 수 없습니다.");

        this.name = name;
        this.height = height;
        this.weight = weight;
        this.gender = Gender.valueOfTerm(gender);
        this.enrollTime = LocalDateTime.now();
    }

    // setter

    public void setID(String ID) {
        if (ID == null) throw new IDFormatException("ID는 Null이 될 수 없습니다.");
        if (ID.length() <8 || ID.length() > 20) throw new IDFormatException("ID는 8자 이상 20자 이하만 가능합니다.");

        this.ID = ID;
    }

    @Override
    public String toString() {
        return "PTMember{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", gender=" + gender +
                ", enrollTime=" + enrollTime +
                '}';
    }
}

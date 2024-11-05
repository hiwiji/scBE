package exercise.chapter_44;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClassTest {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Customer customer = new Customer("민철");
        Class clazz = customer.getClass();
        // Class clazz2 = Customer.class;

        // 생성자 불러오기
//        Constructor[] constructors = clazz.getConstructors();
//        for (Constructor constructor : constructors) {
//            System.out.println(constructor);
//        }

        // 메소드 불러오기
//        Method[] methods = clazz.getMethods();
//        for(Method method: methods){
//            System.out.println(method);
//        }

        // 필드 불러오기 ( 필드는 public만 불러옴)
        // Field[] fields = clazz.getFields();
//        Field[] fields = clazz.getDeclaredFields(); // 모든 필드 불러옴
//        for(Field field : fields){
//            System.out.println(field);
//        }

        // 메타정보로 생성된건 object여서 다운캐스팅해줘야함.
        Customer customer2 = (Customer) clazz.getConstructor(String.class).newInstance("민철");
        System.out.println(customer2);

    }
}

package Class클래스;
// Class : 클래스의 패키지이름이나 클래스이름 등의 정보를 가져 옴
public class ClassTestEx {
    public static void main(String[] args) {
        String s = new String();
        Class c = s.getClass();
        System.out.println(c);

        Person person = new Person();
        Class pCls = person.getClass();
        System.out.println(pCls.getSimpleName());
        System.out.println(pCls.getClass());
    }
}

class Person {

}

package 익명객체;

public class AnonymousEx {
    public static void main(String[] args) {
        Parent parent = new Child();
        parent.methodParent();

    }
}
class Parent {
    String name = "Parent Class";
    void methodParent() {
        System.out.println("Parent method : " + this.name);
    }
}
class Child extends Parent {
    String name = "Child Class";
    @Override
    void methodParent() {
        System.out.println("class name(Child) : " + this.name);
        System.out.println("class name(Parent) : " + super.name);

    }
}


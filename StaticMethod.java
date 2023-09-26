package ex04;

class A {
    //instance method
    void abc() {
        System.out.println("instance method");
    }
    //static method
    static void bcd() {
        System.out.println("static method");
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        //인스턴스 메서드 활용 - 반드시 객체를 만들어서 활용
        A a1 = new A();
        a1.abc();

        //static 메서드 활용 - 클래스 명으로 바로 접근 가능
        A.bcd();

        //static 메서드 활용 - 객체를 생성하는 방식은 권장하지 않음
        A a2 = new A();
        a2.bcd();


    }
}

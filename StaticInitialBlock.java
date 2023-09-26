package ex05;

class A {
    int a;
    static int b;
    //생성자(생성자는 주로 인스턴스 필드를 초기화 함)
    A(int a) {
        this.a=a;

    }
    //static 블록 안에서 static 필드를 초기화 해줌
    static {
        b=7;
    }
}

public class StaticInitialBlock {
    public static void main(String[] args) {
        A a1 = new A(4); //A->생성자임
        System.out.println(a1.a);
        System.out.println(A.b);
    }
}
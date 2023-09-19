package ch09;

class A {
    int m;
    int n;
    void init(int m, int n) {
        this.m=m;
        this.n=n;
    }
}
public class ThisKeyword {
    public static void main(String[] args) {
        A a = new A(); //A클래스의 객체 생성
        a.init(2,3);

        System.out.println(a.m);
        System.out.println(a.n);
    }
}

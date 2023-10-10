package ex02;

class A {}
class B extends A {}
class C extends B {}
class D extends B {}

public class Polymorphism {
    public static void main(String[] args) {
        //A가 될 수 있느냐?
        A a1 = new A(); //A는 A이다.(O)
        A a2 = new B(); //B는 A이다.(O)
        A a3 = new C(); //C는 A이다.(O)
        A a4 = new D(); //D는 A이다.(O)
        //B가 될 수 있느냐?
        //B a1 = new A(); //A는 B이다.(X)
        B a2 = new B(); //B는 B이다.(O)
        B a2 = new C(); //C는 B이다.(O)
        B a2 = new D(); //D는 B이다.(O)
        //C가 될 수 있느냐?
        //C a1 = new A(); //A는 C이다.(X)
        //C a2 = new B(); //B는 C이다.(X)
        C a3 = new C(); //C는 C이다.(O)
        //C a4 = new D(); //D는 C이다.(X)
        //D가 될 수 있느냐?
        //D +a1 = new A(); //A는 D이다.(X)
        // -D a2 = new B(); //B는 D이다.(X)
        //D a3 = new C(); //C는 D이다.(X)
        D a4 = new D(); //D는 D이다.(O)
    }
}

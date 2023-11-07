package ex03;

//인터페이스는 구현 안된 다양한 기능의 집합.
interface A {
  void abc();
  void bcd();
}

class B implements A {
  @Override
  public void abc() {
    System.out.println("B클래스의 abc()");
  }
}

class C implements A {
  @Override
  public void abc() {
    System.out.println("C클래스의 abc()");
  }
}

public class DefaultMethod {
  public static void main(String[] args) {
    A a1 = new B();
    A a2 = new C();

    a1.abc();
    a1.bcd(); //bcd는 부모가 준 디폴트 메서드이다.
    a2.bcd();
    a2.abc();
  }
}

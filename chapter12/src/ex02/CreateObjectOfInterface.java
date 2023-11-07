package ex02;

interface A {
  int a=3;
  void abc(); //추상메서드
}

//만약 클래스 B를 정의하는게 귀찮다면?
//B 정의하지 않고 바로 new 객체 만들 수는 없을까?
//class B implements A {
//  @Override
//  public void abc() {
//    System.out.println("B가 책임지고 오버라이딩했다.");
//  }
//}

public class CreateObjectOfInterface {
  public static void main(String[] args) {
    //A a1 = new A(); //인터페이스는 곧바로 new로 객체를 생성할 수 없다.
    //구체적인 놈만(class) new해서 객체를 생성할 수 있다.
    A a1= new A() {
      //익명 이너 클래스
      @Override
      public void abc() {
        System.out.println("그냥.. 클래스 하나 더 만들기 귀찮으니까" +
                "여기서 오버라이딩 할 수도 있다.");
      }
    };

    System.out.println(a1.a);
    a1.abc();
  }
}

package ex06;

class A {
  void abd() {
    try {
      bcd();
      //밑에 두 개 catch는 합치는 것이 좋다.
    } catch (ClassNotFoundException | InterruptedException e) {
      throw new RuntimeException(e);
    }
  }
  void bcd() throws ClassNotFoundException, InterruptedException {
    //한 메서드 안에 해결해야 할 예외 처리가 두 개나 있으면 보통 던진다.
    Class cls = Class.forName("java.lang.Object");
    Thread.sleep(1000);
  }
}

public class ThrowsException_2 {
}

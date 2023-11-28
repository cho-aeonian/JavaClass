package ex08;
//점수가 음수일 때의 예외
class MinusException extends Exception {
  public MinusException() {
    super();
  }
  public MinusException(String message) {
    super(message);
  }
}

//점수가 100점을 초과할 때의 예외
class OverException extends Exception {
  public OverException() {
    super();
  }
  public OverException(String message) {
    super(message);
  }
}

//A클래스를 만들어서 예외 두 개를 호출
class A {
  void checkScore(int score) {
    if (score < 0) {
      //Exception을 발동 시키는 문법->throw
      try {
        throw new MinusException("예외 발생: 음숫값 입력");
      } catch (MinusException e) {
        throw new RuntimeException(e);
      }
    } else if (score > 100) {
      try {
        throw new OverException("예외 발생: 100점 초과");
      } catch (OverException e) {
        throw new RuntimeException(e);
      }
    } else
      System.out.println("정상적인 값입니다.");
  }
}

public class UserExceptionExample {
  public static void main(String[] args) {
    A a = new A();
    try {
      a.checkScore(85);
      a.checkScore(150);
    } catch (MinusException | OverException e) {
      System.out.println(e.getMessage());
    }
    try {
      a.checkScore(-19);
    } catch (MinusException | OverException e) {
      System.out.println(e.getMessage());
    }
  }
}
